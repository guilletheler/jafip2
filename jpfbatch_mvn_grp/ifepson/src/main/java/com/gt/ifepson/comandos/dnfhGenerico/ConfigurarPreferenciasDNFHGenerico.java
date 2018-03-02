package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarPreferenciasDNFHGenerico, <br>
* Configura las diferentes opciones para la emisión de documentos no fiscales homologados genéricos o<br>
* de uso interno.<br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarPreferenciasDNFHGenerico extends TipoComandoFiscal {

    public ConfigurarPreferenciasDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarPreferenciasDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Configura las diferentes opciones para la emisión de documentos no fiscales homologados genéricos o\n"
                + "de uso interno.";
    }

    @Override
    public int getCodigo() {
        return 0x0E08;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x08;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000100, "IMPRIME_LINEA_DE_RAZON_SOCIAL",
            "IMPRIME_LINEA_DE_RAZON_SOCIAL", 0b0000000000000000,
            "NO_IMPRIME_LINEA_DE_RAZON_SOCIAL", 0b0000000000000100),
            new TipoExtension(0b0000000000001000, "IMPRIME_LINEA_DE_PUNTO_DE_VENTA",
            "IMPRIME_LINEA_DE_PUNTO_DE_VENTA", 0b0000000000000000,
            "NO_IMPRIME_LINEA_DE_PUNTO_DE_VENTA", 0b0000000000001000),
            new TipoExtension(0b0000000010000000, "IMPRIME_LINEA_DE_NOMBRE_DE_FANTASIA",
            "NO_IMPRIME_LINEA_DE_NOMBRE_DE_FANTASIA", 0b0000000000000000,
            "IMPRIME_LINEA_DE_NOMBRE_DE_FANTASIA", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "IMPRIME_LINEA_DE_INGRESOS_BRUTOS",
            "NO_IMPRIME_LINEA_DE_INGRESOS_BRUTOS", 0b0000000000000000,
            "IMPRIME_LINEA_DE_INGRESOS_BRUTOS", 0b0000000100000000),
            new TipoExtension(0b0000001000000000, "IMPRIME_LINEA_DE_INICIO_DE_ACTIVIDADES",
            "NO_IMPRIME_LINEA_DE_INICIO_DE_ACTIVIDADES", 0b0000000000000000,
            "IMPRIME_LINEA_DE_INICIO_DE_ACTIVIDADES", 0b0000001000000000),
            new TipoExtension(0b0000010000000000, "IMPRIME_LINEA_DE_LOGO",
            "NO_IMPRIME_LINEA_DE_LOGO", 0b0000000000000000,
            "IMPRIME_LINEA_DE_LOGO", 0b0000010000000000),
            new TipoExtension(0b0000100000000000, "IMPRIME_LINEA_DE_DOMINIO_COMERCIAL",
            "IMPRIME_LINEA_DE_DOMINIO_COMERCIAL", 0b0000000000000000,
            "NO_IMPRIME_LINEA_DE_DOMINIO_COMERCIAL", 0b0000100000000000),
            new TipoExtension(0b0001000000000000, "IMPRIME_LINEA_DE_DATOS_FISCALES",
            "IMPRIME_LINEA_DE_DATOS_FISCALES", 0b0000000000000000,
            "NO_IMPRIME_LINEA_DE_DATOS_FISCALES", 0b0001000000000000),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }
    
    

}
