package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerLineasDeInformacionDelEstablecimiento, <br>
* Obtener Líneas de Información del Establecimiento<br>
* Notas:  Si se recibe el campo texto vacío implica que la línea no será impresa.<br>
*  Si se recibe el caracter espacio ASCII(32) implica que la línea de encabezado será impresa como una línea en blanco.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	RT	40	Línea de establecimiento<br>
* 
*/
public class ObtenerLineasDeInformacionDelEstablecimiento extends TipoComandoFiscal {
    
    public ObtenerLineasDeInformacionDelEstablecimiento() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerLineasDeInformacionDelEstablecimiento"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Líneas de Información del Establecimiento";
    }

    @Override
    public int getCodigo() {
        return 0x050F;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x0F;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000111, "SELECCION_LINEA",
            "DOMICILIO_COMERCIAL_1", 0b0000000000000000,
            "DOMICILIO_COMERCIAL_2", 0b0000000000000001,
            "DOMICILIO_COMERCIAL_3", 0b0000000000000010,
            "NOMBRE_FANTASIA_1", 0b0000000000000011,
            "NOMBRE_FANTASIA_2", 0b0000000000000100,
            "NOMBRE_FANTASIA_3", 0b0000000000000101,
            "LINEA_INGRESOS_BRUTOS", 0b0000000000000110,
            "LINEA_INICIO_ACTIVIDADES", 0b0000000000001001),
            new TipoExtension(0b0000100000000000, "IMPRIMIR",
            "IMPRIMIR_REPORTE", 0b0000000000000000,
            "NO_IMPRIME_REPORTE", 0b0000100000000000)
        };
    }

    @Override
    public String getNotas() {
        return " Si se recibe el campo texto vacío implica que la línea no será impresa.\n"
                + " Si se recibe el caracter espacio ASCII(32) implica que la línea de encabezado será impresa como una línea en blanco.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Línea de establecimiento", TipoDato.RT, 40, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
