package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionTiqueNC, <br>
* Obtiene información del tique o tique-nota de crédito en proceso de emisión.<br>
* Notas: La fase en la que se encuentra el tique fiscal puede tener los siguientes valores:<br>
* ‘0’ – Fase inicial. Tique abierto sin ítems facturados.<br>
* ‘1’ – Fase de venta.<br>
* ‘2’ – Fase de descuentos/ajustes.<br>
* ‘3’ – Fase de pagos.<br>
* Requerimientos: Documento Tique, tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número de tique fiscal<br>
* 2	N_10_2	12	Total bruto<br>
* 3	N_10_2	12	Total pagado<br>
* 4	N_10_2	12	Total IVA<br>
* 5	N_10_2	12	Total impuestos internos<br>
* 6	N_E	4	Cantidad de ítems vendidos<br>
* 7	N_E	4	Cantidad máxima de ítems posibles de venta<br>
* 8	N_E	2	Cantidad de descuentos/ajustes realizados<br>
* 9	N_E	2	Cantidad máxima de descuentos/ajustes a realizar<br>
* 10	N_E	2	Cantidad de tasas de impuesto utilizadas<br>
* 11	N_E	2	Cantidad máxima de nuevas tasas de impuesto disponibles en la jornada fiscal en curso<br>
* 12	N_E	2	Cantidad de pagos efectuados<br>
* 13	N_E	2	Cantidad máxima de pagos a realizar<br>
* 14	N_E	2	Fase actual del tique<br>
* 
*/
public class InformacionTiqueNC extends TipoComandoFiscal {

    public InformacionTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información del tique o tique-nota de crédito en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x0A0A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x0A;
        return ret;
    }

    @Override
    public String getNotas() {
        return "La fase en la que se encuentra el tique fiscal puede tener los siguientes valores:\n"
                + "‘0’ – Fase inicial. Tique abierto sin ítems facturados.\n"
                + "‘1’ – Fase de venta.\n"
                + "‘2’ – Fase de descuentos/ajustes.\n"
                + "‘3’ – Fase de pagos.";
    }

    @Override
    public String getRequerimientos() {
        return "Documento Tique, tique-nota de crédito abierto.";
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
            new TipoCampoFiscal(this, 1, "Número de tique fiscal", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Total bruto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total pagado", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total IVA", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Total impuestos internos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 6, "Cantidad de ítems vendidos", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 7, "Cantidad máxima de ítems posibles de venta", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 8, "Cantidad de descuentos/ajustes realizados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 9, "Cantidad máxima de descuentos/ajustes a realizar", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 10, "Cantidad de tasas de impuesto utilizadas", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 11, "Cantidad máxima de nuevas tasas de impuesto disponibles en la jornada fiscal en curso", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 12, "Cantidad de pagos efectuados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 13, "Cantidad máxima de pagos a realizar", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 14, "Fase actual del tique", TipoDato.N_E, 2, false)
            
        };
    }

}
