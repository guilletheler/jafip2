/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import java.io.Serializable;

/**
 *
 * @author guillermot
 */
public class ResultadoEjecucionComandoFiscal implements Serializable {
    
    
    /**
     * Arreglo de 4 enteros,
     * lastComErr, printerStatus, fiscalStatus, returnCode
     */
    int[] rawReturn;
    
    ComandoFiscal comandoFiscal;

    public ResultadoEjecucionComandoFiscal(ComandoFiscal comandoFiscal) {
        this.comandoFiscal = comandoFiscal;
    }

    public ResultadoEjecucionComandoFiscal(ComandoFiscal comandoFiscal, int[] rawReturn) {
        this.rawReturn = rawReturn;
        this.comandoFiscal = comandoFiscal;
    }
    
    public int[] getRawReturn() {
        return rawReturn;
    }

    public void setRawReturn(int[] rawReturn) {
        this.rawReturn = rawReturn;
    }

    public ComandoFiscal getComandoFiscal() {
        return comandoFiscal;
    }

    public void setComandoFiscal(ComandoFiscal comandoFiscal) {
        this.comandoFiscal = comandoFiscal;
    }
    
}
