package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionFinalizarCargaDeConfirmacionDeAltaFiscal_CAF, <br>
* Finalizar Carga de Confirmación de Alta Fiscal (CAF)<br>
* Notas:  Si la verificación falla, o algún dato es erróneo, no se realizan cambios en la impresora.<br>
*  Una vez finalizada la carga el equipo pasará a modo fiscal.<br>
* Requerimientos:  Haber cargado la CAF mediante el comando ’04 51’.<br>
*  No haber alcanzado la cantidad máxima de cambios de CUIT.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionFinalizarCargaDeConfirmacionDeAltaFiscal_CAF extends TipoComandoFiscal {

    public InicializacionFinalizarCargaDeConfirmacionDeAltaFiscal_CAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionFinalizarCargaDeConfirmacionDeAltaFiscal_CAF"};
    }

    @Override
    public String getDescripcion() {
        return "Finalizar Carga de Confirmación de Alta Fiscal (CAF)";
    }

    @Override
    public int getCodigo() {
        return 0x0452;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x52;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Si la verificación falla, o algún dato es erróneo, no se realizan cambios en la impresora.\n"
                + " Una vez finalizada la carga el equipo pasará a modo fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return " Haber cargado la CAF mediante el comando ’04 51’.\n"
                + " No haber alcanzado la cantidad máxima de cambios de CUIT.";
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
