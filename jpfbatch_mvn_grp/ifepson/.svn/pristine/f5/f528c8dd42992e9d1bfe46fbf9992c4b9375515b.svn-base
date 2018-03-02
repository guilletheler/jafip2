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
public enum EstadoFiscalJornadaFiscal {
    ABIERTA,
    CERRADA;
    
    public static EstadoFiscalJornadaFiscal parseEstado(int estadoFiscal) {
        
        String bitString = Integer.toBinaryString(estadoFiscal);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        String estadoFiscalFuncEquipo = bitString.substring(8,9);
        
        if(estadoFiscalFuncEquipo.equals("0")) {
            return ABIERTA;
        }
        
        if(estadoFiscalFuncEquipo.equals("1")) {
            return CERRADA;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoFiscalJornadaFiscal fiscal de " + estadoFiscal + ":" + bitString);
    }
}
