/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.net.server;

import com.gt.ifepson.IFEpsonHelper;
import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.jpfbatch.JpfbatchConfigs;
import com.gt.jpfbatch.fiscalSpool.BatchExecutor;
import com.gt.jpfbatch.fiscalSpool.BatchPojo;
import com.gt.jpfbatch.fiscalSpool.impresores.IImpresor;
import com.gt.jpfbatch.fiscalSpool.impresores.ImpresorFiscal;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John Doe
 */
public class TCPServer implements Runnable {

    ConcurrentLinkedQueue<ClientThread> clientes = new ConcurrentLinkedQueue<>();
    static int timeOut = 1000;

    ServerSocket serverSocket = null;

    static TCPServer instance = null;

    ConcurrentStack estados = new ConcurrentStack();

    Timer garbageCollector = new Timer();

    JpfbatchConfigs configs;

    TimerTask garbageCollectorTask = new TimerTask() {

        @Override
        public void run() {
            TCPServer.instance.recolectar();
        }
    };

    public TCPServer(JpfbatchConfigs configs) {
        this.configs = configs;
    }

    public boolean recolectar() {
        List<ClientThread> terminatedThreads = new ArrayList<>();

        for (ClientThread ct : clientes) {
            if (!ct.isAlive()) {
                terminatedThreads.add(ct);
            }
        }

        clientes.removeAll(terminatedThreads);

        return terminatedThreads.isEmpty();
    }

    public static int getTimeOut() {
        return timeOut;
    }

    public static void setTimeOut(int timeOut) {
        TCPServer.timeOut = timeOut;
    }

