package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: SubtotalTiqueFactNDABCM, <br>
* Subtotal<br>
* Notas: <br>
* Requerimientos: Debe haberse emitido un ítem<br>
* La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes o pagos dentro del tique.<br>
* Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del tique-factura o nota de débito (bruto) (OPCIONAL)<br>
* 1	N_10_2	12	Subtotal parcial del tique-factura o nota de débito (neto) (OPCIONAL)<br>
* 
*/
public class SubtotalTiqueFactNDABCM extends TipoComandoFiscal {

    public SubtotalTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"SubtotalTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Subtotal";
    }

    @Override
    public int getCodigo() {
        return 0x0B03;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Debe haberse emitido un ítem\n"
                + "La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes o pagos dentro del tique.\n"
                + "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Imprime",
            "IMPRIMIR_SUBTOTAL", 0b0000000000000000,
            "NO_IMPRIMIR_SUBTOTAL", 0b0000000000000001),
            new TipoExtension(0b0000000000001100, "Devuelve campo total bruto y total neto",
            "TOTAL_BRUTO", 0b0000000000000000,
            "TOTAL_NETO", 0b0000000000000100,
            "TOTAL_NETO_Y_BRUTO", 0b0000000000001000,
            "NI_UN_CAMPO", 0b0000000000001100)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique-factura o nota de débito (bruto)", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique-factura o nota de débito (neto)", TipoDato.N_10_2, 12, true)
        };
    }

}
