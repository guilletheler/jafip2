package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerFuente, getFuente, <br>
* Obtener Fuente (Comando no soportado en TM-U220AFII Versión 22.01 Demeter)<br>
* Notas:  Los valores posibles del campo de salida son:<br>
* 0 – Fuente tipo ’A’<br>
* 1 – Fuente tipo ’B’<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	1	Fuente del sistema<br>
* 
*/
public class ObtenerFuente extends TipoComandoFiscal {

    public ObtenerFuente() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerFuente", "getFuente"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Fuente (Comando no soportado en TM-U220AFII Versión 22.01 Demeter)";
    }

    @Override
    public int getCodigo() {
        return 0x0771;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x71;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return " Los valores posibles del campo de salida son:\n"
                + "0 – Fuente tipo ’A’\n"
                + "1 – Fuente tipo ’B’";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Fuente del sistema", TipoDato.N_E, 1, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
