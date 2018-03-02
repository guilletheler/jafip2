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
public enum EstadoFiscalSubestados {
    SIN_SUBESTADOS,
    SOLICITUD_O_CARGA_DE_CERTIFICADO_DIGITAL,
    CONFIGURACION_DE_SCANNER,
    CONFIGURACION_DE_LOGO,
    AUDITORIA_EN_PROGRESO,
    DESCARGA_DE_REPORTE_EN_PROGRESO,
    DESCARGA_DE_SUPLICADO_ELECTRONICO_EN_PROGRESO,
    DESCARGA_DE_REPORTE_DE_EVENTOS_EN_PROGRESO;
    
    public static EstadoFiscalSubestados parseEstado(int estadoFiscal) {
        
        String bitString = Integer.toBinaryString(estadoFiscal);
        
        bitString = org.apache.commons.lang3.StringUtils.rightPad(bitString, 16, '0');
        
        String estadoFiscalFuncEquipo = bitString.substring(9, 12);
        
        return EstadoFiscalSubestados.values()[Integer.valueOf(estadoFiscalFuncEquipo, 2)];
        
    }
}
