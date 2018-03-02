/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.fiscalSpool;

import java.io.Serializable;

/**
 *
 * @author John Doe
 */
public class BatchPojo implements Serializable {
    
    String batch;
    
    String separador;
    
    String resultado;
        
    String errores;
    
    int totalTimeOut = 10000;
    
    String charset;
    
    Boolean stopServer;

    public BatchPojo() {
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public String getResultado() {
        if(resultado == null) {
            resultado = "";
        }
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getErrores() {
        if(errores == null) {
            errores = "";
        }
        return errores;
    }

    public void setErrores(String errores) {
        this.errores = errores;
    }

    public int getTotalTimeOut() {
        return totalTimeOut;
    }

    public void setTotalTimeOut(int totalTimeOut) {
        this.totalTimeOut = totalTimeOut;
    }

    public String getCharset() {
        if(charset == null) {
            charset = "UTF-8";
        }
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Boolean getStopServer() {
        if(stopServer == null) {
            stopServer = false;
        }
        return stopServer;
    }

    public void setStopServer(Boolean stopServer) {
        this.stopServer = stopServer;
    }
    
}
