package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: DescuentosAjustesGlobalesDNFH, <br>
* Aplica un descuento o ajuste global a los montos facturados en el DNFH<br>
* Notas:  La impresión de las líneas de descuentos y ajustes globales se efectúa en el momento del cierre del documento.<br>
*  Los valores aceptados en el campo “Código condición frente al IVA” son:<br>
* 0 – No corresponde.<br>
* 1 – No gravado.<br>
* 2 – Exento.<br>
* 7 – Gravado.<br>
* Requerimientos:  No superar los máximos permitidos para las operaciones matemáticas.<br>
*  El total del DNFH debe ser superior a cero.<br>
*  No haber efectuado otros tributos o pagos dentro del documento.<br>
*  No haber superado la máxima cantidad de descuentos o ajustes globales en el documento en curso.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripcion<br>
* 2	N_10_2	12	Monto de descuento / ajuste (10,2)<br>
* 3	N_E	4	Tasa de IVA ( Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, esta tasa debe ser cero.) (OPCIONAL)<br>
* 4	A	50	Código interno<br>
* 5	N_E	1	Código de condición frente al IVA (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Subtotal parcial del documento<br>
* 
*/
public class DescuentosAjustesGlobalesDNFH extends TipoComandoFiscal {

    public DescuentosAjustesGlobalesDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"DescuentosAjustesGlobalesDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un descuento o ajuste global a los montos facturados en el DNFH";
    }

    @Override
    public int getCodigo() {
        return 0x1004;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x04;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresión de las líneas de descuentos y ajustes globales se efectúa en el momento del cierre del documento.\n"
                + " Los valores aceptados en el campo “Código condición frente al IVA” son:\n"
                + "0 – No corresponde.\n"
                + "1 – No gravado.\n"
                + "2 – Exento.\n"
                + "7 – Gravado.";
    }

    @Override
    public String getRequerimientos() {
        return " No superar los máximos permitidos para las operaciones matemáticas.\n"
                + " El total del DNFH debe ser superior a cero.\n"
                + " No haber efectuado otros tributos o pagos dentro del documento.\n"
                + " No haber superado la máxima cantidad de descuentos o ajustes globales en el documento en curso.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000011, "DESCUENTO_AJUSTE",
            "DESCUENTO", 0b0000000000000000,
            "AJUSTE", 0b0000000000000001,
            "AJUSTE_NEGATIVO", 0b0000000000000010
            )
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripcion", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Monto de descuento / ajuste (10,2)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Tasa de IVA ( Si la responsabilidad del emisor es IVA no responsable, exento, monotributista o monotributista social, esta tasa debe ser cero.)", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 4, "Código interno", TipoDato.A, 50, false),
            new TipoCampoFiscal(this, 5, "Código de condición frente al IVA", TipoDato.N_E, 1, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Subtotal parcial del documento", TipoDato.N_10_2, 12, false)
        };
    }

}
