package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;

/**
* Comando: CancelarCargaDeLogoDelUsuario, <br>
* Cancelar Carga de Logo del Usuario<br>
* Notas: <br>
* Requerimientos: Carga de logos de usuario iniciada<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class CancelarCargaDeLogoDelUsuario extends TipoComandoFiscal {

    public CancelarCargaDeLogoDelUsuario() {
    }
    
    @Override
    public String[] getNames() {
        return new String[]{"CancelarCargaDeLogoDelUsuario"};
    }

    @Override
    public String getDescripcion() {
        return "Cancelar Carga de Logo del Usuario";
    }

    @Override
    public String getRequerimientos() {
        return "Carga de logos de usuario iniciada";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[] {};
    }
    
    @Override
    public int getCodigo() {
        return 0x0533;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x33;
        return ret;
    }

    @Override
    public String getNotas() {
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

    
}
