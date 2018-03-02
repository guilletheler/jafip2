package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarPreferenciasTiqueNC, <br>
* Configura las diferentes opciones para la emisión de tique o tique-nota de crédito.<br>
* Notas:  La línea de vuelto será impresa sólo si la cantidad pagada es superior o igual al monto del tique.<br>
*  La línea de cantidad x precio será impresa sólo si la cantidad es diferente de la unidad.<br>
*  Los valores válidos para el campo “código de pago automático” son los presentes en la tabla de pagos.<br>
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
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	RT	-1	Descripción del pago automático (OPCIONAL)<br>
* 2	N_E	2	Código del pago automático<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarPreferenciasTiqueNC extends TipoComandoFiscal {

    public ConfigurarPreferenciasTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarPreferenciasTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Configura las diferentes opciones para la emisión de tique o tique-nota de crédito.";
    }

    @Override
    public int getCodigo() {
        return 0x0A08;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x08;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La línea de vuelto será impresa sólo si la cantidad pagada es superior o igual al monto del tique.\n"
                + " La línea de cantidad x precio será impresa sólo si la cantidad es diferente de la unidad.\n"
                + " Los valores válidos para el campo “código de pago automático” son los presentes en la tabla de pagos.\n"
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
        return "";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Total Pagado",
            "NO_IMPRIME_INFORMACION_SOBRE_EL_TOTAL_PAGADO_Y_EL_VUELTO", 0b0000000000000000,
            "IMPRIME_INFORMACION_SOBRE_EL_TOTAL_PAGADO_Y_EL_VUELTO", 0b0000000000000001),
            new TipoExtension(0b0000000000000100, "line feeds",
            "NO_IMPRIME_LINE_FEEDS_SEPARANDO_ANCABEZADO_Y_COLA", 0b0000000000000000,
            "IMPRIME_LINE_FEEDS_SEPARANDO_ANCABEZADO_Y_COLA", 0b0000000000000100),
            new TipoExtension(0b0000000000010000, "linea consumidor final",
            "NO_IMPRIME_LINEA_A_CONSUMIDOR_FINAL", 0b0000000000000000,
            "IMPRIME_LINEA_A_CONSUMIDOR_FINAL", 0b0000000000010000),
            new TipoExtension(0b0000000001000000, "linea domicilio fiscal",
            "NO_IMPRIME_LINEA_DOMICILIO_COMERCIAL", 0b0000000000000000,
            "IMPRIME_LINEA_DOMICILIO_COMERCIAL", 0b0000000001000000),
            new TipoExtension(0b0000000010000000, "linea nombre fantasia",
            "NO_IMPRIME_LINEA_NOMBRE_DE_FANTASIA", 0b0000000000000000,
            "IMPRIME_LINEA_NOMBRE_DE_FANTASIA", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "linea IIBB",
            "NO_IMPRIME_LINEA_DE_IIBB", 0b0000000000000000,
            "IMPRIME_LINEA_DE_IIBB", 0b0000000100000000),
            new TipoExtension(0b0000010000000000, "linea logo",
            "NO_IMPRIME_LINEAS_DE_LOGO", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_LOGO", 0b0000010000000000),
            new TipoExtension(0b0000100000000000, "Pago automático",
            "NO_REALIZA_PAGO_AUTOMATICO", 0b0000000000000000,
            "REALIZA_PAGO_AUTOMATICO", 0b0000100000000000),
            new TipoExtension(0b0001000000000000, "separa palabra TOTAl",
            "NO_SEPARA_LA_PALABRA_TOTAL_CON_LINEAS_EN_BLANCO", 0b0000000000000000,
            "SEPARA_LA_PALABRA_TOTAL_CON_LINEAS_EN_BLANCO", 0b0001000000000000),
            new TipoExtension(0b0010000000000000, "Cantidades unitarias",
            "NO_IMPRIME_CANTIDADES_UNITARIAS", 0b0000000000000000,
            "IMPRIME_CANTIDADES_UNITARIAS", 0b0010000000000000),
            new TipoExtension(0b0100000000000000, "Código QR",
            "NO_IMPRIME_CODIGO_QR", 0b0000000000000000,
            "IMPRIME_CODIGO_QR", 0b0100000000000000)

        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Descripción del pago automático", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 2, "Código del pago automático", TipoDato.N_E, 2, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
