package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ImprimirMultiplesLineasDeTextoDNFHGenerico, <br>
* Imprime treinta (30) líneas de texto no fiscal homologado genérico o de uso interno.<br>
* Notas: Cada 8 (ocho) líneas enviadas la impresora fiscal imprimirá automáticamente una línea de texto<br>
* identificando que se trata de un documento no fiscal homologado.<br>
*  Además cada 60 (sesenta) líneas enviadas la impresora emitirá un cartel indicando que no se trata<br>
* de un documento fiscal e indicando si el documento es para entregar al cliente o de uso interno.<br>
* Requerimientos: Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	RT	-1	Línea de texto #1 (OPCIONAL)<br>
* 2	RT	-1	Línea de texto #2 (OPCIONAL)<br>
* 3	RT	-1	Línea de texto #3 (OPCIONAL)<br>
* 4	RT	-1	Línea de texto #4 (OPCIONAL)<br>
* 5	RT	-1	Línea de texto #5 (OPCIONAL)<br>
* 6	RT	-1	Línea de texto #6 (OPCIONAL)<br>
* 7	RT	-1	Línea de texto #7 (OPCIONAL)<br>
* 8	RT	-1	Línea de texto #8 (OPCIONAL)<br>
* 9	RT	-1	Línea de texto #9 (OPCIONAL)<br>
* 10	RT	-1	Línea de texto #10 (OPCIONAL)<br>
* 11	RT	-1	Línea de texto #11 (OPCIONAL)<br>
* 12	RT	-1	Línea de texto #12 (OPCIONAL)<br>
* 13	RT	-1	Línea de texto #13 (OPCIONAL)<br>
* 14	RT	-1	Línea de texto #14 (OPCIONAL)<br>
* 15	RT	-1	Línea de texto #15 (OPCIONAL)<br>
* 16	RT	-1	Línea de texto #16 (OPCIONAL)<br>
* 17	RT	-1	Línea de texto #17 (OPCIONAL)<br>
* 18	RT	-1	Línea de texto #18 (OPCIONAL)<br>
* 19	RT	-1	Línea de texto #19 (OPCIONAL)<br>
* 20	RT	-1	Línea de texto #20 (OPCIONAL)<br>
* 21	RT	-1	Línea de texto #21 (OPCIONAL)<br>
* 22	RT	-1	Línea de texto #22 (OPCIONAL)<br>
* 23	RT	-1	Línea de texto #23 (OPCIONAL)<br>
* 24	RT	-1	Línea de texto #24 (OPCIONAL)<br>
* 25	RT	-1	Línea de texto #25 (OPCIONAL)<br>
* 26	RT	-1	Línea de texto #26 (OPCIONAL)<br>
* 27	RT	-1	Línea de texto #27 (OPCIONAL)<br>
* 28	RT	-1	Línea de texto #28 (OPCIONAL)<br>
* 29	RT	-1	Línea de texto #29 (OPCIONAL)<br>
* 30	RT	-1	Línea de texto #30 (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class ImprimirMultiplesLineasDeTextoDNFHGenerico extends TipoComandoFiscal {

    public ImprimirMultiplesLineasDeTextoDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ImprimirMultiplesLineasDeTextoDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Imprime treinta (30) líneas de texto no fiscal homologado genérico o de uso interno.";
    }

    @Override
    public int getCodigo() {
        return 0x0E03;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Cada 8 (ocho) líneas enviadas la impresora fiscal imprimirá automáticamente una línea de texto\n"
                + "identificando que se trata de un documento no fiscal homologado.\n"
                + " Además cada 60 (sesenta) líneas enviadas la impresora emitirá un cartel indicando que no se trata\n"
                + "de un documento fiscal e indicando si el documento es para entregar al cliente o de uso interno.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Línea de texto #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Línea de texto #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Línea de texto #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Línea de texto #4", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Línea de texto #5", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 6, "Línea de texto #6", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Línea de texto #7", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 8, "Línea de texto #8", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 9, "Línea de texto #9", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 10, "Línea de texto #10", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 11, "Línea de texto #11", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 12, "Línea de texto #12", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 13, "Línea de texto #13", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 14, "Línea de texto #14", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 15, "Línea de texto #15", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 16, "Línea de texto #16", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 17, "Línea de texto #17", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 18, "Línea de texto #18", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 19, "Línea de texto #19", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 20, "Línea de texto #20", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 21, "Línea de texto #21", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 22, "Línea de texto #22", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 23, "Línea de texto #23", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 24, "Línea de texto #24", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 25, "Línea de texto #25", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 26, "Línea de texto #26", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 27, "Línea de texto #27", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 28, "Línea de texto #28", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 29, "Línea de texto #29", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 30, "Línea de texto #30", TipoDato.RT, -1, true),};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