    BatchPojo ejecutar(BatchPojo batchPojo) throws IOException {

        synchronized (TCPServer.class) {
            //return Main.EjecutarBatchFromString(evt.getBatchString(), evt.getTimeOut(), evt.getPortConfig(), evt.isTestMode());
            //throw new RuntimeException("NO IMPLEMENTADO");

            BatchExecutor be = new BatchExecutor(batchPojo);

            try {
//                IImpresor impresor = null;
//
//                Logger.getLogger(TCPServer.class.getName()).log(Level.INFO, "Creando impresor modo {0} puerto {1}", new Object[] {configs.getModoImpresor(), configs.getSerialPort()});

//                switch (configs.getModoImpresor()) {
//
//                    case 0:
//                    case 1:
//                        impresor = new ImpresorFiscal();
//
//                        EpsonFiscalDriverJNA epsonDriver = IFEpsonHelper.newEpsonFiscalDriver();
//
//                        int port = configs.getSerialPort();
//
//                        int ret = IFEpsonHelper.openPort(epsonDriver, port, configs.getBaudRate());
//
//                        if (ret != 0) {
//                            throw new RuntimeException("No se puede abrir el puerto del controlador fiscal");
//                        }
//
//                        ((ImpresorFiscal) impresor).setEpsonDriver(epsonDriver);
//                        break;
//
//                }
//
//                if (impresor == null) {
//                    throw new RuntimeException("Modo impresor no reconocido");
//                }

                be.ejecutar(configs);

                
            } catch (Exception ex) {
                Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, "Error ejecutando ", ex);
                if(be.getBatchPojo() == null) {
                    be.setBatchPojo(new BatchPojo());
                }
                
                be.getBatchPojo().setErrores("ERROR DESCONOCIDO EJECUTANDO EN TCPSERVER");
            }

            return be.getBatchPojo();
        }
    }

    private void internalDetener() {
        estados.add("DETENER");

        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();

            }
        } catch (IOException ex) {
            Logger.getLogger(TCPServer.class
                    .getName()).log(Level.SEVERE, "Error de entrada salida al cerrar el socket", ex);
        }
        serverSocket = null;
    }

    public static void detener() {
        Logger.getLogger(TCPServer.class
                .getName()).log(Level.INFO, "Solicitud de detención recibida");
        if (TCPServer.instance != null) {
            TCPServer.instance.internalDetener();
        }
    }

    public static void stop() {
        detener();
    }

    private boolean internalIsListen() {
        return Objects.equals(estados.peek(), "ESCUCHANDO");
    }

    public static void start(JpfbatchConfigs configs) {
        listen(configs);
    }

    public static boolean listen(JpfbatchConfigs configs) {

        Logger.getLogger(TCPServer.class
                .getName()).log(Level.INFO, "Iniciando servidor");

        if (TCPServer.instance == null) {
            Logger.getLogger(TCPServer.class
                    .getName()).log(Level.INFO, "No hay instancia TCPServer, creando nueva puerto {0} baudios {1}", new Object[]{configs.getSerialPort(), configs.getBaudRate()});
            TCPServer.instance = new TCPServer(configs);

        }

        if (!TCPServer.instance.internalIsListen()) {

            Logger.getLogger(TCPServer.class
                    .getName()).log(Level.INFO, "Iniciando");

            TCPServer.instance.estados.add("INICIANDO");
            Thread t = new Thread(TCPServer.instance);

            t.start();

            while (Objects.equals(TCPServer.instance.estados.peek(), ("INICIANDO"))) {
                //espero que se inicie
            }

            Logger.getLogger(TCPServer.class
                    .getName()).log(Level.INFO, "Inicio finalizado {0}", TCPServer.instance.internalIsListen() ? "correctamente" : "con error");

            return TCPServer.instance.internalIsListen();

        }

        Logger.getLogger(TCPServer.class
                .getName()).log(Level.INFO, "Resultado de la orden de inicio, escuchando = {0}", TCPServer.instance.internalIsListen());

        return false;
    }

    public static boolean isListen() {
        return TCPServer.instance != null && TCPServer.instance.internalIsListen();
    }

    @Override
    public void run() {

        if (configs == null) {
            throw new RuntimeException("La configuracion es nula");
        }

        try {
            Integer port = this.configs.getTcpPort();

            if (port == null || port <= 0) {
                port = 6932;
            }

            serverSocket = new ServerSocket(port);

        } catch (java.net.BindException ex) {
            Logger.getLogger(TCPServer.class
                    .getName()).log(Level.WARNING, "Error puerto abierto", ex);
            this.estados.add("ERROR PUERTO ABIERTO");
            return;
        } catch (IOException ex) {
            this.estados.add("ERROR IO");
            Logger
                    .getLogger(TCPServer.class
                            .getName()).log(Level.SEVERE, "Error de entrada salida al intentar escuchar", ex);
            return;
        }

        Socket clientSocket = null;

        this.estados.add("ESCUCHANDO");

        garbageCollector.schedule(garbageCollectorTask, 10000, 10000);

        while (this.estados.peek().equals("ESCUCHANDO")) {

            try {

                try {
                    clientSocket = serverSocket.accept();
                } catch (java.net.SocketException socket_ex) {
                    if (Objects.equals(estados.peek(), "DETENER")) {
                        break;
                    } else {
                        throw socket_ex;
                    }
                }

                if (clientSocket != null && !serverSocket.isClosed()) {

                    ClientThread ct = new ClientThread(clientSocket, "cliente" + clientes.size(), configs);

                    clientes.add(ct);

                    ct.addEventListener(new JPFBNetEventListener() {
                        @Override
                        public BatchPojo onEjecutar(BatchPojo batchPojo) {
                            BatchPojo retVal = null;

                            if (batchPojo.getStopServer()) {
                                TCPServer.stop();
                                retVal = batchPojo;
                            } else {

                                try {
                                    retVal = ejecutar(batchPojo);

                                } catch (IOException ex) {
                                    Logger.getLogger(TCPServer.class
                                            .getName()).log(Level.SEVERE, "Error de entrada salida al ejecutar", ex);
                                }
                            }

                            return retVal;
                        }

                    });

                    ct.start();
                }
            } catch (IOException ex) {
                this.estados.add("ERROR ");
                Logger
                        .getLogger(TCPServer.class
                                .getName()).log(Level.SEVERE, "Error de ebtrada salida al intentar escuchar", ex);
            }

        }

        garbageCollector.cancel();

        while (!this.recolectar()) {
            // espera que terminen todas las ejecucuciones
        }

        estados.add("DETENIDO");

        Logger
                .getLogger(TCPServer.class
                        .getName()).log(Level.INFO, "Servidor detenido");
    }
}
