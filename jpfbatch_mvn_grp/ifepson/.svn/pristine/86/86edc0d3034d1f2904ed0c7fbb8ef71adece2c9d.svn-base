package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarTasaDeIVAEstandar, ConfigurarTasaIVA, SetTasaIVA, <br>
* Configurar Tasa de IVA Estándar<br>
* Notas:  El reporte de fiscalización sólo será impreso en modo fiscal.<br>
* Requerimientos:  Jornada fiscal cerrada.<br>
*  Mecanismo impresor en línea y con papel (en caso de impresión del documento).<br>
* Campos de entrada: <br>
* 1	N_E	4	Tasa de IVA estándar (nn,nn)<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarTasaDeIVAEstandar extends TipoComandoFiscal {

    public ConfigurarTasaDeIVAEstandar() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarTasaDeIVAEstandar", "ConfigurarTasaIVA", "SetTasaIVA"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Tasa de IVA Estándar";
    }

    @Override
    public int getCodigo() {
        return 0x0505;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x05;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return " El reporte de fiscalización sólo será impreso en modo fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return " Jornada fiscal cerrada.\n"
                + " Mecanismo impresor en línea y con papel (en caso de impresión del documento).";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {new TipoCampoFiscal(this, 1, "Tasa de IVA estándar (nn,nn)", TipoDato.N_E, 4, false)};
    }

}
