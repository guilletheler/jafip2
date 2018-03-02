package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: DescuentosAjustesGlobalesTiqueFactNCABCM, <br>
* Aplica un descuento o ajuste global/particular a los montos facturados en el tique-factura o nota de débito<br>
* A/B/C/M.<br>
* Notas:  La impresión de las líneas de descuentos y ajustes globales se efectúa en el momento del cierre del<br>
* tique-factura o nota de débito fiscal.<br>
*  Los valores aceptados en el campo “Código condición frente al IVA” son:<br>
* 0 – No corresponde.<br>
* 1 – No gravado.<br>
* 2 – Exento.<br>
* 7 – Gravado.<br>
* En caso de enviar un valor distinto de cero en el campo “Tasa de IVA”, sólo se acepta el valor 7 (gravado)<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* El total del tique-factura o nota de débito fiscal debe ser superior a cero.<br>
* No haber efectuado pagos dentro del tique-factura o nota de débito fiscal.<br>
* No haber superado la máxima cantidad de descuentos o ajustes globales dentro del tique.<br>
* A fin de emitir descuentos globales se debe enviar vacío el campo número tres (3) Tasa de IVA. De<br>
* lo contrario se emitirá un descuento o ajuste particular.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción<br>
* 2	N_10_2	12	Monto de descuento/ajuste global<br>
* 3	N_0_4	12	Tasa de IVA (Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, esta tasa debe ser cero.) (OPCIONAL)<br>
* 4	A	50	Código interno<br>
* 5	N_E	1	Código de condición frente al IVA (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del tique (bruto)<br>
* 
*/
public class DescuentosAjustesGlobalesTiqueFactNCABCM extends TipoComandoFiscal {

    public DescuentosAjustesGlobalesTiqueFactNCABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"DescuentosAjustesGlobalesTiqueFactNCABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un descuento o ajuste global/particular a los montos facturados en el tique-factura o nota de débito\n"
                + "A/B/C/M.";
    }

    @Override
    public int getCodigo() {
        return 0x0B04;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x04;
        return ret;
    }
    
    @Override
    public String getNotas() {
        return " La impresión de las líneas de descuentos y ajustes globales se efectúa en el momento del cierre del\n"
                + "tique-factura o nota de débito fiscal.\n"
                + " Los valores aceptados en el campo “Código condición frente al IVA” son:\n"
                + "0 – No corresponde.\n"
                + "1 – No gravado.\n"
                + "2 – Exento.\n"
                + "7 – Gravado.\n"
                + "En caso de enviar un valor distinto de cero en el campo “Tasa de IVA”, sólo se acepta el valor 7 (gravado)";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "El total del tique-factura o nota de débito fiscal debe ser superior a cero.\n"
                + "No haber efectuado pagos dentro del tique-factura o nota de débito fiscal.\n"
                + "No haber superado la máxima cantidad de descuentos o ajustes globales dentro del tique.\n"
                + "A fin de emitir descuentos globales se debe enviar vacío el campo número tres (3) Tasa de IVA. De\n"
                + "lo contrario se emitirá un descuento o ajuste particular.";
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
            new TipoCampoFiscal(this, 1, "Subtotal parcial del tique (bruto)", TipoDato.N_10_2, 12, false)
        };
    }

}
