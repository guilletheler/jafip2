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
public enum ModificadorItem {
    AGREGAR_ITEM(200),
    ANULAR_ITEM(201),
    AGREGAR_ITEM_RETORNO_ENVASES(202),
    ANULAR_ITEM_RETORNO_ENVASES(203),
    AGREGAR_ITEM_BONIFICACION(204),
    ANULAR_ITEM_BONIFICACION(205),
    AGREGAR_ITEM_DESCUENTO(206),
    ANULAR_ITEM_DESCUENTO(207),
    AGREGAR_ITEM_ANTICIPO(208),
    ANULAR_ITEM_ANTICIPO(209),
    AGREGAR_ITEM_DESCUENTO_ANTICIPO(210),
    ANULAR_ITEM_DESCUENTO_ANTICIPO(211),
    DESCUENTO(400),
    AJUSTE(401),
    AJUSTE_NEGATIVO(402),
    AUDITORIA_DETALLADA(500),
    AUDITORIA_RESUMIDA(501);

    int codigo;

    private ModificadorItem(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
