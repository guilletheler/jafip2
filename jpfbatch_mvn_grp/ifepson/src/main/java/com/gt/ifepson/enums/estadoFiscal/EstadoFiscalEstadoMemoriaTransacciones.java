/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.enums.estadoFiscal;

/**
 * Estado fiscal del funcionamiento del equipo
 * @author guillermot
 */
public enum EstadoFiscalEstadoMemoriaTransacciones {
    PERFECTO_ESTADO,
    CASI_LLENA,
    LLENA,
    CON_DESPERFECTOS;
    
    public static EstadoFiscalEstadoMemoriaTransacciones parseEstado(int estadoFiscal) {
        
        String bitString = Integer.toBinaryString(estadoFiscal);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        String estadoFiscalFuncEquipo = bitString.substring(6,8);
        
        if(estadoFiscalFuncEquipo.equals("00")) {
            return PERFECTO_ESTADO;
        }
        
        if(estadoFiscalFuncEquipo.equals("01")) {
            return CASI_LLENA;
        }
        
        if(estadoFiscalFuncEquipo.equals("10")) {
            return LLENA;
        }
        
        if(estadoFiscalFuncEquipo.equals("11")) {
            return CON_DESPERFECTOS;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoFiscalMemoriaTransacciones fiscal de " + estadoFiscal + ":" + bitString);
    }
}
