package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: SubtotalNotaCreditoABCM, <br>
* Subtotal<br>
* Notas: <br>
* Requerimientos: Debe haberse emitido un ítem<br>
* La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes, otros<br>
* tributos o pagos dentro del tique-nota de crédito.<br>
* Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del tique-nota de crédito (bruto) (OPCIONAL)<br>
* 1	N_10_2	12	Subtotal parcial del tique-nota de crédito (neto) (OPCIONAL)<br>
* 
*/
public class SubtotalNotaCreditoABCM extends TipoComandoFiscal {

    public SubtotalNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"SubtotalNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Subtotal";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Debe haberse emitido un ítem\n"
                + "La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes, otros\n"
                + "tributos o pagos dentro del tique-nota de crédito.\n"
                + "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public int getCodigo() {
        return 0x0D03;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Imprime",
            "IMPRIMIR_SUBTOTAL", 0b0000000000000000,
            "NO_IMPRIMIR_SUBTOTAL", 0b0000000000000001),
            new TipoExtension(0b0000000000001100, "Devolucion",
            "DEVUELVE_SOLO_CAMPO_TOTAL_BRUTO", 0b0000000000000000,
            "DEVUELVE_SOLO_CAMPO_TOTAL_NETO", 0b0000000000000100,
            "DEVUELVE_AMBOS_TOTALES", 0b0000000000001000,
            "NO_DEVUELVE_NADA", 0b0000000000001100)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique-nota de crédito (bruto)", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique-nota de crédito (neto)", TipoDato.N_10_2, 12, true)
        };
    }
}
