/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import com.gt.ifepson.comandos.TipoRetorno;
import java.io.Serializable;

/**
 *
 * @author guillermot
 */
public class Retorno implements Serializable {
    
    TipoRetorno tipoRespuesta;
    Integer codigo;
    String descripcion;

    public Retorno(Integer codigo, TipoRetorno tipoRespuesta, String descripcion) {
        this.tipoRespuesta = tipoRespuesta;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public TipoRetorno getTipoRespuesta() {
        return tipoRespuesta;
    }

    public void setTipoRespuesta(TipoRetorno tipoRespuesta) {
        this.tipoRespuesta = tipoRespuesta;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getHexCodigo() {
        if(codigo == null) {
            return null;
        }
        return Integer.toHexString(codigo);
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
