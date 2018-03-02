/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import java.util.Objects;

/**
 *
 * @author guillermot
 */
public class TipoCampoFiscal {
    int indice;
    String Descripcion;
    TipoDato tipoDato;
    int largo;
    boolean opcional;
    
    TipoComandoFiscal tipoComandoFiscal;

    public TipoCampoFiscal() {
    }

    /**
     * 
     * @param tipoComandoFiscal
     * @param indice indice del campo, comienza en 1
     * @param Descripcion
     * @param tipoDatoSalida
     * @param largo -1 significa maximo
     * @param opcional
     */
    public TipoCampoFiscal(TipoComandoFiscal tipoComandoFiscal, int indice, String Descripcion, TipoDato tipoDatoSalida, int largo, boolean opcional) {
        this.tipoComandoFiscal = tipoComandoFiscal;
        this.indice = indice;
        this.Descripcion = Descripcion;
        this.tipoDato = tipoDatoSalida;
        this.largo = largo;
        this.opcional = opcional;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.indice;
        hash = 59 * hash + Objects.hashCode(this.Descripcion);
        hash = 59 * hash + Objects.hashCode(this.tipoDato);
        hash = 59 * hash + this.largo;
        hash = 59 * hash + (this.opcional ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.tipoComandoFiscal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoCampoFiscal other = (TipoCampoFiscal) obj;
        if (this.indice != other.indice) {
            return false;
        }
        if (!Objects.equals(this.tipoComandoFiscal, other.tipoComandoFiscal)) {
            return false;
        }
        return true;
    }

    
    
    public TipoComandoFiscal getTipoComandoFiscal() {
        return tipoComandoFiscal;
    }

    public void setTipoComandoFiscal(TipoComandoFiscal tipoComandoFiscal) {
        this.tipoComandoFiscal = tipoComandoFiscal;
    }
        
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public boolean isOpcional() {
        return opcional;
    }

    public void setOpcional(boolean opcional) {
        this.opcional = opcional;
    }
    
}
