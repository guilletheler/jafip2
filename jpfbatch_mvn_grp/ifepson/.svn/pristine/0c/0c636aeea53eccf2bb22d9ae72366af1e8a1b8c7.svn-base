package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ObtenerEstado, ConsultarEstado, <br>
* Obtener Estado<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ObtenerEstado extends TipoComandoFiscal {

    public ObtenerEstado() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerEstado", "ConsultarEstado"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Estado";
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
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }
        
    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public int getCodigo() {
        return 0x0001;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.SISTEMA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x00;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
}
