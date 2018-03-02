/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.fiscalSpool;

import com.gt.jpfbatch.fiscalSpool.impresores.IImpresor;
import com.gt.ifepson.IFEpsonHelper;
import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.ifepson.comandos.ComandoFiscal;
import com.gt.ifepson.comandos.ResultadoEjecucionComandoFiscal;
import com.gt.ifepson.comandos.Retorno;
import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ValorExtension;
import com.gt.jpfbatch.JpfbatchConfigs;
import com.gt.jpfbatch.fiscalSpool.impresores.ImpresorFiscal;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author John Doe
 */
public class BatchExecutor {

    BatchPojo batchPojo;

    List<ComandoFiscal> comandos;

    boolean compilado = false;

    public BatchExecutor(BatchPojo batchPojo) {
        this.batchPojo = batchPojo;
    }

    public void compilar() {
        comandos = new ArrayList<>();
        for (String linea : batchPojo.batch.split("\n")) {
            if (linea == null || linea.trim().isEmpty() || linea.trim().startsWith("//") || linea.trim().startsWith("#")) {
                continue;
            }
            try {
                ComandoFiscal comando = this.compilarLinea(linea);
                if (comando == null) {
                    Logger.getLogger(BatchExecutor.class.getName()).log(Level.WARNING, "{0} no se reconoce como comando", linea);
                } else {
                    comandos.add(comando);
                }
            } catch (ComandoFiscalParseException ex) {
                if (this.batchPojo.errores == null) {
                    this.batchPojo.errores = "";
                }
                if (!this.batchPojo.errores.isEmpty()) {
                    this.batchPojo.errores += "\n";
                }
                this.batchPojo.errores = "Error al compilar comando " + linea;
                Logger.getLogger(BatchExecutor.class.getName()).log(Level.WARNING, "Error al compilar comando {0}", linea);
            }
        }
        compilado = true;
    }

    /**
     * Compila una linea <br>
     * el formato es:<br>
     * COMANDO([EXTENSION1[|EXTENSIONn]]<br>
     * tener en cuenta que en el formato se usa | de separador pero puede ser
     * otro
     *
     * @param linea
     * @return
     */
    public ComandoFiscal compilarLinea(String linea) throws ComandoFiscalParseException {

        if (linea == null || linea.trim().isEmpty() || linea.trim().startsWith("//") || linea.trim().startsWith("#")) {
            return null;
        }

        String pattern = "^([a-zA-Z\\d_]+)\\(((<<SEPARADOR>>?[^<<SEPARADOR>>]+)*)\\)((<<SEPARADOR>>?[^<<SEPARADOR>>]*)*)$";

        String sep = this.batchPojo.getSeparador();

        if (sep.equals("|")) {
            sep = "\\|";
        }

        pattern = pattern.replace("<<SEPARADOR>>", sep);

        //Logger.getLogger(BatchExecutor.class.getName()).log(Level.INFO, "pattern " + pattern);
        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher(linea);

        if (matcher.matches()) {

            String comando = matcher.group(1);

            String extension = matcher.group(2);
            String parametro = matcher.group(4);

            String[] extensiones;

            if (!extension.trim().isEmpty()) {
                extensiones = matcher.group(2).split(sep);
            } else {
                extensiones = new String[]{};
            }

            String[] camposEntrada;

            if (!parametro.trim().isEmpty()) {
                camposEntrada = matcher.group(4).split(sep);
            } else {
                camposEntrada = new String[]{};
            }

            TipoComandoFiscal tcf = null;

            Logger.getLogger(getClass().getName()).log(Level.FINE, "Buscando comando " + comando + " con extensiones [" + Arrays.toString(extensiones) + "] parametros [" + Arrays.toString(camposEntrada) + "]");

            for (TipoComandoFiscal tc : IFEpsonHelper.getTiposComandos()) {
                for (String nombre : tc.getNames()) {
                    if (nombre.trim().equalsIgnoreCase(comando.trim())) {
                        tcf = tc;
                        break;
                    }
                }
            }

            if (tcf == null) {
                throw new ComandoFiscalParseException("No se reconoce el comando " + comando + " como valido");
            }

            Logger.getLogger(getClass().getName()).log(Level.FINE, "Se encontró comando " + tcf.getNames()[0]);

            ComandoFiscal ret = new ComandoFiscal(tcf);

            for (String ext : extensiones) {
                ret.addExtension(ext);
            }

            int pos = 1;
            for (String campoEntrada : camposEntrada) {
                //System.out.println("Seteando campo " + pos + " = '" + campoEntrada.trim() + "'");
                ret.setValorCampoEntrada(pos++, campoEntrada.trim());
            }

            return ret;
        }

        throw new ComandoFiscalParseException("No se reconoce el comando de la linea " + linea);
    }

