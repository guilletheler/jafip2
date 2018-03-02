package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CancelarTiqueNC, <br>
* Cancelar<br>
* Notas: Se incrementa en uno el contador de documento cancelado correspondiente.<br>
* Requerimientos: Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número de tique fiscal<br>
* 
*/
public class CancelarTiqueNC extends TipoComandoFiscal {

    public CancelarTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CancelarTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Cancelar";
    }

    @Override
    public int getCodigo() {
        return 0x0A07;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x07;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Se incrementa en uno el contador de documento cancelado correspondiente.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Número de tique fiscal", TipoDato.N_E, 8, false)
        };
    }

    
}
