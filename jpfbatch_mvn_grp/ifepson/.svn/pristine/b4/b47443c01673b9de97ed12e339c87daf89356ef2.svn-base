package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: EliminarLogoDelUsuario, EliminarLogoUsuario, <br>
* Eliminar Logo del Usuario<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class EliminarLogoDelUsuario extends TipoComandoFiscal {

    public EliminarLogoDelUsuario() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"EliminarLogoDelUsuario", "EliminarLogoUsuario"};
    }

    @Override
    public String getDescripcion() {
        return "Eliminar Logo del Usuario";
    }

    @Override
    public int getCodigo() {
        return 0x0534;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x34;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
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
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
