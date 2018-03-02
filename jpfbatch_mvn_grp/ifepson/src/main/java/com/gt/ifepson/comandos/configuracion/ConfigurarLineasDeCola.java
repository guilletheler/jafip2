package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarLineasDeCola, <br>
* Configurar Líneas de Cola<br>
* Notas:  Para que la línea de cola no sea impresa se debe enviar el campo texto vacío.<br>
*  Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).<br>
* Requerimientos: El número de cola debe estar comprendido entre 1 y 10.<br>
* Campos de entrada: <br>
* 1	N_E	3	Numero de linea de cola<br>
* 2	RT	-1	Texto (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarLineasDeCola extends TipoComandoFiscal {

    public ConfigurarLineasDeCola() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarLineasDeCola"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Líneas de Cola";
    }

    @Override
    public int getCodigo() {
        return 0x050A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x0A;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[] {};
    }

    @Override
    public String getNotas() {
        return " Para que la línea de cola no sea impresa se debe enviar el campo texto vacío.\n"
                + " Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).";
    }

    @Override
    public String getRequerimientos() {
        return "El número de cola debe estar comprendido entre 1 y 10.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Numero de linea de cola", TipoDato.N_E, 3, false), 
            new TipoCampoFiscal(this, 2, "Texto", TipoDato.RT, -1, true)};
    }

}
