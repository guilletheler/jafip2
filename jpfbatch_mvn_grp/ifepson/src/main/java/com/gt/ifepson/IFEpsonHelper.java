/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson;

import com.google.common.reflect.ClassPath;
import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.ifepson.comandos.ComandoFiscal;
import com.gt.ifepson.comandos.MapaRetornos;
import com.gt.ifepson.comandos.ResultadoEjecucionComandoFiscal;
import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.enums.estadoFiscal.*;
import com.gt.ifepson.enums.estadoImpresor.*;
import com.sun.jna.Native;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guillermot
 */
public class IFEpsonHelper {

    final protected static char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    private static final int SIZE_BUFF_IN = 50 * 1024;
    private static final int SIZE_BUFF_OUT = 50 * 1024;

    static final List<TipoComandoFiscal> COMANDOS = new ArrayList<>();

    static final MapaRetornos MAPA_RETORNOS = new MapaRetornos();

    public static List<TipoComandoFiscal> getTiposComandos() {

        if (COMANDOS.isEmpty()) {

            final ClassLoader loader = Thread.currentThread().getContextClassLoader();

            try {
                for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
                    if (info.getName().startsWith("com.gt.ifepson.comandos.")) {
                        final Class<?> clazz = info.load();
                        if (clazz != TipoComandoFiscal.class && TipoComandoFiscal.class.isAssignableFrom(clazz)) {
                            try {
                                COMANDOS.add((TipoComandoFiscal) clazz.newInstance());
                            } catch (InstantiationException ex) {
                                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, null, ex);
                                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "No se puede instanciar la clase {0}", clazz.getName());
                            } catch (IllegalAccessException ex) {
                                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, null, ex);
                                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "No se puede instanciar (acceso) la clase {0}", clazz.getName());
                            }
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "que se yo");
            }

        }

        return COMANDOS;
    }

    public static MapaRetornos getMapaRetornos() {
        return MAPA_RETORNOS;
    }

    public static String getAyuda(String comando) {
        TipoComandoFiscal tipoComando = IFEpsonHelper.findComand(comando);
        if (tipoComando == null) {
            return "comando '" + comando + "' no reconocido";
        }
        return tipoComando.getAyuda();
    }

    public static String getAyuda() {
        StringBuilder sb = new StringBuilder();
        for (TipoComandoFiscal tc : IFEpsonHelper.getTiposComandos()) {
            sb.append(tc.getAyuda());
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public static EpsonFiscalDriverJNA newEpsonFiscalDriver() {
        return newEpsonFiscalDriver(null, (byte) 0);
    }

    /**
     *
     * @param logPath
     * @param logAction 0, sin log, 1 log con fecha, 2 log en temp.txt
     * @return
     */
    public static EpsonFiscalDriverJNA newEpsonFiscalDriver(String logPath, byte logAction) {
        EpsonFiscalDriverJNA epsonDriver = (EpsonFiscalDriverJNA) Native.loadLibrary("EpsonFiscalDriver", EpsonFiscalDriverJNA.class);

        byte[] Version = new byte[16];

        epsonDriver.GetAPIVersion(Version);
        String strVersion = new String(Version);
        Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.INFO, "EpsonFiscalDriver JNA GetApiVersion: {0}", strVersion);

        if (logPath == null || logPath.isEmpty()) {
            logPath = "./";
        }

        epsonDriver.SetLog(logPath, logAction);
        epsonDriver.setProtocolType(1);

        return epsonDriver;
    }

    public static int openPort(EpsonFiscalDriverJNA epsonDriver, int port, int baudRate) {
        epsonDriver.setComPort(port);
        epsonDriver.setBaudRate(baudRate);
        epsonDriver.OpenPort();

        int lastComError = epsonDriver.getLastError();

        if (lastComError == 0) {
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.INFO, "Se abrió el puerto: {0}", port);
        } else {
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, "OpenPort: " + port, new Exception("Error abriendo puerto"));
        }

        return lastComError;
    }

    public static int closePort(EpsonFiscalDriverJNA epsonDriver) {
        epsonDriver.ClosePort();
        while (epsonDriver.getState() == 2) {
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.INFO, "esperando se cierre el puerto");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.SEVERE, "Error en Thread.sleep", ex);
            }
        }

        return epsonDriver.getState();
    }

    public static List<String> traducirEstadoFiscal(int estadoFiscal) {

        List<String> ret = new ArrayList<>();

        ret.add("EstadoFiscalModoFunqEquipo: " + EstadoFiscalModoFunqEquipo.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalEstadoCertDigital: " + EstadoFiscalEstadoCertDigital.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalModoTecnico: " + EstadoFiscalModoTecnico.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalEstadoMemoriaFiscal: " + EstadoFiscalEstadoMemoriaFiscal.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalEstadoMemoriaTransacciones: " + EstadoFiscalEstadoMemoriaTransacciones.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalJornadaFiscal: " + EstadoFiscalJornadaFiscal.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalSubestados: " + EstadoFiscalSubestados.parseEstado(estadoFiscal));
        ret.add("EstadoFiscalDocumentoEnProgreso: " + EstadoFiscalDocumentoEnProgreso.parseEstado(estadoFiscal));

        return ret;
    }

    public static List<String> traducirEstadoImpresora(int estadoFiscal) {

        List<String> ret = new ArrayList<>();

        ret.add("EstadoImpresor: " + EstadoImpresor.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorError: " + EstadoImpresorError.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorTapa: " + EstadoImpresorTapa.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorEstacion: " + EstadoImpresorEstacion.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorSlipValidaSensorEsperaCargaRemocion: " + EstadoImpresorSlipValidaSensorEsperaCargaRemocion.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorSlipValidaSensorEsperaCargaRemocion: " + EstadoImpresorSlipValidaSensorEsperaCargaRemocion.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorSlipIniCarga: " + EstadoImpresorSlipIniCarga.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorSlipFinCarga: " + EstadoImpresorSlipFinCarga.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorSlipValida: " + EstadoImpresorSlipValida.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorJournal: " + EstadoImpresorJournal.parseEstado(estadoFiscal));
        ret.add("EstadoImpresorReceipt: " + EstadoImpresorReceipt.parseEstado(estadoFiscal));

        return ret;
    }

    private static TipoComandoFiscal findComand(String comando) {
        for (TipoComandoFiscal tcf : IFEpsonHelper.getTiposComandos()) {
            for (String nombreComando : tcf.getNames()) {
                if (nombreComando.equalsIgnoreCase(comando)) {
                    return tcf;
                }
            }
        }

        return null;
    }

    /**
     * Devuelve ResultadoEjecucionComandoFiscal con el resultado de la ejecución
     *
     * @param epsonDriver
     * @param comando
     * @return
     */
    public static ResultadoEjecucionComandoFiscal ejecutarComando(EpsonFiscalDriverJNA epsonDriver, ComandoFiscal comando) {

        byte[] bufferIn = new byte[SIZE_BUFF_IN];
        byte[] bufferOut = new byte[SIZE_BUFF_OUT];
        int[] sizeBufferIn = new int[8];
        int[] sizeBufferOut = new int[8];

        byte[] szCommand = new byte[8];
        byte[] szExtension = new byte[8];
        int iSize = 2;

        comando.setValoresCampoSalida(null);

        epsonDriver.Purge();

        szCommand[0] = (byte) comando.getTipoComando().getComando()[0];
        szCommand[1] = (byte) comando.getTipoComando().getComando()[1];

        int[] ext = comando.getExtensiones();

        szExtension[0] = (byte) ext[0];
        szExtension[1] = (byte) ext[1];

        epsonDriver.AddDataField(szCommand, iSize);
        epsonDriver.AddDataField(szExtension, iSize);

        List<TipoCampoFiscal> campos = Arrays.asList(comando.getTipoComando().getCamposEntrada());

        Collections.sort(campos, new Comparator<TipoCampoFiscal>() {
            @Override
            public int compare(TipoCampoFiscal o1, TipoCampoFiscal o2) {
                return ((Integer) o1.getIndice()).compareTo(((Integer) o2.getIndice()));
            }
        });

        for (TipoCampoFiscal tc : campos) {
            String valorCampoEntrada = comando.getValoresCampoEntrada().get(tc);

            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "Seteando valor " + tc.getIndice() + ":" + tc.getDescripcion() + " = " + valorCampoEntrada);

            byte[] valor;
            if (valorCampoEntrada != null) {
                valor = valorCampoEntrada.getBytes();
            } else {
                valor = new byte[]{};
            }

            epsonDriver.AddDataField(valor, valor.length);
        }

        epsonDriver.SendCommand();

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComandoFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //TODO: esperar un rato y despué zapatear
        while (epsonDriver.getState() == 2) {
            Logger.getLogger(ComandoFiscal.class.getName()).log(Level.FINE, "Esperando termine comando fiscal");
            //System.out.println("Esperando termine");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComandoFiscal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //epsonDriver.SendCommandComplete("0502|0000");
        int lastCom = epsonDriver.getLastError();

        if (lastCom == 0) {
            int counterField = epsonDriver.getExtraFieldCount();

            int fiscalStatus = epsonDriver.getFiscalStatus();
            int printerStatus = epsonDriver.getPrinterStatus();
            int returnCode = epsonDriver.getReturnCode();

            //System.out.println("El comando devolvio campos : " + counterField);
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "PrinterStatus: " + printerStatus);
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "FiscalStatus: " + fiscalStatus);
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "ReturnCode: " + Integer.toHexString(returnCode));

            if (returnCode != 0) {
                Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "{0} {1}", new Object[]{IFEpsonHelper.getMapaRetornos().get(returnCode).getCodigo(), IFEpsonHelper.getMapaRetornos().get(returnCode).getDescripcion()});
            }

            campos = Arrays.asList(comando.getTipoComando().getCamposSalida());

            Collections.sort(campos, new Comparator<TipoCampoFiscal>() {
                @Override
                public int compare(TipoCampoFiscal o1, TipoCampoFiscal o2) {
                    return ((Integer) o1.getIndice()).compareTo(((Integer) o2.getIndice()));
                }
            });

            for (int fieldNumber = 1; fieldNumber <= counterField; fieldNumber++) {
                bufferOut = new byte[SIZE_BUFF_OUT];
                sizeBufferOut = new int[8];
                int largoBuffer;

                epsonDriver.GetExtraField(fieldNumber, bufferOut, SIZE_BUFF_OUT, sizeBufferOut);

                largoBuffer = sizeBufferOut[0];
                TipoCampoFiscal tipoCampo = campos.get(fieldNumber - 1);

                //System.out.println("Obteniendo campo " + fieldNumber + " largo " + largoBuffer);
                byte[] bExtraField = Arrays.copyOfRange(bufferOut, 0, largoBuffer);

                if (bExtraField.length > 0) {
                    String strExtraField = new String(bExtraField);
                    comando.getValoresCampoSalida().put(tipoCampo, strExtraField);

                    //Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, "GetExtraField " + fieldNumber + " : " + strExtraField);
                    //System.out.println("GetExtraField " + fieldNumber + " : " + strExtraField);
                } else {
                    //System.out.println("GetExtraField " + fieldNumber + " : NULL (vacio)");
                    comando.getValoresCampoSalida().put(tipoCampo, "");
                }
            }

            epsonDriver.GetSentFrame(bufferIn, SIZE_BUFF_IN, sizeBufferIn);
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, bytesToHex(bufferIn, sizeBufferIn[0]));
            //System.out.println("SentFrame: " + bytesToHex(bufferIn, sizeBufferIn[0]));
            epsonDriver.GetReceivedFrame(bufferOut, SIZE_BUFF_OUT, sizeBufferOut);
            Logger.getLogger(IFEpsonHelper.class.getName()).log(Level.FINE, bytesToHex(bufferOut, sizeBufferOut[0]));
            //System.out.println("ReceivedFrame: " + bytesToHex(bufferOut, sizeBufferOut[0]));

            return new ResultadoEjecucionComandoFiscal(comando, new int[]{lastCom, printerStatus, fiscalStatus, returnCode});
        }

        return new ResultadoEjecucionComandoFiscal(comando, new int[]{lastCom, 0, 0, 0});
    }

    public static String bytesToHex(byte[] bytes, int Size) {
        char[] hexChars = new char[Size * 2];
        for (int j = 0; j < Size; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
