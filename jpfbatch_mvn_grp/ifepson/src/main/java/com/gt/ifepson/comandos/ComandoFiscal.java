/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author guillermot
 */
public class ComandoFiscal implements Serializable {

    TipoComandoFiscal tipoComando;

    List<ValorExtension> valoresExtensiones;

    Map<TipoCampoFiscal, String> valoresCampoEntrada;

    Map<TipoCampoFiscal, String> valoresCampoSalida;

    public ComandoFiscal() {
    }

    public ComandoFiscal(TipoComandoFiscal tipoComando) {
        this.tipoComando = tipoComando;
    }

    public TipoComandoFiscal getTipoComando() {
        return tipoComando;
    }

    public void setTipoComando(TipoComandoFiscal tipoComando) {
        this.tipoComando = tipoComando;
    }

    /**
     * Devuelve un int[2] con los bytes de las extensiones
     *
     * @return
     */
    public int[] getExtensiones() {
        int i = 0;
        for (ValorExtension ve : this.getValoresExtensiones()) {
            i = i & ~ve.getTipoExtension().getBits();
            i = i | ve.getValor();
        }

        String cod = StringUtils.leftPad(Integer.toHexString(i).toUpperCase(), 4, "0");

        int[] ret = new int[2];

        ret[0] = Integer.parseInt(cod.substring(0, 2), 16);
        ret[1] = Integer.parseInt(cod.substring(2), 16);

        return ret;
    }

    /**
     *
     * @param pos posicion del campo en base 1
     * @param valor
     */
    public void setValorCampoEntrada(int pos, String valor) {
        this.getValoresCampoEntrada().put(this.getTipoComando().getCamposEntrada()[pos - 1], valor);
    }

    public void addExtension(String nombre) {
        for (TipoExtension te : this.getTipoComando().getExtensiones()) {
            for (ValorExtension ve : te.getCampos()) {
                if (ve.getNombre().equalsIgnoreCase(nombre)) {
                    this.getValoresExtensiones().add(ve);
                    break;
                }
            }
        }
    }
    
    public List<ValorExtension> getValoresExtensiones() {
        if (valoresExtensiones == null) {
            valoresExtensiones = new ArrayList<>();
        }
        return valoresExtensiones;
    }

    public void setValoresExtensiones(List<ValorExtension> valoresExtensiones) {
        this.valoresExtensiones = valoresExtensiones;
    }

    public Map<TipoCampoFiscal, String> getValoresCampoEntrada() {
        if (valoresCampoEntrada == null) {
            valoresCampoEntrada = new HashMap<>();
        }
        return valoresCampoEntrada;
    }

    public void setValoresCampoEntrada(Map<TipoCampoFiscal, String> valoresCampoEntrada) {
        this.valoresCampoEntrada = valoresCampoEntrada;
    }

    public Map<TipoCampoFiscal, String> getValoresCampoSalida() {
        if (valoresCampoSalida == null) {
            valoresCampoSalida = new HashMap<>();
        }
        return valoresCampoSalida;
    }

    public void setValoresCampoSalida(Map<TipoCampoFiscal, String> valoresCampoSalida) {
        this.valoresCampoSalida = valoresCampoSalida;
    }
    
}
