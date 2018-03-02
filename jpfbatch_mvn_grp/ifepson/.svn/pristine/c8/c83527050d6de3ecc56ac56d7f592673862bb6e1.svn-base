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
public enum EstadoImpresor {
    ONLINE,
    OFFLINE;
    
    public static EstadoImpresor parseEstado(int estado) {
        
        String bitString = Integer.toBinaryString(estado);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        bitString = bitString.substring(0, 1);
        
        if(bitString.equals("0")) {
            return ONLINE;
        }
        
        if(bitString.equals("1")) {
            return OFFLINE;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoImpresor impresor de " + estado + ":" + bitString);
    }
}
