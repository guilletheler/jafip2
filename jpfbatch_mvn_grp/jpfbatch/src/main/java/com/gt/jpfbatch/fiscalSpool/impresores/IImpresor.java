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
public interface IImpresor {
    
    /**
     * 
     * @param comando
     * @return 
     */
    ResultadoEjecucionComandoFiscal ejecutarComando(ComandoFiscal comando);
    
    /**
     * Devuelve el estado del impresor, 1 todo bien
     * @return 
     */
    int getState();
    
    /**
     * Cerrar el puerto y otras tareas
     */
    void finalizar();
}
