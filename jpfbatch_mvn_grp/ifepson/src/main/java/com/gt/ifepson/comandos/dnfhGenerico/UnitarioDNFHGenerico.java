package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: UnitarioDNFHGenerico, <br>
* Realiza la emisión de un Documento No Fiscal Homologado Genérico o de Uso Inteno Unitario que<br>
* posee como máximo 30 líneas de texto opcional. La emisión de este comprobante se realiza de forma<br>
* más rápida que su equivalente utilizando los comandos normales.<br>
* Notas: Se incrementa en uno el contador de documentos correspondiente.<br>
* Requerimientos:  Memoria fiscal no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* 1	RT	-1	Texto No Fiscal Línea #1 (OPCIONAL)<br>
* 2	RT	-1	Texto No Fiscal Línea #2 (OPCIONAL)<br>
* 3	RT	-1	Texto No Fiscal Línea #3 (OPCIONAL)<br>
* 4	RT	-1	Texto No Fiscal Línea #4 (OPCIONAL)<br>
* 5	RT	-1	Texto No Fiscal Línea #5 (OPCIONAL)<br>
* 6	RT	-1	Texto No Fiscal Línea #6 (OPCIONAL)<br>
* 7	RT	-1	Texto No Fiscal Línea #7 (OPCIONAL)<br>
* 8	RT	-1	Texto No Fiscal Línea #8 (OPCIONAL)<br>
* 9	RT	-1	Texto No Fiscal Línea #9 (OPCIONAL)<br>
* 10	RT	-1	Texto No Fiscal Línea #10 (OPCIONAL)<br>
* 11	RT	-1	Texto No Fiscal Línea #11 (OPCIONAL)<br>
* 12	RT	-1	Texto No Fiscal Línea #12 (OPCIONAL)<br>
* 13	RT	-1	Texto No Fiscal Línea #13 (OPCIONAL)<br>
* 14	RT	-1	Texto No Fiscal Línea #14 (OPCIONAL)<br>
* 15	RT	-1	Texto No Fiscal Línea #15 (OPCIONAL)<br>
* 16	RT	-1	Texto No Fiscal Línea #16 (OPCIONAL)<br>
* 17	RT	-1	Texto No Fiscal Línea #17 (OPCIONAL)<br>
* 18	RT	-1	Texto No Fiscal Línea #18 (OPCIONAL)<br>
* 19	RT	-1	Texto No Fiscal Línea #19 (OPCIONAL)<br>
* 20	RT	-1	Texto No Fiscal Línea #20 (OPCIONAL)<br>
* 21	RT	-1	Texto No Fiscal Línea #21 (OPCIONAL)<br>
* 22	RT	-1	Texto No Fiscal Línea #22 (OPCIONAL)<br>
* 23	RT	-1	Texto No Fiscal Línea #23 (OPCIONAL)<br>
* 24	RT	-1	Texto No Fiscal Línea #24 (OPCIONAL)<br>
* 25	RT	-1	Texto No Fiscal Línea #25 (OPCIONAL)<br>
* 26	RT	-1	Texto No Fiscal Línea #26 (OPCIONAL)<br>
* 27	RT	-1	Texto No Fiscal Línea #27 (OPCIONAL)<br>
* 28	RT	-1	Texto No Fiscal Línea #28 (OPCIONAL)<br>
* 29	RT	-1	Texto No Fiscal Línea #29 (OPCIONAL)<br>
* 30	RT	-1	Texto No Fiscal Línea #30 (OPCIONAL)<br>
* 31	N_E	3	Número de línea de cola de reeemplazo #1 (OPCIONAL)<br>
* 32	RT	-1	Descripcion de reeemplazo #1 (OPCIONAL)<br>
* 33	N_E	3	Número de línea de cola de reeemplazo #2 (OPCIONAL)<br>
* 34	RT	-1	Descripcion de reeemplazo #2 (OPCIONAL)<br>
* 35	N_E	3	Número de línea de cola de reeemplazo #3 (OPCIONAL)<br>
* 36	RT	-1	Descripcion de reeemplazo #3 (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	5	Número de documento no fiscal homologado Genérico/Uso Int.<br>
* 
*/
public class UnitarioDNFHGenerico extends TipoComandoFiscal {

    public UnitarioDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"UnitarioDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la emisión de un Documento No Fiscal Homologado Genérico o de Uso Inteno Unitario que\n"
                + "posee como máximo 30 líneas de texto opcional. La emisión de este comprobante se realiza de forma\n"
                + "más rápida que su equivalente utilizando los comandos normales.";
    }

    @Override
    public int getCodigo() {
        return 0x0E30;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x30;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Se incrementa en uno el contador de documentos correspondiente.";
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
            new TipoExtension(0b0000000000000100, "CORTA_PAPEL",
            "NO_CORTA_PAPEL", 0b0000000000000000,
            "CORTA_PAPEL", 0b0000000000000100),
            new TipoExtension(0b0000000001000000, "IMPRIME_DOCUMENTO_GENERICO_O_INTERNO",
            "IMPRIME_DOC_GENERICO_COD910", 0b0000000000000000,
            "IMPRIME_DOC_DE_USO_INTERNO_COD950", 0b0000000001000000),
            new TipoExtension(0b0000010000000000, "IMPRIME_ENCABEZADOS",
            "IMPRIME_ENCABEZADOS", 0b0000000000000000,
            "NO_IMPRIME_ENCABEZADOS", 0b0000010000000000),
            new TipoExtension(0b0100000000000000, "IMPRIME_ORIGINAL_DUPLICADO",
            "IMPRIME_ORIGINAL", 0b0000000000000000,
            "IMPRIME_ORIGINAL_Y_DUPLICADO", 0b0100000000000000),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Texto No Fiscal Línea #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Texto No Fiscal Línea #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Texto No Fiscal Línea #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Texto No Fiscal Línea #4", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Texto No Fiscal Línea #5", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 6, "Texto No Fiscal Línea #6", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Texto No Fiscal Línea #7", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 8, "Texto No Fiscal Línea #8", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 9, "Texto No Fiscal Línea #9", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 10, "Texto No Fiscal Línea #10", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 11, "Texto No Fiscal Línea #11", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 12, "Texto No Fiscal Línea #12", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 13, "Texto No Fiscal Línea #13", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 14, "Texto No Fiscal Línea #14", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 15, "Texto No Fiscal Línea #15", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 16, "Texto No Fiscal Línea #16", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 17, "Texto No Fiscal Línea #17", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 18, "Texto No Fiscal Línea #18", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 19, "Texto No Fiscal Línea #19", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 20, "Texto No Fiscal Línea #20", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 21, "Texto No Fiscal Línea #21", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 22, "Texto No Fiscal Línea #22", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 23, "Texto No Fiscal Línea #23", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 24, "Texto No Fiscal Línea #24", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 25, "Texto No Fiscal Línea #25", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 26, "Texto No Fiscal Línea #26", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 27, "Texto No Fiscal Línea #27", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 28, "Texto No Fiscal Línea #28", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 29, "Texto No Fiscal Línea #29", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 30, "Texto No Fiscal Línea #30", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 31, "Número de línea de cola de reeemplazo #1", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 32, "Descripcion de reeemplazo #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 33, "Número de línea de cola de reeemplazo #2", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 34, "Descripcion de reeemplazo #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 35, "Número de línea de cola de reeemplazo #3", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 36, "Descripcion de reeemplazo #3", TipoDato.RT, -1, true),};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de documento no fiscal homologado Genérico/Uso Int.", TipoDato.N_E, 5, false),};
    }

}
