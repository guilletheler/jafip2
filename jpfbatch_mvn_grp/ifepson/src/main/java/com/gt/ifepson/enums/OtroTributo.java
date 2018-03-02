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
public enum OtroTributo {
    IMPUESTOS_NACIONALES(1),
    IMPUESTOS_PROVINCIAL(2),
    IMPUESTO_MUNICIPAL(3),
    IMPUESTO_INTERNOS(4),
    INGRESOS_BRUTOS(5),
    PERCEPCION_DE_IVA(6),
    PERCEPCION_DE_INGRESOS_BRUTOS(7),
    PERCEPCION_POR_IMPUESTOS_MUNICIPALES(8),
    OTRAS_PERCEPCIONES(9),
    OTROS(99);

    int codigo;

    private OtroTributo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
