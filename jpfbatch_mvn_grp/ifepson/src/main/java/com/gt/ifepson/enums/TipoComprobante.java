/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.enums;

/**
 *
 * @author guillermot
 */
public enum TipoComprobante {
    TIQUET(1), // "83"  Tique
    TIQUE_FACTURA(2), // "81"  Tique Factura A, "82" Tique Factura B, "111" Tique Factura C, "118" Tique Factura M
    TIQUE_NOTA_DE_CREDITO(3), // "110" Tique Nota de Credito, "112" Tique Nota de Credito A, "113" Tique Nota de Credito B, "114" Tique Nota de Credito C, "119" Tique Nota de Credito M
    TIQUE_NOTA_DE_DEBITO(4), // "115" Tique Nota de Debito A, "116" Tique Nota de Debito B, "117" Tique Nota de Debito C, "120" Tique Nota de Debito M
    DNFH_GENERIC(21), // "910" DNFH Documento Generico 
    DNFH_INTERNAL_USE(22), // "950" DNFH Documento de uso interno 
    DNFH_VALORIZADO_REMITO_R(51), // "91"  DNFH Valorizado Remito R 
    DNFH_VALORIZADO_REMITO_X(52), // "901" DNFH Valorizado Remito X 
    DNFH_VALORIZADO_RECIBO_X(53), // "902" DNFH Valorizado Recibo X 
    DNFH_VALORIZADO_PRESUPUESTO_X(54), // "903" DNFH Valorizado Presupuesto X 
    DNFH_VALORIZADO_DONACION(55); // "907" DNFH Valorizado Comprobante Donacion

    int codigo;

    private TipoComprobante(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
