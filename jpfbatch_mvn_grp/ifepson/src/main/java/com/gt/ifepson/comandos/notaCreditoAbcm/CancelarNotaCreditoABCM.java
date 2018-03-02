package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CancelarNotaCreditoABCM, <br>
* Cancelar<br>
* Notas: Se incrementa en uno el contador de documentos cancelados correspondiente.<br>
* Requerimientos: Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique-nota de crédito<br>
* 2	L	1	Tipo de tique-nota de crédito (A, B, C ,M)<br>
* 
*/
public class CancelarNotaCreditoABCM extends TipoComandoFiscal {

    public CancelarNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CancelarNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Cancelar";
    }

    @Override
    public int getCodigo() {
        return 0x0D07;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x07;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Se incrementa en uno el contador de documentos cancelados correspondiente.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Número del tique-nota de crédito", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Tipo de tique-nota de crédito (A, B, C ,M)", TipoDato.L, 1, false)
        };
    }

}
