package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: AvanzarPapel, <br>
* Avanzar Papel: Avanza el papel en la estación seleccionada, la cantidad de líneas especificadas.<br>
* Notas: <br>
* Requerimientos: Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* 1	N_E	2	Cantidad de líneas a avanzar<br>
* Campos de salida: <br>
* 
*/
public class AvanzarPapel extends TipoComandoFiscal {

    public AvanzarPapel() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AvanzarPapel"};
    }

    @Override
    public String getDescripcion() {
        return "Avanzar Papel: Avanza el papel en la estación seleccionada, la cantidad de líneas especificadas.";
    }

    @Override
    public int getCodigo() {
        return 0x0701;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000011, "SELECCION_ESTACION",
            "ESTACION_DE_ROLLO", 0b0000000000000000,
            "ESTACION_DE_HOJA_SUELTA", 0b0000000000000001,
            "ESTACION_DE_VALIDACION", 0b0000000000000010,
            "ESTACION_DE_AUDITORIA", 0b0000000000000011)
        };
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Cantidad de líneas a avanzar", TipoDato.N_E, 2, false)};
    }

}