    /**
     *
     * @param configs
     */
    public void ejecutar(JpfbatchConfigs configs) {

        
        if (!compilado) {
            this.compilar();
        }

        if (this.batchPojo != null && !this.batchPojo.getErrores().isEmpty()) {
            return;
        }
        
        IImpresor impresor = new ImpresorFiscal();

        EpsonFiscalDriverJNA epsonDriver = IFEpsonHelper.newEpsonFiscalDriver();

        int port = configs.getSerialPort();

        int ret = IFEpsonHelper.openPort(epsonDriver, port, configs.getBaudRate());

        if (ret != 0) {
            throw new RuntimeException("No se puede abrir el puerto del controlador fiscal");
        }

        ((ImpresorFiscal) impresor).setEpsonDriver(epsonDriver);

        if (impresor == null) {
            throw new RuntimeException("El impresor fiscal es nulo");
        }

        if (impresor.getState() != 1) {
            throw new RuntimeException("El driver fiscal no está conectado al controlador");
        }

        StringBuilder sb = new StringBuilder();

        for (ComandoFiscal comandoFiscal : comandos) {
            try {
                appendComandoToString(comandoFiscal, sb);

                EjecutorRunnable ejecutor = new EjecutorRunnable(impresor, comandoFiscal);
                Thread ejecutorThread = new Thread(ejecutor);

                Date inicio = new Date();
                ejecutorThread.start();

                while (ejecutorThread.isAlive() && (new Date().getTime() - inicio.getTime()) < batchPojo.getTotalTimeOut()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {

                    }
                    //System.out.println("Esperando termine " + comandoFiscal.getTipoComando().getNames()[0] + " " + (new Date().getTime() - inicio.getTime()) + " < 5000");
                }

                if (ejecutor.getResultado() != null) {
                    ResultadoEjecucionComandoFiscal ejecutar = ejecutor.getResultado();
                    this.appendRersultado(ejecutar, sb);
                } else {
                    String pos = StringUtils.leftPad(this.getComandos().indexOf(comandoFiscal) + "", 3, "0");
                    Logger.getLogger(BatchExecutor.class.getName()).log(Level.SEVERE, "Tiempo de espera agotado al ejecutar comando [{0}] {1}", new Object[]{pos, comandoFiscal.getTipoComando().getNames()[0]});
                    sb.append("[").append(pos).append("]");
                    sb.append("ERROR: Tiempo de espera agotado\n");
                    System.out.println("ERROR: Tiempo de espera agotado");
                }
                //System.out.println(sb.toString());
            } catch (Exception ex) {
                String com = "null";
                if (comandoFiscal != null) {
                    com = comandoFiscal.getTipoComando().toString();
                }
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "ERROR DESCONOCIDO EJECUTANDO " + com, ex);
                sb.append("ERROR DESCONOCIDO EJECUTANDO Err: ").append(ex.getLocalizedMessage());
                sb.append("\n");
            }
        }

        this.batchPojo.setResultado(sb.toString());

