/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.fiscalSpool.impresores;

import com.gt.ifepson.IFEpsonHelper;
import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.ifepson.comandos.ComandoFiscal;
import com.gt.ifepson.comandos.ResultadoEjecucionComandoFiscal;
import java.io.Serializable;

/**
 *
 * @author John Doe
 */
public class ImpresorFiscal implements IImpresor, Serializable {

    EpsonFiscalDriverJNA epsonDriver;

    public ImpresorFiscal() {
    }

    @Override
    public ResultadoEjecucionComandoFiscal ejecutarComando(ComandoFiscal comando) {
        return IFEpsonHelper.ejecutarComando(epsonDriver, comando);
    }

    @Override
    public int getState() {
        if(epsonDriver != null) {
            return epsonDriver.getState();
        }
        
        return -1;
    }

    @Override
    public void finalizar() {
        epsonDriver.ClosePort();
    }
    
    
    
    public EpsonFiscalDriverJNA getEpsonDriver() {
        return epsonDriver;
    }

    public void setEpsonDriver(EpsonFiscalDriverJNA epsonDriver) {
        this.epsonDriver = epsonDriver;
    }

    
}
