package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarPreferenciasDNFH, <br>
* Establece diferentes opciones para la emisión de documentos no fiscales homologados<br>
* <br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarPreferenciasDNFH extends TipoComandoFiscal {

    public ConfigurarPreferenciasDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarPreferenciasDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Establece diferentes opciones para la emisión de documentos no fiscales homologados\n";
    }

    @Override
    public int getCodigo() {
        return 0x1008;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
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
            new TipoExtension(0b0000000000000001, "CONFIGURACION_INPRESION_PALABRAS", 
            "NO_IMPRIME_INFO_SOBRE_TOTAL_PAGADO_Y_VUELTO", 0b0000000000000000,
            "NO_IMPRIME_INFO_SOBRE_TOTAL_PAGADO_Y_VUELTO", 0b0100000000000001),
            new TipoExtension(0b0000000000000100, "IMPRIME_LINE_FEED_SEPARANDO_COLA", 
            "NO_IMPRIME_LINE_FEED_SEPARANDO_COLA", 0b0000000000000000,
            "IMPRIME_LINE_FEED_SEPARANDO_COLA", 0b0000000000000100),
            new TipoExtension(0b0000000010000000, "IMPRIME_LINEAS_DE_NOMBRE_FANTASIA", 
            "NO_IMPRIME_LINEAS_DE_NOMBRE_FANTASIA", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_NOMBRE_FANTASIA", 0b0000000010000000),
            new TipoExtension(0b0000010000000000, "IMPRIME_LIENAS_DE_LOGO", 
            "NO_IMPRIME_LIENAS_DE_LOGO", 0b0000000000000000,
            "IMPRIME_LIENAS_DE_LOGO", 0b0000010000000000),
            new TipoExtension(0b0001000000000000, "SEPARA_PALABRA", 
            "NO_SEPARA_PALABRA_QUE_INCLUYE_MONTO_CON_LINEAS_EN_BLANCO", 0b0000000000000000,
            "SEPARA_PALABRA_QUE_INCLUYE_MONTO_CON_LINEAS_EN_BLANCO", 0b0001000000000000),
            new TipoExtension(0b0100000000000000, "IMPRIME_QR", 
            "NO_IMPRIME_QR", 0b0000000000000000,
            "IMPRIME_QR", 0b0100000000000000),
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
