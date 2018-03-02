package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionCancelarDescargaDeSolicitudDeBajaFiscal_SBF, <br>
* Cancela la descarga del archivo de SBF.<br>
* Notas: No se produce ningún cambio en el equipo, incluso habiendo descargado la SBF completamente.<br>
* Requerimientos: Haber iniciado la descarga SBF<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionCancelarDescargaDeSolicitudDeBajaFiscal_SBF extends TipoComandoFiscal {

    public InicializacionCancelarDescargaDeSolicitudDeBajaFiscal_SBF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionCancelarDescargaDeSolicitudDeBajaFiscal_SBF"};
    }

    @Override
    public String getDescripcion() {
        return "Cancela la descarga del archivo de SBF.";
    }

    @Override
    public int getCodigo() {
        return 0x0413;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x13;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No se produce ningún cambio en el equipo, incluso habiendo descargado la SBF completamente.";
    }

    @Override
    public String getRequerimientos() {
        return "Haber iniciado la descarga SBF";
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
