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
public enum EstadoImpresorJournal {
    SIN_PROBLEMAS,
    POCO_PAPEL,
    PAPEL_NO_DISPONIBLE,
    RESERVADO;
    
    public static EstadoImpresorJournal parseEstado(int estado) {
        
        String bitString = Integer.toBinaryString(estado);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        bitString = bitString.substring(12, 14);
        
        if(bitString.equals("00")) {
            return SIN_PROBLEMAS;
        }
        
        if(bitString.equals("01")) {
            return POCO_PAPEL;
        }
        
        if(bitString.equals("10")) {
            return PAPEL_NO_DISPONIBLE;
        }
        
        if(bitString.equals("11")) {
            return RESERVADO;
        }
        
        throw new RuntimeException("No se puede reconocer el estado EstadoImpresorJournal impresor de " + estado + ":" + bitString);
    }
}
