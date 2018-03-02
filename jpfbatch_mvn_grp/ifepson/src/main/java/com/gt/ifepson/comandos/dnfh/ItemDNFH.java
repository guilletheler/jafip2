package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ItemDNFH, <br>
* Realiza la emisión de un ítem.<br>
* Notas:  La impresión de las líneas de descripción extra y de descripción será truncada de acuerdo al máximo permitido por línea.<br>
*  Un ítem será igual a otro cuando sean coincidentes en tipo (venta o retorno), descripciones extras<br>
* (sin truncar), descripción (sin truncar), tasa de IVA, impuestos internos, precio unitario y preferencias.<br>
*  El monto facturado de la línea de ítem surge de multiplicar la cantidad por el precio unitario y redondear el valor obtenido a la unidad.<br>
*  Debe existir el ‘código del item MTX’ o el ‘código interno’. En caso de que se envíe ‘código del ítem MTX’ debe enviarse también el campo ‘unidad de referencia MTX’<br>
*  Los valores posibles para el campo de entrada “Código de condición frente al IVA” son: 7 - Gravado.; 2.- Exento.; 1.- No Gravado ; 0.- No Corresponde (utilizado en Documentos tipo C)<br>
*  Los bits Bit 6-7 no son aceptados en un ítem de venta (bit 0 en estado inactivo).<br>
*  Los bits Bit 12-13 no son aceptados en un ítem de venta o en una anulación de ítem de venta. (bit 0 en estado activo o inactivo).<br>
*  Solamente se acepta ítem del tipo ítem de venta (bit 0-2 en estado ‘000’) para el documento Remito R, Remito X, Donación y Recibo X.<br>
*  Sólo se permite un tipo de impuesto interno por ítem. Los valores para el campo “Código unidad de medida” se interpretan como:<br>
* 0 - Sin descripcion<br>
* 1 - Kilogramo<br>
* 2 - Metros<br>
* 3 - Metro cuadrado<br>
* 4 - Metro cubico<br>
* 5 - Litros7 - Unidad<br>
* 8 - Par<br>
* 9 - Docena<br>
* 10 - Quilate<br>
* 11 - Millar<br>
* 12 - Mega u inter act antib<br>
* 13 - Unidad int act inmung<br>
* 14 - Gramo<br>
* 15 - Milimetro<br>
* 16 - Milimetro cubico<br>
* 17 - Kilometro<br>
* 18 - Hectolitro<br>
* 19 - Mega unidad int act inmung<br>
* 20 - Centimetro<br>
* 21 - Kilogramo activo<br>
* 22 - Gramo activo<br>
* 23 - Gramo base<br>
* 24 - Uiacthor<br>
* 25 - Jgo pqt mazo naipes<br>
* 26 - Muiacthor<br>
* 27 - Centimetro cubico<br>
* 28 - Uiactant<br>
* 29 - Tonelada<br>
* 30 - Decametro cubico<br>
* 31 - Hectometro cubico<br>
* 32 - Kilometro cubico<br>
* 33 - Microgramo<br>
* 34 - Nanogramo<br>
* 35 - Picogramo<br>
* 36 - Muiactant<br>
* 37 - Uiactig<br>
* 41 - Miligramo<br>
* 47 - Mililitro<br>
* 48 - Curie<br>
* 49 - Milicurie<br>
* 50 - Microcurie<br>
* 51 - U inter act hormonal<br>
* 52 - Mega u inter act hor<br>
* 53 - Kilogramo base54 - Gruesa<br>
* 55 - Muiactig<br>
* 61 - Kilogramo bruto<br>
* 62 - Pack<br>
* 63 - Horma<br>
* 90 - Reservado<br>
* 91 - Reservado<br>
* 96 - Reservado<br>
* 97 - Reservado<br>
* 99 - Reservado<br>
* Requerimientos:  No superar los máximos permitidos para las operaciones matemáticas.<br>
*  El total facturado de un mismo ítem no puede ser negativo.<br>
*  No haber alcanzado el máximo número de ítems dentro del documento.<br>
*  No haber efectuado descuentos o ajustes, otros tributos o pagos dentro del documento.<br>
*  Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripciòn extra #1 (OPCIONAL)<br>
* 2	RT	-1	Descripciòn extra #2 (OPCIONAL)<br>
* 3	RT	-1	Descripciòn extra #3 (OPCIONAL)<br>
* 4	RT	-1	Descripciòn extra #4 (OPCIONAL)<br>
* 5	RT	-1	Descripciòn del item<br>
* 6	N_5_4	9	Cantidad<br>
* 7	N_7_4	11	Precio Unitario (OPCIONAL)<br>
* 8	N_0_4	4	Tasa de IVA (Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, la tasa deberá ser cero.) (OPCIONAL)<br>
* 9	N_7_4	11	Impuesto Interno Fijo (OPCIONAL)<br>
* 10	N_0_8	8	Coeficiente de impuestos internos porcentuales (OPCIONAL)<br>
* 11	N_E	6	Unidad de referencia MTX (OPCIONAL)<br>
* 12	A	13	Código del item MTX (OPCIONAL)<br>
* 13	A	50	Código interno (OPCIONAL)<br>
* 14	N_E	2	Código de unidad de medida<br>
* 15	N_E	1	Código de condicion frente al IVA (OPCIONAL)<br>
* 16	RT	-1	Monto del item en palabras (Obligatorio para documentos Remito R y Remito X.) (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del documento<br>
* 
*/
public class ItemDNFH extends TipoComandoFiscal {

    public ItemDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ItemDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la emisión de un ítem.";
    }

    @Override
    public int getCodigo() {
        return 0x1002;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x02;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresión de las líneas de descripción extra y de descripción será truncada de acuerdo al máximo permitido por línea.\n"
                + " Un ítem será igual a otro cuando sean coincidentes en tipo (venta o retorno), descripciones extras\n"
                + "(sin truncar), descripción (sin truncar), tasa de IVA, impuestos internos, precio unitario y preferencias.\n"
                + " El monto facturado de la línea de ítem surge de multiplicar la cantidad por el precio unitario y redondear el valor obtenido a la unidad.\n"
                + " Debe existir el ‘código del item MTX’ o el ‘código interno’. En caso de que se envíe ‘código del ítem MTX’ debe enviarse también el campo ‘unidad de referencia MTX’\n"
                + " Los valores posibles para el campo de entrada “Código de condición frente al IVA” son: 7 - Gravado.; 2.- Exento.; 1.- No Gravado ; 0.- No Corresponde (utilizado en Documentos tipo C)\n"
                + " Los bits Bit 6-7 no son aceptados en un ítem de venta (bit 0 en estado inactivo).\n"
                + " Los bits Bit 12-13 no son aceptados en un ítem de venta o en una anulación de ítem de venta. (bit 0 en estado activo o inactivo).\n"
                + " Solamente se acepta ítem del tipo ítem de venta (bit 0-2 en estado ‘000’) para el documento Remito R, Remito X, Donación y Recibo X.\n"
                + " Sólo se permite un tipo de impuesto interno por ítem."
                + " Los valores para el campo “Código unidad de medida” se interpretan como:\n"
                + "0 - Sin descripcion\n"
                + "1 - Kilogramo\n"
                + "2 - Metros\n"
                + "3 - Metro cuadrado\n"
                + "4 - Metro cubico\n"
                + "5 - Litros"
                + "7 - Unidad\n"
                + "8 - Par\n"
                + "9 - Docena\n"
                + "10 - Quilate\n"
                + "11 - Millar\n"
                + "12 - Mega u inter act antib\n"
                + "13 - Unidad int act inmung\n"
                + "14 - Gramo\n"
                + "15 - Milimetro\n"
                + "16 - Milimetro cubico\n"
                + "17 - Kilometro\n"
                + "18 - Hectolitro\n"
                + "19 - Mega unidad int act inmung\n"
                + "20 - Centimetro\n"
                + "21 - Kilogramo activo\n"
                + "22 - Gramo activo\n"
                + "23 - Gramo base\n"
                + "24 - Uiacthor\n"
                + "25 - Jgo pqt mazo naipes\n"
                + "26 - Muiacthor\n"
                + "27 - Centimetro cubico\n"
                + "28 - Uiactant\n"
                + "29 - Tonelada\n"
                + "30 - Decametro cubico\n"
                + "31 - Hectometro cubico\n"
                + "32 - Kilometro cubico\n"
                + "33 - Microgramo\n"
                + "34 - Nanogramo\n"
                + "35 - Picogramo\n"
                + "36 - Muiactant\n"
                + "37 - Uiactig\n"
                + "41 - Miligramo\n"
                + "47 - Mililitro\n"
                + "48 - Curie\n"
                + "49 - Milicurie\n"
                + "50 - Microcurie\n"
                + "51 - U inter act hormonal\n"
                + "52 - Mega u inter act hor\n"
                + "53 - Kilogramo base"
                + "54 - Gruesa\n"
                + "55 - Muiactig\n"
                + "61 - Kilogramo bruto\n"
                + "62 - Pack\n"
                + "63 - Horma\n"
                + "90 - Reservado\n"
                + "91 - Reservado\n"
                + "96 - Reservado\n"
                + "97 - Reservado\n"
                + "99 - Reservado";

    }

    @Override
    public String getRequerimientos() {
        return " No superar los máximos permitidos para las operaciones matemáticas.\n"
                + " El total facturado de un mismo ítem no puede ser negativo.\n"
                + " No haber alcanzado el máximo número de ítems dentro del documento.\n"
                + " No haber efectuado descuentos o ajustes, otros tributos o pagos dentro del documento.\n"
                + " Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000001000, "ACCIONES_SOBRE_ITEMS",
            "ITEM_DNFH", 0b0000000000000000,
            "ANNULACION_ITEM_DNFH", 0b0000000000000001,
            "ITEM_RETORNO_ENVASES", 0b0000000000000010,
            "AJUSTE_ITEM_RETORNO_ENVASES", 0b0000000000000011,
            "ITEM_BONIFICACION", 0b0000000000000100,
            "AJUSTE_ITEM_BONIFICACION", 0b0000000000000101,
            "ITEM_DESCUENTO", 0b0000000000000110,
            "AJUSTE_ITEM_DESCUENTO", 0b0000000000000111,
            "ITEM_SEÑA_ANTICIPO", 0b0000000000001000,
            "AJUSTE_ITEM_SEÑA_ANTICIPO", 0b0000000000001001,
            "ITEM_DESCUENTO_SEÑA_ANTICIPO", 0b0000000000001010,
            "AJUSTE_ITEM_DESCUENTO_SEÑA_ANTICIPO", 0b0000000000001011),
            new TipoExtension(0b0000000000010000, "ENVIA_CAMPO_SUBTOTAL_PARCIAL_DNFH", 
            "NO_ENVIA_CAMPO_SUBTOTAL_PACIAL_DNFH", 0b0000000000000000,
            "ENVIA_CAMPO_SUBTOTAL_PACIAL_DNFH", 0b0000000000010000),
            new TipoExtension(0b0000000011000000, "CONTABILIZAR_ITEM_DNFH", 
            "CONTABILIZAR_ITEM_DNFH_IGUAL_CANTIDAD_Q", 0b0000000000000000,
            "CONTABILIZAR_ITEM_DNFH_CANTIDAD_UNITARIA_(BULTO)", 0b0000000001000000,
            "NO_CONTABILIZAR_ITEM_DNFH_CANTIDAD_UNITARIA", 0b0000000010000000),
            new TipoExtension(0b0001000000000000, "IMPRIME_LEYENDA", 
            "IMPRIME_LEYENDA_CORTA", 0b0000000000000000,
            "IMPRIME_LEYENDA_LARGA", 0b0001000000000000),
            new TipoExtension(0b0010000000000000, "IMPRIME_LEYENDA_EN_LINEA", 
            "IMPRIME_LEYENDA_EN_LINEA_DE_IMPORTE_DEL_ITEM", 0b0000000000000000,
            "IMPRIME_LEYENDA_EN_LA_PRIMERA_LINEA_DE_DESCRIPCION", 0b0010000000000000),
            new TipoExtension(0b0100000000000000, "CONCIDERA_PARAMETROS_COMO", 
            "CONCIDERA_PARAMETROS_COMO_MONTOS_NETOS", 0b0000000000000000,
            "CONCIDERA_PARAMETROS_COMO_MONTOS_BRUTOS", 0b0100000000000000),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
         return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripciòn extra #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Descripciòn extra #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Descripciòn extra #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Descripciòn extra #4", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Descripciòn del item", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 6, "Cantidad", TipoDato.N_5_4, 9, false),
            new TipoCampoFiscal(this, 7, "Precio Unitario", TipoDato.N_7_4, 11, true),
            new TipoCampoFiscal(this, 8, "Tasa de IVA (Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, la tasa deberá ser cero.)", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 9, "Impuesto Interno Fijo", TipoDato.N_7_4, 11, true),
            new TipoCampoFiscal(this, 10, "Coeficiente de impuestos internos porcentuales", TipoDato.N_0_8, 8, true),
            new TipoCampoFiscal(this, 11, "Unidad de referencia MTX", TipoDato.N_E, 6, true),
            new TipoCampoFiscal(this, 12, "Código del item MTX", TipoDato.A, 13, true),
            new TipoCampoFiscal(this, 13, "Código interno", TipoDato.A, 50, true),
            new TipoCampoFiscal(this, 14, "Código de unidad de medida", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 15, "Código de condicion frente al IVA", TipoDato.N_E, 1, true),
            new TipoCampoFiscal(this, 16, "Monto del item en palabras (Obligatorio para documentos Remito R y Remito X.)", TipoDato.RT, -1, true),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del documento", TipoDato.N_10_2, 12, false)
        };
    }

}
