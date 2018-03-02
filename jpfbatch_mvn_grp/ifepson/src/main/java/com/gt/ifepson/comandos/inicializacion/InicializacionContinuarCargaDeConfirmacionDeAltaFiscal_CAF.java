package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InicializacionContinuarCargaDeConfirmacionDeAltaFiscal_CAF, <br>
* Continúa el proceso de carga de CAF.<br>
* Notas:  El archivo a cargar debe ser provisto por la AFIP (y firmado por la misma) en formato XML,<br>
* en respuesta a una SAF (ver comando ’04 40’).<br>
* Requerimientos: Haber iniciado la carga CAF (ver comando ’04 50’).<br>
* Campos de entrada: <br>
* 1	B	-1	Datos a cargar<br>
* Campos de salida: <br>
* 
*/
public class InicializacionContinuarCargaDeConfirmacionDeAltaFiscal_CAF extends TipoComandoFiscal {

    public InicializacionContinuarCargaDeConfirmacionDeAltaFiscal_CAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionContinuarCargaDeConfirmacionDeAltaFiscal_CAF"};
    }

    @Override
    public String getDescripcion() {
        return "Continúa el proceso de carga de CAF.";
    }

    @Override
    public int getCodigo() {
        return 0x0451;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x51;
        return ret;
    }

    @Override
    public String getNotas() {
        return " El archivo a cargar debe ser provisto por la AFIP (y firmado por la misma) en formato XML,\n"
                + "en respuesta a una SAF (ver comando ’04 40’).";
    }

    @Override
    public String getRequerimientos() {
        return "Haber iniciado la carga CAF (ver comando ’04 50’).";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
          new TipoCampoFiscal(this, 1, "Datos a cargar", TipoDato.B, -1, false),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
