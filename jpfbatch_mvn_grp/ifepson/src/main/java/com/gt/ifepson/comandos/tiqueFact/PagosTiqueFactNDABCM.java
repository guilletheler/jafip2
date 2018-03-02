package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: PagosTiqueFactNDABCM, <br>
* Aplica un pago al tique-factura o nota de débito A/B/C/M en proceso de emisión.<br>
* Notas: Los pagos son opcionales en los tiques<br>
* La impresión de las líneas de pagos se efectúa en el momento del cierre del tique.<br>
* De haber solicitado el bit de la extensión “Incluye pago en arqueo de pagos” es posible que si el<br>
* pago realizado supera el tamaño máximo soportado por el acumulador de arqueo de pagos, el pago<br>
* emitido no quedará registrado en la tabla de arqueo de pagos.<br>
* Los valores aceptados para el campo “Código forma de pago” son:<br>
* 1 - Carta de credito documentario<br>
* 2 - Cartas de credito simple<br>
* 3 - Cheque<br>
* 4 - Cheques cancelatorios<br>
* 5 - Credito documentario<br>
* 6 - Cuenta corriente<br>
* 7 - Deposito<br>
* 8 - Efectivo<br>
* 9 - Endoso de cheque<br>
* 10 - Factura de credito<br>
* 11 - Garantias bancarias<br>
* 12 - Giros<br>
* 13 - Letras de cambio<br>
* 14 - Medios de pago de comercio exterior<br>
* 15 - Orden de pago documentaria<br>
* 16 - Orden de pago simple<br>
* 17 - Pago contra reembolso<br>
* 18 - Remesa documentaria<br>
* 19 - Remesa simple<br>
* 20 - Tarjeta de credito<br>
* 21 - Tarjeta de debito<br>
* 22 - Ticket<br>
* 23 - Transferencia bancaria<br>
* 24 - Transferencia no bancaria<br>
* 99 - Otros medios de pago<br>
* Requerimientos: No superar los máximos permitidos para las operaciones matemáticas.<br>
* El total del tique fiscal debe ser superior a cero.<br>
* No haber superado la máxima cantidad de pagos del documento.<br>
* Para la anulación de un pago, que puede ser parcial o total, el tipo de pago debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente.<br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción extra #1 (OPCIONAL)<br>
* 2	RT	-1	Descripción extra #2 (OPCIONAL)<br>
* 3	N_E	3	Cantidad de cuotas (OPCIONAL)<br>
* 4	RT	-1	Detalle de otra forma de pago (OPCIONAL)<br>
* 5	RT	-1	Detalle de los cupones (OPCIONAL)<br>
* 6	N_E	2	Código de forma de pago<br>
* 7	N_10_2	12	Monto de pago<br>
* Campos de salida: <br>
* 1	N_10_2	12	Monto restante por pagar<br>
* 1	N_10_2	12	Monto de vuelto<br>
* 
*/
public class PagosTiqueFactNDABCM extends TipoComandoFiscal {

    public PagosTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"PagosTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Aplica un pago al tique-factura o nota de débito A/B/C/M en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x0B05;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x05;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Los pagos son opcionales en los tiques\n"
                + "La impresión de las líneas de pagos se efectúa en el momento del cierre del tique.\n"
                + "De haber solicitado el bit de la extensión “Incluye pago en arqueo de pagos” es posible que si el\n"
                + "pago realizado supera el tamaño máximo soportado por el acumulador de arqueo de pagos, el pago\n"
                + "emitido no quedará registrado en la tabla de arqueo de pagos.\n"
                + "Los valores aceptados para el campo “Código forma de pago” son:\n"
                + "1 - Carta de credito documentario\n"
                + "2 - Cartas de credito simple\n"
                + "3 - Cheque\n"
                + "4 - Cheques cancelatorios\n"
                + "5 - Credito documentario\n"
                + "6 - Cuenta corriente\n"
                + "7 - Deposito\n"
                + "8 - Efectivo\n"
                + "9 - Endoso de cheque\n"
                + "10 - Factura de credito\n"
                + "11 - Garantias bancarias\n"
                + "12 - Giros\n"
                + "13 - Letras de cambio\n"
                + "14 - Medios de pago de comercio exterior\n"
                + "15 - Orden de pago documentaria\n"
                + "16 - Orden de pago simple\n"
                + "17 - Pago contra reembolso\n"
                + "18 - Remesa documentaria\n"
                + "19 - Remesa simple\n"
                + "20 - Tarjeta de credito\n"
                + "21 - Tarjeta de debito\n"
                + "22 - Ticket\n"
                + "23 - Transferencia bancaria\n"
                + "24 - Transferencia no bancaria\n"
                + "99 - Otros medios de pago";
    }

    @Override
    public String getRequerimientos() {
        return "No superar los máximos permitidos para las operaciones matemáticas.\n"
                + "El total del tique fiscal debe ser superior a cero.\n"
                + "No haber superado la máxima cantidad de pagos del documento.\n"
                + "Para la anulación de un pago, que puede ser parcial o total, el tipo de pago debe haber sido aplicado con anterioridad y el monto a anular debe ser igual al aplicado anteriormente.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Pago",
            "PAGO", 0b0000000000000000,
            "ANULACION_PAGO", 0b0000000000000001),
            new TipoExtension(0b0000000000000010, "Arqueo",
            "INCLUYE_PAGO_ENARQUEO", 0b0000000000000000,
            "NO_INCLUYE_PAGO_ENARQUEO", 0b0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción extra #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Descripción extra #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Cantidad de cuotas", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 4, "Detalle de otra forma de pago", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Detalle de los cupones", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 6, "Código de forma de pago", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 7, "Monto de pago", TipoDato.N_10_2, 12, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Monto restante por pagar", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 1, "Monto de vuelto", TipoDato.N_10_2, 12, false)
        };
    }

}
