package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDeLineasDeCola, <br>
* Obtener Configuración de Líneas de Cola<br>
* Notas: Obtiene los valores de las líneas de cola almacenadas en la memoria de trabajo de la impresora fiscal.<br>
*  Si se recibe el campo texto vacío implica que la línea de cola no será impresa.<br>
*  Si se recibe el caracter espacio ASCII(32) implica que la línea de cola será impresa como una línea en blanco.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	N_E	3	Número de línea de cola (OPCIONAL)<br>
* Campos de salida: <br>
* 1	RT	-1	Texto<br>
* 
*/
public class ObtenerConfiguracionDeLineasDeCola extends TipoComandoFiscal {

    public ObtenerConfiguracionDeLineasDeCola() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDeLineasDeCola"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Configuración de Líneas de Cola";
    }

    @Override
    public int getCodigo() {
        return 0x050B;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x0B;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Obtiene los valores de las líneas de cola almacenadas en la memoria de trabajo de la impresora fiscal.\n"
                + " Si se recibe el campo texto vacío implica que la línea de cola no será impresa.\n"
                + " Si se recibe el caracter espacio ASCII(32) implica que la línea de cola será impresa como una línea en blanco.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Texto", TipoDato.RT, -1, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Número de línea de cola", TipoDato.N_E, 3, true)
        };
    }

}
