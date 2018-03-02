package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: AbrirDNFHGenerico, <br>
* Realiza la apertura de un documento no fiscal homologado genérico o de uso interno.<br>
* Notas: Se incrementa en uno el contador correspondiente<br>
* Requerimientos:  Memoria fiscal no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class AbrirDNFHGenerico extends TipoComandoFiscal {

    public AbrirDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la apertura de un documento no fiscal homologado genérico o de uso interno.";
    }

    @Override
    public int getCodigo() {
        return 0x0E01;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Se incrementa en uno el contador correspondiente";
    }

    @Override
    public String getRequerimientos() {
        return " Memoria fiscal no llena.\n"
                + " Mecanismo impresor en línea y con papel.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000011, "ESTACION_ROLLO_SLIP",
            "ESTACION_ROLLO", 0b0000000000000000,
            "ESTACION_SLIP", 0b0000000000000001,
            "TAMAÑO_DE_ROLLO_EN_ESTACION_SLIP", 0b0000000000000010),
            new TipoExtension(0b0000000001000000, "IMPRIME_DOCUMENTO_GENERICO_O_INTERNO",
            "IMPRIME_DOC_GENERICO_COD910", 0b0000000000000000,
            "IMPRIME_DOC_DE_USO_INTERNO_COD950", 0b0000000001000000),
            new TipoExtension(0b0000010000000000, "IMPRIME_ENCABEZADOS",
            "IMPRIME_ENCABEZADOS", 0b0000000000000000,
            "NO_IMPRIME_ENCABEZADOS", 0b0000010000000000),};
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
