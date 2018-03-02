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
public enum EstadoFiscalDocumentoEnProgreso {
    SIN_DOCUMENTO,
    TIQUE_O_NOTA_DE_CREDITO,
    TIQUE_FACTURA_A_B_C_M,
    NOTA_DE_CREDITO_A_B_C_M,
    NOTA_DE_DEBITO_A_B_C_M,
    RESERVADO,
    DOCUMENTO_AUDITORIA,
    DNFH_GENERICO_ROLLO,
    DNFH_GENERICO_SLIP,
    DNFH;
    
    public static EstadoFiscalDocumentoEnProgreso parseEstado(int estadoFiscal) {
        
        String bitString = Integer.toBinaryString(estadoFiscal);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        String estadoFiscalFuncEquipo = bitString.substring(12, 16);
        
        if(estadoFiscalFuncEquipo.equals("0000")) {
            return SIN_DOCUMENTO;
        }
        
        if(estadoFiscalFuncEquipo.equals("0001")) {
            return TIQUE_O_NOTA_DE_CREDITO;
        }
        
        if(estadoFiscalFuncEquipo.equals("0010")) {
            return TIQUE_FACTURA_A_B_C_M;
        }
        
        if(estadoFiscalFuncEquipo.equals("0011")) {
            return NOTA_DE_CREDITO_A_B_C_M;
        }
        
        if(estadoFiscalFuncEquipo.equals("0100")) {
            return NOTA_DE_DEBITO_A_B_C_M;
        }
                
        if(estadoFiscalFuncEquipo.equals("1000")) {
            return DNFH_GENERICO_ROLLO;
        }
        
        if(estadoFiscalFuncEquipo.equals("1001")) {
            return DNFH_GENERICO_SLIP;
        }
        
        if(estadoFiscalFuncEquipo.equals("1010")) {
            return DNFH;
        }
        
        return RESERVADO;
        //throw new RuntimeException("No se puede reconocer el estado " + getClass().getName() + " fiscal de " + estadoFiscal + ":" + bitString);
    }
}
