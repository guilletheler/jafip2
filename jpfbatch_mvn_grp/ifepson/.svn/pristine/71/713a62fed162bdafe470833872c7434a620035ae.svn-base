package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: TiqueNCUnitario, <br>
* Realiza la emisión de un tique que posee un único ítem de venta y un solo pago, el cual es opcional. La emisión de este comprobante se realiza de forma más rápida que su equivalente utilizando los comandos normales de tique.<br>
* Notas:  La impresión de las líneas de descripción extra y de descripción será truncada de acuerdo al máximo<br>
* permitido por línea.<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* Mecanismo impresor en línea y con papel<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción extra #1 (OPCIONAL)<br>
* 2	RT	-1	Descripción extra #2 (OPCIONAL)<br>
* 3	RT	-1	Descripción extra #3 (OPCIONAL)<br>
* 4	RT	-1	Descripción extra #4 (OPCIONAL)<br>
* 5	RT	-1	Descripción del item<br>
* 6	N_5_4	9	Cantidad<br>
* 7	N_7_4	11	Precio Unitario<br>
* 8	N_0_4	4	Tasa de IVA<br>
* 9	N_7_4	11	Impuestos internos fijos (OPCIONAL)<br>
* 10	N_0_8	8	Coeficiente de impuestos internos porcentuales (OPCIONAL)<br>
* 11	N_E	6	Unidad de referencia MTX (OPCIONAL)<br>
* 12	A	13	Codigo de ítem MTX (OPCIONAL)<br>
* 13	A	50	Codigo interno (OPCIONAL)<br>
* 14	N_E	2	Codigo de unidad de medida<br>
* 15	N_E	1	Codigo de condición frente al IVA (OPCIONAL)<br>
* 16	RT	-1	Descripción extra #1 (OPCIONAL)<br>
* 17	RT	-1	Descripción extra #2 (OPCIONAL)<br>
* 18	N_E	3	Cantidad de cuotas (OPCIONAL)<br>
* 19	RT	-1	Detalle de otra forma de pago (OPCIONAL)<br>
* 20	RT	-1	Detalle de los cupones (OPCIONAL)<br>
* 21	N_E	2	Código de forma de pago<br>
* 22	N_10_2	12	Monto de pago<br>
* 23	N_E	3	Número de línea de cola de reemplazo #1 (OPCIONAL)<br>
* 24	RT	-1	Descripción de reemplazo #1 (OPCIONAL)<br>
* 25	N_E	3	Número de línea de cola de reemplazo #2 (OPCIONAL)<br>
* 26	RT	-1	Descripción de reemplazo #2 (OPCIONAL)<br>
* 27	N_E	3	Número de línea de cola de reemplazo #3 (OPCIONAL)<br>
* 28	RT	-1	Descripción de reemplazo #3 (OPCIONAL)<br>
* 29	N_E	1	Líneas reservadas para la firma (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	8	Número de tique/tique nota de crédito<br>
* 2	N_10_2	12	Monto total<br>
* 3	N_10_2	12	Monto total de IVA del tique/tique nota de crédito<br>
* 4	N_10_2	12	Vuelto<br>
* 
*/
public class TiqueNCUnitario extends TipoComandoFiscal {

    public TiqueNCUnitario() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"TiqueNCUnitario"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la emisión de un tique que posee un único ítem de venta y un solo pago, el cual es opcional. "
                + "La emisión de este comprobante se realiza de forma más rápida que su equivalente utilizando los comandos normales de tique.";
    }

    @Override
    public String getNotas() {
        return " La impresión de las líneas de descripción extra y de descripción será truncada de acuerdo al máximo\n"
                + "permitido por línea.";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "Mecanismo impresor en línea y con papel";
    }

    @Override
    public int getCodigo() {
        return 0x0A30;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x30;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Respuesta",
            "NO_DEVUELVE_RESPUESTA", 0b0000000000000000,
            "DEVUELVE_RESPUESTA", 0b0000000000000001),
            new TipoExtension(0b0100000000000000, "Imprimir",
            "IMPRIMIRT_TIQUE", 0b0000000000000000,
            "NO_IMPRIMIRT_TIQUE", 0b0100000000000000)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción extra #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Descripción extra #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Descripción extra #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Descripción extra #4", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Descripción del item", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 6, "Cantidad", TipoDato.N_5_4, 9, false),
            new TipoCampoFiscal(this, 7, "Precio Unitario", TipoDato.N_7_4, 11, false),
            new TipoCampoFiscal(this, 8, "Tasa de IVA", TipoDato.N_0_4, 4, false),
            new TipoCampoFiscal(this, 9, "Impuestos internos fijos", TipoDato.N_7_4, 11, true),
            new TipoCampoFiscal(this, 10, "Coeficiente de impuestos internos porcentuales", TipoDato.N_0_8, 8, true),
            new TipoCampoFiscal(this, 11, "Unidad de referencia MTX", TipoDato.N_E, 6, true),
            new TipoCampoFiscal(this, 12, "Codigo de ítem MTX", TipoDato.A, 13, true),
            new TipoCampoFiscal(this, 13, "Codigo interno", TipoDato.A, 50, true),
            new TipoCampoFiscal(this, 14, "Codigo de unidad de medida", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 15, "Codigo de condición frente al IVA", TipoDato.N_E, 1, true),
            new TipoCampoFiscal(this, 16, "Descripción extra #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 17, "Descripción extra #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 18, "Cantidad de cuotas", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 19, "Detalle de otra forma de pago", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 20, "Detalle de los cupones", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 21, "Código de forma de pago", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 22, "Monto de pago", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 23, "Número de línea de cola de reemplazo #1", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 24, "Descripción de reemplazo #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 25, "Número de línea de cola de reemplazo #2", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 26, "Descripción de reemplazo #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 27, "Número de línea de cola de reemplazo #3", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 28, "Descripción de reemplazo #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 29, "Líneas reservadas para la firma", TipoDato.N_E, 1, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de tique/tique nota de crédito", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Monto total", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Monto total de IVA del tique/tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Vuelto", TipoDato.N_10_2, 12, false)
        };
    }

}
