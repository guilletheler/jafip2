package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarLineasDeEncabezado, ConfigurarLineaEncabezado, SetLineaEncabezado, <br>
* Configurar Líneas de Encabezado<br>
* Notas: Para que la línea de encabezado no sea impresa se debe enviar el campo texto vacío.<br>
* Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).<br>
* Requerimientos:  No se aceptan códigos de barra.<br>
*  El número de encabezado debe estar comprendido entre 1 y 20.<br>
*  Los encabezados 1 -10 se imprimen con los datos del usuario, y los restantes con los datos del receptor.<br>
* Campos de entrada: <br>
* 1	N_E	3	Numero de linea del encabezado<br>
* 2	RT	-1	Texto (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarLineasDeEncabezado extends TipoComandoFiscal {

    public ConfigurarLineasDeEncabezado() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarLineasDeEncabezado", "ConfigurarLineaEncabezado", "SetLineaEncabezado"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Líneas de Encabezado";
    }

    @Override
    public int getCodigo() {
        return 0x0508;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x08;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[] {};
    }

    @Override
    public String getNotas() {
        return "Para que la línea de encabezado no sea impresa se debe enviar el campo texto vacío.\n"
                + "Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).";
    }

    @Override
    public String getRequerimientos() {
        return " No se aceptan códigos de barra.\n"
                + " El número de encabezado debe estar comprendido entre 1 y 20.\n"
                + " Los encabezados 1 -10 se imprimen con los datos del usuario, y los restantes con los datos del receptor.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Numero de linea del encabezado", TipoDato.N_E, 3, false), 
            new TipoCampoFiscal(this, 2, "Texto", TipoDato.RT, -1, true)};
    }

}
