/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.enums.estadoImpresor;

/**
 * Estado fiscal del funcionamiento del equipo
 * @author guillermot
 */
public enum EstadoImpresorEstacion {
    RECEIPT_RECIBOS,
    SLIP_HOJAS_SUELTAS,
    VALIDACION,
    MICR;
    
    public static EstadoImpresorEstacion parseEstado(int estado) {
        
        String bitString = Integer.toBinaryString(estado);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        bitString = bitString.substring(5, 7);
        
        if(bitString.equals("00")) {
            return RECEIPT_RECIBOS;
        }
        
        if(bitString.equals("01")) {
            return SLIP_HOJAS_SUELTAS;
        }
        
        if(bitString.equals("10")) {
            return VALIDACION;
        }
        
        if(bitString.equals("11")) {
            return MICR;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoImpresorEstacion impresor de " + estado + ":" + bitString);
    }
}
