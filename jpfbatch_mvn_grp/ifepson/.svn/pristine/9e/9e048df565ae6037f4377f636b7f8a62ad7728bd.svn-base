package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: AbrirDNFH, <br>
* Realiza la apertura de un documento no fiscal homologado.<br>
* Notas:  Imprime el logo configurado por el usuario (La impresión del logo depende de las preferencias configurdas para el documento.)<br>
*  Para que una línea no sea impresa se debe enviar el campo texto vacío.<br>
*  Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).<br>
*  Los atributos de impresión serán ignorados, para todas las líneas de texto<br>
* Requerimientos:  Memoria fiscal no llena.<br>
*  Memoria de transacciones no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
*  Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean obligatorios.<br>
*  No se aceptan códigos de barra en las líneas de texto.<br>
*  El formato de la línea de documento asociado es la siguiente: “ddd-ppppp-nnnnnnnn”<br>
* Siendo<br>
*  ddd: el tipo de documento. (ejemplo: “081”)<br>
* ppppp: número de caja. (ejemplo: “00001”)<br>
* nnnnnnnn: el número de documento. (ejemplo: “00000027”)<br>
*  Se validará la existencia de un CUIT válido en el campo número 20 (Número de Documento del transportista/beneficiario) al emitir documentos Remito X o Remito R. Ya que es requerido que el tipo de documento del transportista sea un CUIT.<br>
*  En el caso de emitir un documento Donación (cód. 907) los siguientes campos de entrada son<br>
* obligatorios:<br>
* - Campo número 14: Razón social del transportista/beneficiario, línea #1<br>
* - Campo número 16: Domicilio del transportista/beneficiario, línea #1<br>
* - Campo número 19: Tipo de Documento del transportista/beneficiario<br>
* - Campo número 20: Número de Documento del transportista/beneficiario<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class AbrirDNFH extends TipoComandoFiscal {

    public AbrirDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la apertura de un documento no fiscal homologado.";
    }

    @Override
    public int getCodigo() {
        return 0x1001;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Imprime el logo configurado por el usuario (La impresión del logo depende de las preferencias configurdas para el documento.)\n"
                + " Para que una línea no sea impresa se debe enviar el campo texto vacío.\n"
                + " Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).\n"
                + " Los atributos de impresión serán ignorados, para todas las líneas de texto";
    }

    @Override
    public String getRequerimientos() {
        return " Memoria fiscal no llena.\n"
                + " Memoria de transacciones no llena.\n"
                + " Mecanismo impresor en línea y con papel.\n"
                + " Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean obligatorios.\n"
                + " No se aceptan códigos de barra en las líneas de texto.\n"
                + " El formato de la línea de documento asociado es la siguiente: “ddd-ppppp-nnnnnnnn”\n"
                + "Siendo\n"
                + " ddd: el tipo de documento. (ejemplo: “081”)\n"
                + "ppppp: número de caja. (ejemplo: “00001”)\n"
                + "nnnnnnnn: el número de documento. (ejemplo: “00000027”)\n"
                + " Se validará la existencia de un CUIT válido en el campo número 20 (Número de Documento del "
                + "transportista/beneficiario) al emitir documentos Remito X o Remito R. Ya que es requerido que el "
                + "tipo de documento del transportista sea un CUIT.\n"
                + " En el caso de emitir un documento Donación (cód. 907) los siguientes campos de entrada son\n"
                + "obligatorios:\n"
                + "- Campo número 14: Razón social del transportista/beneficiario, línea #1\n"
                + "- Campo número 16: Domicilio del transportista/beneficiario, línea #1\n"
                + "- Campo número 19: Tipo de Documento del transportista/beneficiario\n"
                + "- Campo número 20: Número de Documento del transportista/beneficiario";
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
            new TipoExtension(0b0000000001000000, "DESCRIPCIONES",
            "NO_ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000000000000,
            "ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000001000000),
            new TipoExtension(0b0000000010000000, "ATRIBUTOS_IMPRESION (DNFH de farmacia, talón de envío a domicilio, talón de cambio).",
            "NO_ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000000000000,
            "ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "DESCRIPCIONES EXTRA",
            "ALMACENA_TODAS_LAS_DESCRIPCIONES_EXTRAS", 0b0000000000000000,
            "ALMACENA_SOLO_PRIMER_DESCRIPCION_EXTRA", 0b0000000100000000)
        };
    }

}
