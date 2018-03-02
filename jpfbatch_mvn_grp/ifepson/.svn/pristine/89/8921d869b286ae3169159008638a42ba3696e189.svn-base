package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CierreDeJornadaFiscal, CierreZ, <br>
* Realiza el cierre de la jornada fiscal almacenando los importes facturados en memoria fiscal.<br>
* Notas: No posee notas<br>
* Requerimientos:  Período de actividades iniciado.<br>
*  Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	5	Número de Informe Diario de Cierre<br>
* 
*/
public class CierreDeJornadaFiscal extends TipoComandoFiscal {

    public CierreDeJornadaFiscal() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CierreDeJornadaFiscal", "CierreZ"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza el cierre de la jornada fiscal almacenando los importes facturados en memoria fiscal.";
    }

    @Override
    public int getCodigo() {
        return 0x0801;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return " Período de actividades iniciado.\n"
                + " Mecanismo impresor en línea y con papel.";
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
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de Informe Diario de Cierre", TipoDato.N_E, 5, false)
        };
    }

}
