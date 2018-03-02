package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CerrarTiqueFactNDABCM, <br>
* Realiza el cierre del tique-factura o nota de débito A/B/C/M almacenando los datos de la transacción en<br>
* la memoria de transacciones.<br>
* Notas: <br>
* Requerimientos:  El total del tique fiscal debe ser igual o superior a cero.<br>
*  Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	N_E	3	Número de línea de cola de reemplazo #1 (OPCIONAL)<br>
* 2	RT	-1	Descripción de reemplazo #1 (OPCIONAL)<br>
* 3	N_E	3	Número de línea de cola de reemplazo #2 (OPCIONAL)<br>
* 4	RT	-1	Descripción de reemplazo #2 (OPCIONAL)<br>
* 5	N_E	3	Número de línea de cola de reemplazo #3 (OPCIONAL)<br>
* 6	N_E	1	Descripción de reemplazo #3 (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique-factura o nata de débito fiscal (OPCIONAL)<br>
* 2	L	1	Tipo de tique-factura o nata de débito (A B C M) (OPCIONAL)<br>
* 3	N_10_2	12	Monto total del tique-factura o nata de débito fiscal (OPCIONAL)<br>
* 4	N_10_2	12	Monto total de IVA del tique-factura o nata de débito fiscal (OPCIONAL)<br>
* 5	N_10_2	12	Vuelto final (OPCIONAL)<br>
* 
*/
public class CerrarTiqueFactNDABCM extends TipoComandoFiscal {

    public CerrarTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CerrarTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza el cierre del tique-factura o nota de débito A/B/C/M almacenando los datos de la transacción en\n"
                + "la memoria de transacciones.";
    }

    @Override
    public int getCodigo() {
        return 0x0B06;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x06;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "CORTAR",
            "NO_CORTAR_PAPEL", 0b0000000000000000,
            "CORTAR_PAPEL", 0b0000000000000001),
            new TipoExtension(0b0000000000000010, "RESPUESTA_ELECTRONICA",
            "NO_DEVUELVE_RESPUESTA_ELECTRONICA", 0b0000000000000000,
            "DEVUELVE_RESPUESTA_ELECTRONICA", 0b0000000000000010),
            new TipoExtension(0b0000000000000100, "SU_VUELTO",
            "IMPRIME_SU_VUELTO_SIN_ATRIBUTOS", 0b0000000000000000,
            "IMPRIME_SU_VUELTO_CON_ATRIBUTOS", 0b0000000000000100),
            new TipoExtension(0b0000000000001000, "PAGO_AUTOMATICO",
            "NO_UTILIZA_CTA_CTE_EN_PAGO_AUTOMATICO", 0b0000000000000000,
            "UTILIZA_CTA_CTE_EN_PAGO_AUTOMATICO", 0b0000000000001000),
            new TipoExtension(0b0000000010000000, "CANTIDAD_UNIDADES",
            "NO_IMPRIMIR_CANTIDAD_DE_UNIDADES", 0b0000000000000000,
            "IMPRIMIR_CANTIDAD_DE_UNIDADES", 0b0000000010000000)
        };
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return " El total del tique fiscal debe ser igual o superior a cero.\n"
                + " Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de línea de cola de reemplazo #1", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 2, "Descripción de reemplazo #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Número de línea de cola de reemplazo #2", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 4, "Descripción de reemplazo #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Número de línea de cola de reemplazo #3", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 6, "Descripción de reemplazo #3", TipoDato.N_E, 1, true),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número del tique-factura o nata de débito fiscal", TipoDato.N_E, 8, true),
            new TipoCampoFiscal(this, 2, "Tipo de tique-factura o nata de débito (A B C M)", TipoDato.L, 1, true),
            new TipoCampoFiscal(this, 3, "Monto total del tique-factura o nota de débito fiscal", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 4, "Monto total de IVA del tique-factura o nota de débito fiscal", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 5, "Vuelto final", TipoDato.N_10_2, 12, true)
        };
    }

}
