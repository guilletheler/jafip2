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
public enum TipoImpuesto {
    NINGUNO(0),
    INTERNO_FIJO(1),
    INTERNO_PORCENTUAL(2);

    int codigo;

    private TipoImpuesto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
