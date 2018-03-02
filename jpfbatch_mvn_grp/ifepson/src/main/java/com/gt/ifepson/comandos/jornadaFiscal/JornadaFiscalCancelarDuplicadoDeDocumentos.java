package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: JornadaFiscalCancelarDuplicadoDeDocumentos, <br>
* Cancela el la descarga en proceso.<br>
* Notas:  Descarga de duplicado de documento en curso.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class JornadaFiscalCancelarDuplicadoDeDocumentos extends TipoComandoFiscal {

    public JornadaFiscalCancelarDuplicadoDeDocumentos() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalCancelarDuplicadoDeDocumentos"};
    }

    @Override
    public String getDescripcion() {
        return "Cancela el la descarga en proceso.";
    }

    @Override
    public int getCodigo() {
        return 0x08F6;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0xF6;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Descarga de duplicado de documento en curso.";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
