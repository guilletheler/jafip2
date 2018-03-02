package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: SubtotalDNFH, <br>
* Retorna el Subtotal acumulado<br>
* Notas: No posee Notas<br>
* Requerimientos:  Debe haberse emitido un ítem<br>
*  La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes, otros<br>
* tributos o pagos dentro del documento.<br>
*  Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial (BRUTO) (OPCIONAL)<br>
* 2	N_10_2	12	Subtotal parcial (NETO) (OPCIONAL)<br>
* 
*/
public class SubtotalDNFH extends TipoComandoFiscal {

    public SubtotalDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"SubtotalDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Retorna el Subtotal acumulado";
    }

    @Override
    public int getCodigo() {
        return 0x1003;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee Notas";
    }

    @Override
    public String getRequerimientos() {
        return " Debe haberse emitido un ítem\n"
                + " La impresión del subtotal se realiza solamente si no se han efectuado descuentos, ajustes, otros\n"
                + "tributos o pagos dentro del documento.\n"
                + " Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIME_SUBTOTAL",
            "IMPRIME_SUBTOTAL", 0b0000000000000000,
            "NO_IMPRIME_SUBTOTAL", 0b0000000000000001),
            new TipoExtension(0b0000000000001100, "DEVUELVE_CAMPO_TOTAL_BRUTO_NETO",
            "DEVUELVE_CAMPO_TOTAL_BRUTO", 0b0000000000000000,
            "DEVUELVE_CAMPO_TOTAL_NETO", 0b0000000000000100,
            "DEVUELVE_AMBOS_CAMPOS_TOTALES_BRUTO_Y_NETO", 0b0000000000001000,
            "NO_DEVUELVE_NINGUN_CAMPO", 0b0000000000001100),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial (BRUTO)", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 2, "Subtotal parcial (NETO)", TipoDato.N_10_2, 12, true)
        };
    }

}
