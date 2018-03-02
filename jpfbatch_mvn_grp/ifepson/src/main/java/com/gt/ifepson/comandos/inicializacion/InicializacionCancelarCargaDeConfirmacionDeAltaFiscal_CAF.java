package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: CancelarCargaDeConfirmacionDeAltaFiscal_CAF, <br>
* Cancela el proceso de carga de CAF.<br>
* Notas: No posee notas<br>
* Requerimientos: Haber iniciado la carga CAF mediante el comando ’04 50’.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionCancelarCargaDeConfirmacionDeAltaFiscal_CAF extends TipoComandoFiscal {

    public InicializacionCancelarCargaDeConfirmacionDeAltaFiscal_CAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CancelarCargaDeConfirmacionDeAltaFiscal_CAF"};
    }

    @Override
    public String getDescripcion() {
        return "Cancela el proceso de carga de CAF.";
    }

    @Override
    public int getCodigo() {
        return 0x0453;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x53;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Haber iniciado la carga CAF mediante el comando ’04 50’.";
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
