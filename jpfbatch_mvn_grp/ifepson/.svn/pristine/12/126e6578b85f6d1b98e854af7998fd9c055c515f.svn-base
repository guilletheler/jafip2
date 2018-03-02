package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: DescuentosAjustesGlobalesNotaCreditoABCM, <br>
* Aplica un descuento o ajuste global a los montos facturados en el tique-nota de crédito A/B/C/M.<br>
* Notas: La impresión de las líneas de descuentos y ajustes se efectúa en el momento del cierre del tique-nota de crédito A/B/C/M.<br>
* Los valores aceptados en el campo “Código condición frente al IVA” son:<br>
* 0 – No corresponde.<br>
* 1 – No gravado.<br>
* 2 – Exento.<br>
* 7 – Gravado.<br>
* En caso de enviar un valor distinto de cero en el campo “Tasa de IVA”, sólo se acepta el valor 7 (gravado)<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* El total del tique-nota de crédito A/B/C/M debe ser superior a cero.<br>
* No haber efectuado otros tributos o pagos dentro del tique-nota de crédito A/B/C/M.<br>
* No haber superado la máxima cantidad de descuentos o ajustes globales dentro del tique-nota de<br>
* crédito A/B/C/M.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción<br>
* 2	N_10_2	12	Monto de descuento/ajuste global<br>
* 3	N_0_4	12	Tasa de IVA (Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, esta tasa debe ser cero.) (OPCIONAL)<br>
* 4	A	50	Código interno<br>
* 5	N_E	1	Código de condición frente al IVA (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del tique-nota de crédito ( En el caso de tique-nota de crédito A/M, el monto devuelto será el neto; para tique-nota de crédito B o C, el monto devuelto será el bruto.)<br>
* 
*/
public class DescuentosAjustesGlobalesNotaCreditoABCM extends TipoComandoFiscal {

    public DescuentosAjustesGlobalesNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"DescuentosAjustesGlobalesNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un descuento o ajuste global a los montos facturados en el tique-nota de crédito A/B/C/M.";
    }

    @Override
    public String getNotas() {
        return "La impresión de las líneas de descuentos y ajustes se efectúa en el momento del cierre del tique-nota de crédito A/B/C/M.\n"
                + "Los valores aceptados en el campo “Código condición frente al IVA” son:\n"
                + "0 – No corresponde.\n"
                + "1 – No gravado.\n"
                + "2 – Exento.\n"
                + "7 – Gravado.\n"
                + "En caso de enviar un valor distinto de cero en el campo “Tasa de IVA”, sólo se acepta el valor 7 (gravado)";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "El total del tique-nota de crédito A/B/C/M debe ser superior a cero.\n"
                + "No haber efectuado otros tributos o pagos dentro del tique-nota de crédito A/B/C/M.\n"
                + "No haber superado la máxima cantidad de descuentos o ajustes globales dentro del tique-nota de\n"
                + "crédito A/B/C/M.";
    }

    @Override
    public int getCodigo() {
        return 0x0D04;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x04;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000011, "TipoAjuste",
            "DESCUENTO", 0b0000000000000000,
            "AJUSTE", 0b0000000000000001,
            "AJUSTE_NEGATIVO", 0b0000000000000010)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Monto de descuento/ajuste global", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Tasa de IVA (Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, esta tasa debe ser cero.)", TipoDato.N_0_4, 12, true),
            new TipoCampoFiscal(this, 4, "Código interno", TipoDato.A, 50, false),
            new TipoCampoFiscal(this, 5, "Código de condición frente al IVA", TipoDato.N_E, 1, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique-nota de crédito ( En el caso de tique-nota de crédito A/M, el monto devuelto será el neto; para tique-nota de crédito B o C, el monto devuelto será el bruto.)", TipoDato.N_10_2, 12, false)
        };
    }

}
