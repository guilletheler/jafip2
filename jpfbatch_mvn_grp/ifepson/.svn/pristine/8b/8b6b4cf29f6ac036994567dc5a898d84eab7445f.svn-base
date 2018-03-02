package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: OtrosTributosTiqueFactNDABCM, <br>
* Aplica un tributo al tique-factura o nota de débito A/B/C/M en proceso de emisión.<br>
* Notas: La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* No haber superado la máxima cantidad de tributos del documento.<br>
* Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente. <br>
*  La tasa de IVA asociada sólo es utilizada para el caso del tributo con código 06 (“Percepción de<br>
* tasa de IVA”).<br>
*  El tipo de tributo con con código 06 (“Percepción de tasa de IVA”) sólo es aceptado Documentos A<br>
* o M.<br>
*  En Documentos C no se aceptan los códigos 06, 07 y 08 (“Percepción de tasa de IVA”, “Percepción<br>
* de ingresos brutos” y “Percepción por impuestos municipales”).<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción del Tributo<br>
* 2	N_10_2	12	Monto del Tributo<br>
* 3	N_0_4	4	Tasa de IVA asociada (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial (bruto) (OPCIONAL)<br>
* 
*/
public class OtrosTributosTiqueFactNDABCM extends TipoComandoFiscal {

    public OtrosTributosTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"OtrosTributosTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un tributo al tique-factura o nota de débito A/B/C/M en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x0B20;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x20;
        return ret;
    }

    @Override
    public String getNotas() {
        return "La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "No haber superado la máxima cantidad de tributos del documento.\n"
                + "Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente. \n"
                + " La tasa de IVA asociada sólo es utilizada para el caso del tributo con código 06 (“Percepción de\n"
                + "tasa de IVA”).\n"
                + " El tipo de tributo con con código 06 (“Percepción de tasa de IVA”) sólo es aceptado Documentos A\n"
                + "o M.\n"
                + " En Documentos C no se aceptan los códigos 06, 07 y 08 (“Percepción de tasa de IVA”, “Percepción\n"
                + "de ingresos brutos” y “Percepción por impuestos municipales”).";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Agrega o Anula",
            "AGREGA_TRIBUTO", 0x0000000000000000,
            "ANULA_TRIBUTO", 0x0000000000000001),
            new TipoExtension(0b0000001111000000, "Tipo",
            "PERCEPCION_DE_INGRESOS_BRUTOS", 0b0000000000000000,
            "PERCEPCION_DE_INGRESOS_MUNICIPALES", 0b00000000001000000,
            "IMPUESTO_NACIONAL",0b0000000010000000,
            "IMPUESTO_PROVINCIAL", 0b0000000011000000,
            "PERCEPCION_DE_IVA", 0b0000000100000000,
            "IMPUESTO_MUNICIPAL", 0b0000000101000000,
            "IMPUESTOS_INTERNOS", 0b0000000110000000,
            "INGRESOS_BRUTOS", 0b0000000111000000,
            "OTRAS_PERCEPCIONES", 0b0000001000000000,
            "OTROS", 0b0000001001000000),
            new TipoExtension(0b0000010000000000, "Subtotal",
            "DEVUELVE_SUBTOTAL_PARCIAL", 0x0000000000000000,
            "NO_DEVUELVE_SUBTOTAL_PARCIAL", 0b0000010000000000)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción del Tributo", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Monto del Tributo", TipoDato.N_10_2, 12, false),
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
