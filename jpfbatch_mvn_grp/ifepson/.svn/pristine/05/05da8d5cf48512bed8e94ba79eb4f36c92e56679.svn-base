package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDeLineasDeEncabezado, getEncabezado, <br>
* Obtener Configuración de Líneas de Encabezado<br>
* Notas: Obtiene los valores de las líneas de encabezado almacenadas en la memoria de trabajo de la impresora fiscal.<br>
*  Si se recibe el campo texto vacío implica que la línea de encabezado no será impresa.<br>
*  Si se recibe el caracter espacio ASCII(32) implica que la línea de encabezado será impresa como una línea en blanco.<br>
* Requerimientos:  El número de encabezado debe estar comprendido entre 1 y 20.<br>
* Campos de entrada: <br>
* 1	N_E	3	Número de líneas de encabezado (OPCIONAL)<br>
* Campos de salida: <br>
* 1	RT	-1	Texto<br>
* 
*/
public class ObtenerConfiguracionDeLineasDeEncabezado extends TipoComandoFiscal {

    public ObtenerConfiguracionDeLineasDeEncabezado() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDeLineasDeEncabezado", "getEncabezado"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Configuración de Líneas de Encabezado";
    }

    @Override
    public int getCodigo() {
        return 0x0509;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x09;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
    
    @Override
    public String getNotas() {
        return "Obtiene los valores de las líneas de encabezado almacenadas en la memoria de trabajo de la impresora fiscal.\n"
                + " Si se recibe el campo texto vacío implica que la línea de encabezado no será impresa.\n"
                + " Si se recibe el caracter espacio ASCII(32) implica que la línea de encabezado será impresa como una línea en blanco.";
    }

    @Override
    public String getRequerimientos() {
        return " El número de encabezado debe estar comprendido entre 1 y 20.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Texto", TipoDato.RT, -1, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Número de líneas de encabezado", TipoDato.N_E, 3, true)};
    }

}
