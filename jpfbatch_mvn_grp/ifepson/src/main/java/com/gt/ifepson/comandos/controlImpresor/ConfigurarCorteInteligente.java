package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarCorteInteligente, <br>
* Configurar Corte Inteligente: Activa/desactiva el control automático, de la guillotina de papel, para el modo corte inteligente.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarCorteInteligente extends TipoComandoFiscal {
    
    public ConfigurarCorteInteligente() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarCorteInteligente"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Corte Inteligente: Activa/desactiva el control automático, de la guillotina de papel, para el modo corte inteligente.";
    }

    @Override
    public int getCodigo() {
        return 0x0760;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x60;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "ACTIVACION_CORTE_INTELIGENTE",
            "ACTIVA_CORTE_INTELIGENTE", 0b0000000000000000,
            "DESACTIVA_CORTE_INTELIGENTE", 0b0000000000000001)
        };
    }
    
    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    
}
