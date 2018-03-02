/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

/**
 *
 * @author guillermot
 */
public enum TipoRetorno {
    ESENCIALES(0X00, "Retornos Esenciales"),
    COMANDOS_GENERICOS(0x01, "Retorno sobre Comandos Genéricos"),
    CAMPOS_PROTOCOLO(0x02, "Retornos sobre Campos de Protocolo"),
    PROBLEMAS_HARDWARE(0x03, "Retorno sobre Problemas de Hardware"),
    INICIALIZACION(0x04, "Retornos de Inicialización"),
    CONFIGURACION(0x05, "Retornos de Coniguración"),
    MEMORIA_TRANSACCIONES(0x06, "Retornos sobre Memoria de Transacciones "),
    JORNADA(0x08, "Retornos sobre Jornada"),
    TRANSACCIONES_GENERICAS(0x09, "Retornos sobre Transacciones Genericas"),
    TIQUE_FISCAL(0X0A, "Retornos sobre Tique Fiscal"),
    TFNCD(0X0B, "Retornos sobre Tique-FacturaFiscal/Nota de Débito/Nota de Crédito "),
    DNF(0X0E, "Retornos sobre Documento No Fiscal"),
    DNFH(0x10, "Retornos sobre Documento No Fiscal Homologado"),
    OTROS_RETORNOS(0x20, "Otros Retornos"),
    CONFIGURACION_ETHERNET(0x70, "Configuración de Ethernet"),
    OTROS(0xFF, "Otros");

    Integer codigo;
    String descripcion;

    private TipoRetorno(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
