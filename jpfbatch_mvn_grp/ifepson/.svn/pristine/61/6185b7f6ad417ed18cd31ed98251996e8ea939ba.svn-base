/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.enums.estadoFiscal;

/**
 * Estado fiscal de los certificados digitales
 * @author guillermot
 */
public enum EstadoFiscalModoTecnico {
    INACTIVO,
    ACTIVO;
    
    public static EstadoFiscalModoTecnico parseEstado(int estadoFiscal) {
        
        String bitString = Integer.toBinaryString(estadoFiscal);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        String estadoFiscalFuncEquipo = bitString.substring(3, 4);
        
        if(estadoFiscalFuncEquipo.equals("0")) {
            return INACTIVO;
        }
        
        if(estadoFiscalFuncEquipo.equals("1")) {
            return ACTIVO;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoFiscalModoTecnico fiscal de " + estadoFiscal + ":" + bitString);
    }
}
