package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;


/**
* Comando: AbrirTiqueNC, <br>
* Realiza la apertura de un documento tique o tique-nota de crédito.<br>
* Notas:  Imprime el logo configurado por el usuario (La impresión del logo depende de las preferencias configuradas para el documento.)<br>
*  Se incrementa en uno el contador de documento correspondiente.<br>
* Requerimientos:  Memoria fiscal no llena.<br>
*  Memoria de transacciones no llena.<br>
*  Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean obligatorios.<br>
*  Mecanismo impresor en línea y con papel.<br>
*  Líneas de establecimiento “Domicilio comercial #1, IIBB #1 y fecha inicio actividades” deben estar configuradas.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class AbrirTiqueNC extends TipoComandoFiscal {

	public AbrirTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la apertura de un documento tique o tique-nota de crédito.";
    }

    @Override
    public int getCodigo() {
        return 0x0A01;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Imprime el logo configurado por el usuario (La impresión del logo depende de las preferencias configuradas para el documento.)\n"
                + " Se incrementa en uno el contador de documento correspondiente.";
    }

    @Override
    public String getRequerimientos() {
        return " Memoria fiscal no llena.\n"
                + " Memoria de transacciones no llena.\n"
                + " Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean obligatorios.\n"
                + " Mecanismo impresor en línea y con papel.\n"
                + " Líneas de establecimiento “Domicilio comercial #1, IIBB #1 y fecha inicio actividades” deben estar configuradas.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000010000000, "DESCRIPCIONES (DNFH de farmacia, talón de envío a domicilio, talón de cambio).",
            "NO_ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000000000000,
            "ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "ATRIBUTOS_IMPRESION_DE_LAS_DESCRIPCIONES",
            "NO_CONSERVAR_ATRIBUTOS_DE_IMPRESION", 0b0000000000000000,
            "CONSERVAR_ATRIBUTOS_DE_IMPRESION", 0b0000000100000000),
            new TipoExtension(0b0000001000000000, "DESCRIPCIONES EXTRA",
            "ALMACENA_TODAS_LAS_DESCRIPCIONES_EXTRAS", 0b0000000000000000,
            "ALMACENA_SOLO_PRIMER_DESCRIPCION_EXTRA", 0b0000001000000000),
            new TipoExtension(0b0100000000000000, "TIQUE_NC",
            "IMPRIME_TIQUE", 0b0000000000000000,
            "IMPRIME_TIQUE_NOTA_DE_CREDITO", 0b0100000000000000)
        };
    }

}