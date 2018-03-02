package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: CortarPapel, <br>
* Cortar Papel<br>
* Notas: <br>
* Requerimientos: Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class CortarPapel extends TipoComandoFiscal {

    public CortarPapel() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CortarPapel"};
    }

    @Override
    public String getDescripcion() {
        return "Cortar Papel";
    }

    @Override
    public int getCodigo() {
        return 0x0702;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x02;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
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
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    
}
