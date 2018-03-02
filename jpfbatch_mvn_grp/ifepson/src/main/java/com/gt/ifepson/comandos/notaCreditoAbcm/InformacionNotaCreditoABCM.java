package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionTiqueNCABCM, <br>
* Obtiene información de IVA del tique-nota de crédito A/B/C/M en curso.<br>
* Notas: La fase en la que se encuentra el tique fiscal puede tener los siguientes valores:<br>
* ‘0’ – Fase inicial. Tique abierto sin ítems facturados.<br>
* ‘1’ – Fase de venta.<br>
* ‘2’ – Fase de descuentos/ajustes.<br>
* ‘3’ – Fase de otros tributos.<br>
* ‘4’ – Fase de pagos.<br>
* Requerimientos: Documento Tique-Nota de Crédito abierto.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número de tique-nota de crédito<br>
* 2	L	1	Tipo de tique-nota de crédito (A, B, C, M)<br>
* 3	N_10_2	12	Total bruto<br>
* 4	N_10_2	12	Total pagado<br>
* 5	N_10_2	12	Total IVA<br>
* 6	N_10_2	12	Total impuestos internos<br>
* 7	N_10_2	12	Total otros tributos<br>
* 8	N_E	4	Cantidad de ítems utilizada<br>
* 9	N_E	4	Cantidad máxima de ítems posibles de utilización<br>
* 10	N_E	2	Cantidad de descuentos/ajustes globales realizados<br>
* 11	N_E	2	Cantidad máxima de descuentos/ajustes globales a realizar<br>
* 12	N_E	2	Cantidad máxima de nuevas tasas de impuestos disponibles en la jornada fiscal en curso.<br>
* 13	N_E	2	Cantidad de tasas de impuestos utilizadas<br>
* 14	N_E	2	Cantidad de otros tributo emitidos<br>
* 15	N_E	2	Cantidad máxima de nuevos otros tributos disponibles en la jornada fiscal en curso.<br>
* 16	N_E	2	Cantidad de pagos efectuados<br>
* 17	N_E	2	Cantidad máxima de pagos a realizar<br>
* 18	N_E	2	Fase actual del tique-nota de crédito<br>
* 19	N_10_2	12	Total neto<br>
* 
*/
public class InformacionNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionTiqueNCABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información de IVA del tique-nota de crédito A/B/C/M en curso.";
    }

    @Override
    public String getNotas() {
        return "La fase en la que se encuentra el tique fiscal puede tener los siguientes valores:\n"
                + "‘0’ – Fase inicial. Tique abierto sin ítems facturados.\n"
                + "‘1’ – Fase de venta.\n"
                + "‘2’ – Fase de descuentos/ajustes.\n"
                + "‘3’ – Fase de otros tributos.\n"
                + "‘4’ – Fase de pagos.";
    }

    @Override
    public String getRequerimientos() {
        return "Documento Tique-Nota de Crédito abierto.";
    }
    
    @Override
    public int getCodigo() {
        return 0x0D0A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x0A;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de tique-nota de crédito", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Tipo de tique-nota de crédito (A, B, C, M)", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 3, "Total bruto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total pagado", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Total IVA", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 6, "Total impuestos internos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 7, "Total otros tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 8, "Cantidad de ítems utilizada", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 9, "Cantidad máxima de ítems posibles de utilización", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 10, "Cantidad de descuentos/ajustes globales realizados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 11, "Cantidad máxima de descuentos/ajustes globales a realizar", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 12, "Cantidad máxima de nuevas tasas de impuestos disponibles en la jornada fiscal en curso.", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 13, "Cantidad de tasas de impuestos utilizadas", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 14, "Cantidad de otros tributo emitidos", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 15, "Cantidad máxima de nuevos otros tributos disponibles en la jornada fiscal en curso.", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 16, "Cantidad de pagos efectuados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 17, "Cantidad máxima de pagos a realizar", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 18, "Fase actual del tique-nota de crédito", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 19, "Total neto", TipoDato.N_10_2, 12, false)
        };
    }
}
