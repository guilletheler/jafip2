package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarPreferenciasNotaCreditoABCM, <br>
* Configurar Preferencias<br>
* Notas: La línea de cantidad x precio será impresa sólo si la cantidad es diferente de la unidad.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarPreferenciasNotaCreditoABCM extends TipoComandoFiscal {

    public ConfigurarPreferenciasNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarPreferenciasNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Preferencias";
    }

    @Override
    public String getNotas() {
        return "La línea de cantidad x precio será impresa sólo si la cantidad es diferente de la unidad.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public int getCodigo() {
        return 0x0D08;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x08;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000100, "LINE_FEED",
            "NO_IMPRIME_LINE_FEED_SEPARANDO_COLA", 0b0000000000000000,
            "IMPRIME_LINE_FEED_SEPARANDO_COLA", 0b0000000000000100),
            new TipoExtension(0b0000000001000000, "LINEA_DOMICILIO_COMERCIAL",
            "NO_IMPRIME_LINEAS_DE_DOMICILIO_COMERCIAL", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_DOMICILIO_COMERCIAL", 0b0000000001000000),
            new TipoExtension(0b0000000010000000, "NOMBRE_DE_FANTASIA",
            "NO_IMPRIME_LINEAS_CON_NOMBRE_DE_FANTASIA", 0b0000000000000000,
            "IMPRIME_LINEAS_CON_NOMBRE_DE_FANTASIA", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "IIBB",
            "NO_IMPRIME_LINEAS_DE_IIBB", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_IIBB", 0b0000000100000000),
            new TipoExtension(0b0000010000000000, "LOGO",
            "NO_IMPRIME_LINEAS_DE_LOGO", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_LOGO", 0b0000010000000000),
            new TipoExtension(0b0001000000000000, "Separar TOTAL",
            "NO_SEPARA_TOTAL_CON_LINEAS_EN_BLANCO", 0b0000000000000000,
            "SEPARA_TOTAL_CON_LINEAS_EN_BLANCO", 0b0001000000000000),
            new TipoExtension(0b0100000000000000, "Código QR",
            "NO_IMPRIME_QR", 0b0000000000000000,
            "IMPRIME_QR", 0b0100000000000000)
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
