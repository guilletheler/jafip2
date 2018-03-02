package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionFinalizarDescargaDeSolicitudDeAltaFiscal_SAF, <br>
* Finalizar Descarga de Solicitud de Alta Fiscal (SAF)<br>
* Notas: No posee notas<br>
* Requerimientos: Haber descargado completamente la SAF<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionFinalizarDescargaDeSolicitudDeAltaFiscal_SAF extends TipoComandoFiscal {

    public InicializacionFinalizarDescargaDeSolicitudDeAltaFiscal_SAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionFinalizarDescargaDeSolicitudDeAltaFiscal_SAF"};
    }

    @Override
    public String getDescripcion() {
        return "Finalizar Descarga de Solicitud de Alta Fiscal (SAF)";
    }

    @Override
    public int getCodigo() {
        return 0x0442;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x42;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Haber descargado completamente la SAF";
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
