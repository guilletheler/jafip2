package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarLineasDeInformacionDelEstablecimiento, ConfigurarLineasEstablecimiento, ConfigurarLineaEstablecimiento, SetLineaEstablecimiento, <br>
* Configurar Líneas de Información del Establecimiento<br>
* Notas:  Para que una línea no sea impresa se debe enviar el campo texto vacío.<br>
*  Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).<br>
*  Los atributos de impresión serán ignorados.<br>
*  En las líneas de domicilio, se aceptarán las siguientes combinaciones de la palabra “Total”: “TOTAL”, “total”, “Total”, pero al momento de ser impresas, siempre se imprimirán como “Total”.<br>
*  Al realizar el cambio de la línea “Línea de Ingresos Brutos” se emitirá el reporte de cambio de inscripción de ingresos brutos (cód. 953 – Cambio de insc. en IIBB)<br>
*  La línea de inicio de actividades debe tener el siguiente formato “dd/mm/aaaa”<br>
* Requerimientos: Jornada fiscal cerrada.<br>
* No se aceptan códigos de barra.<br>
* La Memoria fiscal no debe estar llena.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarLineasDeInformacionDelEstablecimiento extends TipoComandoFiscal {

    public ConfigurarLineasDeInformacionDelEstablecimiento() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarLineasDeInformacionDelEstablecimiento", "ConfigurarLineasEstablecimiento", "ConfigurarLineaEstablecimiento", "SetLineaEstablecimiento"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Líneas de Información del Establecimiento";
    }

    @Override
    public int getCodigo() {
        return 0x050E;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x0E;
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
        return " Para que una línea no sea impresa se debe enviar el campo texto vacío.\n"
                + " Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).\n"
                + " Los atributos de impresión serán ignorados.\n"
                + " En las líneas de domicilio, se aceptarán las siguientes combinaciones de la palabra “Total”: “TOTAL”, “total”, “Total”, pero al momento de ser impresas, siempre se imprimirán como “Total”.\n"
                + " Al realizar el cambio de la línea “Línea de Ingresos Brutos” se emitirá el reporte de cambio de inscripción de ingresos brutos (cód. 953 – Cambio de insc. en IIBB)\n"
                + " La línea de inicio de actividades debe tener el siguiente formato “dd/mm/aaaa”";
    }

    @Override
    public String getRequerimientos() {
        return "Jornada fiscal cerrada.\n"
                + "No se aceptan códigos de barra.\n"
                + "La Memoria fiscal no debe estar llena.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
