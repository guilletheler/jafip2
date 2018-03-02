/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch;

import com.beust.jcommander.Parameter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Doe
 */
public class JpfbatchConfigs implements Serializable {

    @Parameter(names = {"--serialPort", "--serialPortName", "-p"}, description = "Numero del puerto serie, 0=USB/ttyUSBx, 1=COM1/ttyS0, 2=COM2/ttyS1, n=COMn/ttySn (default COM1)")
    private Integer serialPort = 0;

    @Parameter(names = {"--help", "-h"}, help = true, description = "Muestra esta ayuda")
    private boolean help;
    
    @Parameter(names = {"--fiscalHelp"}, help = true, description = "Muestra esta ayuda")
    private boolean fiscalHelp;
    
    @Parameter(names = {"--copiaComandoEnSalida", "-k"}, description = "Copia la linea de comando antes del resultado en el archivo de salida")
    private boolean copiaComandoEnSalida = true;

    /**
     * Serial Port Baudrate
     */
    @Parameter(names = {"--baudRate", "--baudios", "-b"}, description = "Velocidad de conexión (default 9600)")
    protected Integer baudRate = 115200;

    /**
     * Puerto TCP para cliente/servidor
     */
    @Parameter(names = {"--tcpPort", "-t"}, description = "Puerto TCP para cliente/servidor (default 6932)")
    protected Integer tcpPort = 6932;

    @Parameter(names = {"--modo", "-m"}, description = "Modo de funcionamiento, 0=standalone (TCP lock), 1=standalone (directo sin lock), 2=Iniciar Servidor, 3=Cliente, 4=Parar Servidor")
    protected Integer modo = 0;
    
    @Parameter(names = {"--modoImpresor", "-q"}, description = "Cuando no tenemos impresor fiscal se usa para probar, 0 - impresor fiscal, 1 - esc/pos, 2 - raw, 3 - PDF")
    protected Integer modoImpresor = 0;
    
    @Parameter(names = {"--nombreImpresora", "-d"}, description = "en caso que se use una impresora de prueba el nomre o el nombre de archivo en caso de ser PDF")
    protected String nombreImpresora = "";

    @Parameter(names = {"--hostName", "-n"}, description = "Nombre o IP del servidor")
    protected String hostName = "localhost";

    @Parameter(names = {"--copyInFile", "-c"}, description = "Copia de archivo de entrada, Para identificar cada archivo se reemplazara %t% por Calendar.getInstance().getTime().getTime() que es la cantidad de millisegundos que transcurrieron desde el 01/01/1970, 00:00:00 GMT, ej entrada%t%.in")
    protected String copyInFile = "";

    @Parameter(names = {"--sep", "-s"}, description = "Separador de los campos")
    protected String sep = "\\|";

    @Parameter(names = {"--outExt", "-e"}, description = "extensión del archivo de salida")
    protected String outExt = ".out";
    
    @Parameter(names = {"--EncabezadoPrueba", "-a"}, description = "Lineas de encabezado a utilizar en las pruebas, las lineas se separan con el caracter separadorS")
    protected String encabezadoPrueba = "";

    @Parameter(names = {"--in", "--inFile", "-i"}, description = "archivo batch de entrada")
    protected String inFile = "";

    @Parameter(names = {"--out", "--outFile", "-o"}, description = "archivo de salida")
    protected String outFile = "";
    
    @Parameter(names = {"--Charset"}, description = "Codificacion de caracteres, por defecto \"UTF-8\"")
    protected String charset = "UTF-8";
    
    public JpfbatchConfigs() {
    }

    public boolean isHelp() {
        return help;
    }
    
    public void setHelp(boolean help) {
        this.help = help;
    }
    
    public boolean isFiscalHelp() {
        return fiscalHelp;
    }

    public void setFiscalHelp(boolean fiscalHelp) {
        this.fiscalHelp = fiscalHelp;
    }
    
    public Integer getSerialPort() {
        return serialPort;
    }

    public void setSerialPort(Integer serialPort) {
        this.serialPort = serialPort;
    }

    public Integer getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(Integer baudRate) {
        this.baudRate = baudRate;
    }

    public Integer getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(Integer tcpPort) {
        this.tcpPort = tcpPort;
    }

    public Integer getModo() {
        return modo;
    }

    public void setModo(Integer modo) {
        this.modo = modo;
    }

    public Integer getModoImpresor() {
        return modoImpresor;
    }

    public void setModoImpresor(Integer modoImpresor) {
        this.modoImpresor = modoImpresor;
    }
    
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getCopyInFile() {
        return copyInFile;
    }

    public void setCopyInFile(String copyInFile) {
        this.copyInFile = copyInFile;
    }

    public String getSep() {
        return sep;
    }

    public void setSep(String sep) {
        this.sep = sep;
    }

    public String getOutExt() {
        return outExt;
    }

    public void setOutExt(String outExt) {
        this.outExt = outExt;
    }

    public String getInFile() {
        return inFile;
    }

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    public String getOutFile() {
        return outFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }

    public boolean isCopiaComandoEnSalida() {
        return copiaComandoEnSalida;
    }

    public void setCopiaComandoEnSalida(boolean copiaComandoEnSalida) {
        this.copiaComandoEnSalida = copiaComandoEnSalida;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(String nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }

    public String getEncabezadoPrueba() {
        return encabezadoPrueba;
    }

    public void setEncabezadoPrueba(String encabezadoPrueba) {
        this.encabezadoPrueba = encabezadoPrueba;
    }

}
