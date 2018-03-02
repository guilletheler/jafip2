package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: OtrosTributosTiqueNC, <br>
* Otros Tributos<br>
* Notas: La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* No haber superado la máxima cantidad de tributos del documento.<br>
* Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción<br>
* 2	N_10_2	12	Monto<br>
* 3	N_0_4	4	Tasa de IVA asociada (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial (bruto) (OPCIONAL)<br>
* 
*/
public class OtrosTributosTiqueNC extends TipoComandoFiscal {

    public OtrosTributosTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"OtrosTributosTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Otros Tributos";
    }

    @Override
    public String getNotas() {
        return "La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "No haber superado la máxima cantidad de tributos del documento.\n"
                + "Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente.";
    }

    @Override
    public int getCodigo() {
        return 0x0A20;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x20;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Agrega o Anula",
            "AGREGA_TRIBUTO", 0x0000000000000000,
            "ANULA_TRIBUTO", 0x0000000000000001),
            new TipoExtension(0b0000001111000000, "Tipo",
            "IMPUESTO_NACIONAL", 0b0000000010000000,
            "IMPUESTO_NACIONAL", 0b0000000010000000,
            "IMPUESTO_PROVINCIAL", 0b0000000011000000,
            "IMPUESTO_MUNICIPAL", 0b0000000101000000,
            "IMPUESTOS_INTERNOS", 0b0000000110000000,
            "INGRESOS_BRUTOS", 0b0000000111000000,
            "OTROS", 0b0000001001000000),
            new TipoExtension(0b0000010000000000, "Subtotal",
            "DEVUELVE_SUBTOTAL_PARCIAL", 0x0000000000000000,
            "NO_DEVUELVE_SUBTOTAL_PARCIAL", 0b0000010000000000)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Monto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Tasa de IVA asociada", TipoDato.N_0_4, 4, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial (bruto)", TipoDato.N_10_2, 12, true)
        };
    }

}
