package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: SubtotalTiqueNC, <br>
* Retorna el subtotal facturado dentro del tique o tique-nota de crédito.<br>
* Notas: <br>
* Requerimientos: Debe haberse emitido un ítem<br>
* La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes o pagos dentro del tique.<br>
* Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del tique (bruto)<br>
* 
*/
public class SubtotalTiqueNC extends TipoComandoFiscal {

    public SubtotalTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"SubtotalTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Retorna el subtotal facturado dentro del tique o tique-nota de crédito.";
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
    public int getCodigo() {
        return 0x0A03;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Imprime",
            "IMPRIMIR_SUBTOTAL", 0b0000000000000000,
            "NO_IMPRIMIR_SUBTOTAL", 0b0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique (bruto)", TipoDato.N_10_2, 12, false)
        };
    }

}
