package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionIniciarCargaDeConfirmacionDeAltaFiscal_CAF, <br>
* Iniciar Carga de Confirmación de Alta Fiscal (CAF)<br>
* Notas: No pose notas<br>
* Requerimientos:  Certificados digitales instalados y válidos.<br>
*  Haber realizado previamente un Cierre Diario (Emitir un Informe Diario de Cierre).<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionIniciarCargaDeConfirmacionDeAltaFiscal_CAF extends TipoComandoFiscal {

    public InicializacionIniciarCargaDeConfirmacionDeAltaFiscal_CAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionIniciarCargaDeConfirmacionDeAltaFiscal_CAF"};
    }

    @Override
    public String getDescripcion() {
        return "Iniciar Carga de Confirmación de Alta Fiscal (CAF)";
    }

    @Override
    public int getCodigo() {
        return 0x0450;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x50;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No pose notas";
    }

    @Override
    public String getRequerimientos() {
        return " Certificados digitales instalados y válidos.\n"
                + " Haber realizado previamente un Cierre Diario (Emitir un Informe Diario de Cierre).";
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
