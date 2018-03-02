package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeImpuestosInternosNotaCreditoABCM, <br>
* Información de Impuestos Internos<br>
* Notas: La impresora fiscal devolverá 4 campos por cada tasa que haya sido utilizada durante el tique-nota<br>
* de crédito en el orden indicado por campos 4 al 7.<br>
* Si se solicitara sin información discriminada, los campos 4 al 31 se retornarán vacíos.<br>
* Requerimientos: Document Tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Total impuestos internos<br>
* 2	N_10_2	12	Total impuestos internos fijos<br>
* 3	N_10_2	12	Total impuestos internos porcentuales<br>
* 4	N_E	4	Tasa de IVA #1 (OPCIONAL)<br>
* 5	N_10_2	12	Total impuestos internos fijos x tasa #1 (OPCIONAL)<br>
* 6	N_10_2	4	Total impuestos internos porcentuales x tasa #1 (OPCIONAL)<br>
* 7	N_E	4	Tasa de IVA #2 (OPCIONAL)<br>
* 8	N_10_2	12	Total impuestos internos fijos x tasa #2 (OPCIONAL)<br>
* 9	N_10_2	4	Total impuestos internos porcentuales x tasa #2 (OPCIONAL)<br>
* 10	N_E	4	Tasa de IVA #3 (OPCIONAL)<br>
* 11	N_10_2	12	Total impuestos internos fijos x tasa #3 (OPCIONAL)<br>
* 12	N_10_2	4	Total impuestos internos porcentuales x tasa #3 (OPCIONAL)<br>
* 13	N_E	4	Tasa de IVA #4 (OPCIONAL)<br>
* 14	N_10_2	12	Total impuestos internos fijos x tasa #4 (OPCIONAL)<br>
* 15	N_10_2	4	Total impuestos internos porcentuales x tasa #4 (OPCIONAL)<br>
* 16	N_E	4	Tasa de IVA #5 (OPCIONAL)<br>
* 17	N_10_2	12	Total impuestos internos fijos x tasa #5 (OPCIONAL)<br>
* 18	N_10_2	4	Total impuestos internos porcentuales x tasa #5 (OPCIONAL)<br>
* 19	N_E	4	Tasa de IVA #6 (OPCIONAL)<br>
* 20	N_10_2	12	Total impuestos internos fijos x tasa #6 (OPCIONAL)<br>
* 21	N_10_2	4	Total impuestos internos porcentuales x tasa #6 (OPCIONAL)<br>
* 22	N_E	4	Tasa de IVA #7 (OPCIONAL)<br>
* 23	N_10_2	12	Total impuestos internos fijos x tasa #7 (OPCIONAL)<br>
* 24	N_10_2	4	Total impuestos internos porcentuales x tasa #7 (OPCIONAL)<br>
* 
*/
public class InformacionDeImpuestosInternosNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionDeImpuestosInternosNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeImpuestosInternosNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Información de Impuestos Internos";
    }

    @Override
    public String getNotas() {
        return "La impresora fiscal devolverá 4 campos por cada tasa que haya sido utilizada durante el tique-nota\n"
                + "de crédito en el orden indicado por campos 4 al 7.\n"
                + "Si se solicitara sin información discriminada, los campos 4 al 31 se retornarán vacíos.";
    }

    @Override
    public String getRequerimientos() {
        return "Document Tique-nota de crédito abierto.";
    }

    @Override
    public int getCodigo() {
        return 0x0D0E;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x0E;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar tasas",
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000000,
            "CON_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Total impuestos internos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total impuestos internos fijos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total impuestos internos porcentuales", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Tasa de IVA #1", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 5, "Total impuestos internos fijos x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 6, "Total impuestos internos porcentuales x tasa #1", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 7, "Tasa de IVA #2", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 8, "Total impuestos internos fijos x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 9, "Total impuestos internos porcentuales x tasa #2", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 10, "Tasa de IVA #3", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 11, "Total impuestos internos fijos x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 12, "Total impuestos internos porcentuales x tasa #3", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 13, "Tasa de IVA #4", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 14, "Total impuestos internos fijos x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 15, "Total impuestos internos porcentuales x tasa #4", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 16, "Tasa de IVA #5", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 17, "Total impuestos internos fijos x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 18, "Total impuestos internos porcentuales x tasa #5", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 19, "Tasa de IVA #6", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 20, "Total impuestos internos fijos x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 21, "Total impuestos internos porcentuales x tasa #6", TipoDato.N_10_2, 4, true),
            new TipoCampoFiscal(this, 22, "Tasa de IVA #7", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 23, "Total impuestos internos fijos x tasa #7", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 24, "Total impuestos internos porcentuales x tasa #7", TipoDato.N_10_2, 4, true)
        };
    }
}
