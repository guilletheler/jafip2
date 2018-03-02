package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CerrarTiqueNC, <br>
* Realiza el cierre del tique o tique-nota de crédito almacenando los datos de la transacción en la memoria de transacciones.<br>
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
* 7	RT	-1	Líneas reservadas para firma (su rango esta entre 0 y 3. Por defecto se utilizará el máximo valor.) (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique fiscal<br>
* 2	N_10_2	12	Monto total del tique fiscal<br>
* 3	N_10_2	12	Monto total de IVA del tique fiscal<br>
* 4	N_10_2	12	Vuelto final<br>
* 
*/
public class CerrarTiqueNC extends TipoComandoFiscal {

    public CerrarTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CerrarTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza el cierre del tique o tique-nota de crédito almacenando los datos de la transacción en la memoria de transacciones.";
    }

    @Override
    public int getCodigo() {
        return 0x0A06;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
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
            new TipoCampoFiscal(this, 7, "Líneas reservadas para firma (su rango esta entre 0 y 3. Por defecto se utilizará el máximo valor.)", TipoDato.RT, -1, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número del tique fiscal", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Monto total del tique fiscal", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Monto total de IVA del tique fiscal", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Vuelto final", TipoDato.N_10_2, 12, false)
        };
    }

}
