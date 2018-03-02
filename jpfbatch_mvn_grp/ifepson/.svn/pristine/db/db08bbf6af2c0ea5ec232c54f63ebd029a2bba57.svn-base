package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CerrarNotaCreditoABCM, <br>
* Cerrar<br>
* Notas: <br>
* Requerimientos:  El total del tique-nota de crédito A/B/C/M debe ser igual o superior a cero.<br>
*  Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	N_E	3	Número de línea de cola de reemplazo #1 (OPCIONAL)<br>
* 2	RT	-1	Descripción del reemplado #1 (OPCIONAL)<br>
* 3	N_E	3	Número de línea de cola de reemplazo #2 (OPCIONAL)<br>
* 4	RT	-1	Descripción del reemplado #2 (OPCIONAL)<br>
* 5	N_E	3	Número de línea de cola de reemplazo #3 (OPCIONAL)<br>
* 6	RT	-1	Descripción del reemplado #3 (OPCIONAL)<br>
* 7	N_E	1	Líneas reservadas para firma (Este parámetro es opcional y su rango esta entre 0 y 3. Por defecto se utilizará el máximo valor.) (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique-nota de crédito (OPCIONAL)<br>
* 2	L	1	Tipo de tique-nota de crédito (A, B, C, M) (OPCIONAL)<br>
* 3	N_10_2	12	Monto total del tique-nota de crédito (OPCIONAL)<br>
* 4	N_10_2	12	Monto total de IVA tique-nota de crédito (OPCIONAL)<br>
* 5	N_10_2	12	Vuelto Final (OPCIONAL)<br>
* 
*/
public class CerrarNotaCreditoABCM extends TipoComandoFiscal {

    public CerrarNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CerrarNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Cerrar";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return " El total del tique-nota de crédito A/B/C/M debe ser igual o superior a cero.\n"
                + " Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public int getCodigo() {
        return 0x0D06;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x06;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Cortar Papel",
            "NO_CORTAR_PAPEL", 0b0000000000000000,
            "CORTAR_PAPEL", 0b0000000000000001),
            new TipoExtension(0b0000000100000000, "Cantidad de Unidades",
            "NO_IMPRIMIR_CANTIDAD_DE_UNIDADES", 0b0000000000000000,
            "IMPRIMIR_CANTIDAD_DE_UNIDADES", 0b0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de línea de cola de reemplazo #1", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 2, "Descripción del reemplado #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Número de línea de cola de reemplazo #2", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 4, "Descripción del reemplado #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Número de línea de cola de reemplazo #3", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 6, "Descripción del reemplado #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Líneas reservadas para firma (Este parámetro es opcional y su rango esta entre 0 y 3. Por defecto se utilizará el máximo valor.)", TipoDato.N_E, 1, true)
        };

    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número del tique-nota de crédito", TipoDato.N_E, 8, true),
            new TipoCampoFiscal(this, 2, "Tipo de tique-nota de crédito (A, B, C, M)", TipoDato.L, 1, true),
            new TipoCampoFiscal(this, 3, "Monto total del tique-nota de crédito", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 4, "Monto total de IVA tique-nota de crédito", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 5, "Vuelto Final", TipoDato.N_10_2, 12, true)
        };
    }

}
