package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: OtrosTributosDNFH, <br>
* Aplica un tributo al DNFH en proceso de emisión.<br>
* Notas:  La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.<br>
* Requerimientos:  No superar los máximos permitidos para las operaciones matemáticas.<br>
*  No haber superado la máxima cantidad de tributos del documento.<br>
*  Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad<br>
* y el monto a anular debe ser menor o igual al aplicado anteriormente.<br>
*  La tasa de IVA asociada sólo es utilizada para el caso del tributo con código 06 (“Percepción de<br>
* tasa de IVA”).<br>
*  El tipo de tributo con con código 06 (“Percepción de tasa de IVA”) sólo es aceptado Documentos<br>
* Clase A o M.<br>
*  En Documentos Clase C no se aceptan los códigos 06, 07 y 08 (“Percepción de tasa de IVA”,<br>
* “Percepción de ingresos brutos” y “Percepción por impuestos municipales”).<br>
*  Los Documentos Remito R (091), Remito X (901) y Donaciones (907) no soportan otros tributos.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción<br>
* 2	N_10_2	12	Monto<br>
* 3	N_0_4	4	Tasa de IVA asociada (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	12	Subtotal parcial (BRUTO) (OPCIONAL)<br>
* 
*/
public class OtrosTributosDNFH extends TipoComandoFiscal {

    public OtrosTributosDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"OtrosTributosDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un tributo al DNFH en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x1020;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x20;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresión de las líneas de los tributos se efectúa en el momento del cierre del Documento.";
    }

    @Override
    public String getRequerimientos() {
        return " No superar los máximos permitidos para las operaciones matemáticas.\n"
                + " No haber superado la máxima cantidad de tributos del documento.\n"
                + " Para una anulación, que puede ser parcial o total, el tributo debe haber sido aplicado con anterioridad\n"
                + "y el monto a anular debe ser menor o igual al aplicado anteriormente.\n"
                + " La tasa de IVA asociada sólo es utilizada para el caso del tributo con código 06 (“Percepción de\n"
                + "tasa de IVA”).\n"
                + " El tipo de tributo con con código 06 (“Percepción de tasa de IVA”) sólo es aceptado Documentos\n"
                + "Clase A o M.\n"
                + " En Documentos Clase C no se aceptan los códigos 06, 07 y 08 (“Percepción de tasa de IVA”,\n"
                + "“Percepción de ingresos brutos” y “Percepción por impuestos municipales”).\n"
                + " Los Documentos Remito R (091), Remito X (901) y Donaciones (907) no soportan otros tributos.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "TRIBUTO",
            "AGREGAR_TRIBUTO", 0b0000000000000000,
            "ANULAR_TRIBUTO", 0b0000000000000001),
            new TipoExtension(0b0000001111000000, "PERCEPCION_Y_OTROS",
            "PERCEPCION_DE_INGRESOS_BRUTOS_COD07", 0b0000000000000000,
            "PERCEPCION_POR_INPESTOS_MUNICIPALES_COD08", 0b0000000001000000,
            "IMPUESTOS_NACIONES_COD01", 0b0000000010000000,
            "IMPUESTOS_PROVINCIALES_COD02", 0b0000000011000000,
            "PERCIPCION_DE_IVA", 0b0000000100000000,
            "IMPUESTO_MUNICIPAL_COD03", 0b0000000101000000,
            "IMPUESTO_INTERNO_COD04", 0b0000000110000000,
            "INGRESOS_BRUTOS_COD05", 0b0000000111000000,
            "OTRAS_PERCEPCIONES_COD09", 0b0000001000000000,
            "OTROS_COD99", 0b0000001001000000),
             new TipoExtension(0b0000010000000000, "DEVUELVE_SUBTOTAL_PARCIAL",
            "DEVUELVE_SUBTOTAL_PARCIAL", 0b0000000000000000,
            "NO_DEVUELVE_SUBTOTAL_PARCIAL", 0b0000010000000000),
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
            new TipoCampoFiscal(this, 1, "Subtotal parcial (BRUTO)", TipoDato.N_E, 12, true),
        };
    }

}