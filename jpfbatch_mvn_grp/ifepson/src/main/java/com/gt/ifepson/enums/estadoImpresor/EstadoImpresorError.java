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
public enum EstadoImpresorError {
    SIN_ERROR,
    CON_ERROR;
    
    public static EstadoImpresorError parseEstado(int estado) {
        
        String bitString = Integer.toBinaryString(estado);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        bitString = bitString.substring(1, 2);
        
        if(bitString.equals("0")) {
            return SIN_ERROR;
        }
        
        if(bitString.equals("1")) {
            return CON_ERROR;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoImpresorError impresor de " + estado + ":" + bitString);
    }
}
