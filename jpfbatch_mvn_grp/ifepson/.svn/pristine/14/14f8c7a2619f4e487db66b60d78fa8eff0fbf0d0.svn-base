package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: CancelarDescargaDeSolicitudDeAltaFiscal_SAF, <br>
* Cancela el proceso de descarga de SAF.<br>
* Notas: No posee notas<br>
* Requerimientos: Haber iniciado la descarga SAF <br>
* <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionCancelarDescargaDeSolicitudDeAltaFiscal_SAF extends TipoComandoFiscal {

    public InicializacionCancelarDescargaDeSolicitudDeAltaFiscal_SAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CancelarDescargaDeSolicitudDeAltaFiscal_SAF"};
    }

    @Override
    public String getDescripcion() {
        return "Cancela el proceso de descarga de SAF.";
    }

    @Override
    public int getCodigo() {
        return 0x0443;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x43;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Haber iniciado la descarga SAF \n";
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
