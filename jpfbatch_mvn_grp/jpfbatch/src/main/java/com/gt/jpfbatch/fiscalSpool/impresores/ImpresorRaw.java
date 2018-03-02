/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.fiscalSpool.impresores;

import com.gt.ifepson.comandos.ComandoFiscal;
import com.gt.ifepson.comandos.ResultadoEjecucionComandoFiscal;

/**
 *
 * @author John Doe
 */
public class ImpresorRaw implements IImpresor {

    String nombreImpresora;
    
    @Override
    public ResultadoEjecucionComandoFiscal ejecutarComando(ComandoFiscal comando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getState() {
        return 1;
    }

    @Override
    public void finalizar() {
        // no hace nada
    }

    public String getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(String nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }
    
}
