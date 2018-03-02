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
public enum ClasificacionComando {
    SISTEMA(0x00, "Comandos de sistema"),
    DIAGNOSTICO(0x02, "Comandos de Diágnostico"),
    INICIALIZACION(0x04, "Comandos de Inicialización"),
    CONFIGURACION(0x05, "Comandos de Configuración"),
    CONTROL_IMPRESORA(0x07, "Comandos de Controlde de Impresora"),
    JORNADA_FISCAL(0x08, "Comandos de Jornada Fiscal"),
    MEMORIA_TRANSACCIONES(0x09, "Comandos de Descarga de Reportes desde Memoria de Transacciones"),
    TIQUE(0X0A, "Comandos de Tique / Tique Nota de Crédito"),
    TFND(0x0B, "Comandos de Tique-Factura A-B-C-M / Tique-Nota de Débito A-B-C-M"),
    TNC(0X0D, "Comandos de Tique-Nota de Crédito A-B-C-M"),
    DNFH_GENERICO(0x0E, "Comandos de Documento No Fiscal Homologado Genérico/Uso Interno"),
    DNFH(0x10, "Comandos de Documentos No Fiscales Homologados");

    Integer codigo;
    String descripcion;

    private ClasificacionComando(Integer codigo, String descripcion) {
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