        impresor.finalizar();
    }

    private void appendRersultado(ResultadoEjecucionComandoFiscal resu, StringBuilder sb) {

        String pos = "[" + StringUtils.leftPad(this.getComandos().indexOf(resu.getComandoFiscal()) + "", 3, "0") + "]";

        sb.append(pos);
        sb.append("LastComError:").append(resu.getRawReturn()[0] + "");
        sb.append("\n");
        sb.append(pos);
        sb.append("EstadoImpresor:");
        boolean primero = true;
        for (String s : IFEpsonHelper.traducirEstadoImpresora(resu.getRawReturn()[1])) {
            if (!primero) {
                sb.append(batchPojo.getSeparador().replace("\\", ""));
            }
            sb.append(s);
            primero = false;
        }

        sb.append("\n");
        sb.append(pos);
        primero = true;
        for (String s : IFEpsonHelper.traducirEstadoFiscal(resu.getRawReturn()[2])) {
            if (!primero) {
                sb.append(batchPojo.getSeparador().replace("\\", ""));
            }
            sb.append(s);
            primero = false;
        }

        sb.append("\n");
        if (resu.getRawReturn()[3] != 0) {
            Retorno retorno = IFEpsonHelper.getMapaRetornos().get(resu.getRawReturn()[3]);
            sb.append(pos);

            String value = "";
            try {
                byte[] ptext = retorno.getDescripcion().getBytes("UTF-8");
                value = new String(ptext, batchPojo.getCharset());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(BatchExecutor.class.getName()).log(Level.SEVERE, null, ex);
            }

            sb.append("RetornoComando: ").append(retorno.getTipoRespuesta()).append(" cod: ").append(retorno.getCodigo().toString()).append(" - ").append(value);
            sb.append("\n");
        }

        sb.append(pos);
        sb.append("Retorno ").append(resu.getComandoFiscal().getTipoComando().getNames()[0]).append(": ");

        TipoCampoFiscal[] campos = resu.getComandoFiscal().getTipoComando().getCamposSalida();
        Arrays.sort(campos, new Comparator<TipoCampoFiscal>() {
            @Override
            public int compare(TipoCampoFiscal o1, TipoCampoFiscal o2) {
                return ((Integer) o1.getIndice()).compareTo(((Integer) o2.getIndice()));
            }
        });

        primero = true;
        for (TipoCampoFiscal tcf : campos) {

            String valor = resu.getComandoFiscal().getValoresCampoSalida().get(tcf);
            if (valor == null) {
                valor = "";
            }

            if (!primero) {
                sb.append(batchPojo.getSeparador().replace("\\", ""));
            }

            sb.append(valor);
            primero = false;
        }

        sb.append("\n");
    }

    private void appendComandoToString(ComandoFiscal comandoFiscal, StringBuilder sb) {

        String pos = "[" + StringUtils.leftPad(this.getComandos().indexOf(comandoFiscal) + "", 3, "0") + "]";

        sb.append(pos);
        sb.append(comandoFiscal.getTipoComando().getNames()[0]).append("(");

        boolean primero = true;
        for (ValorExtension ve : comandoFiscal.getValoresExtensiones()) {
            if (!primero) {
                sb.append(batchPojo.getSeparador().replace("\\", ""));
            }
            sb.append(ve.getNombre());
            primero = false;
        }

        sb.append(")");

        primero = true;

        TipoCampoFiscal[] campos = comandoFiscal.getValoresCampoEntrada().keySet().toArray(new TipoCampoFiscal[]{});

        Arrays.sort(campos, new Comparator<TipoCampoFiscal>() {
            @Override
            public int compare(TipoCampoFiscal o1, TipoCampoFiscal o2) {
                return ((Integer) o1.getIndice()).compareTo(((Integer) o2.getIndice()));
            }
        });

        for (TipoCampoFiscal tcf : campos) {
            String valor = comandoFiscal.getValoresCampoEntrada().get(tcf);
            if (valor == null) {
                valor = "";
            }

            sb.append(batchPojo.getSeparador().replace("\\", ""));

            sb.append(valor);
        }

        sb.append("\n");
    }

    public BatchPojo getBatchPojo() {
        return batchPojo;
    }

    public void setBatchPojo(BatchPojo batchPojo) {
        this.batchPojo = batchPojo;
        compilado = false;
    }

    public List<ComandoFiscal> getComandos() {
        return comandos;
    }

    public void setComandos(List<ComandoFiscal> comandos) {
        this.comandos = comandos;
    }

    class EjecutorRunnable implements Runnable {

        IImpresor impresor;
        ComandoFiscal comandoFiscal;
        ResultadoEjecucionComandoFiscal resultado;

        public EjecutorRunnable(IImpresor impresor, ComandoFiscal comandoFiscal) {
            this.impresor = impresor;
            this.comandoFiscal = comandoFiscal;
        }

        @Override
        public void run() {
            resultado = impresor.ejecutarComando(comandoFiscal);
        }

        public ResultadoEjecucionComandoFiscal getResultado() {
            return resultado;
        }

    }

}
