package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ComandosDeTique_NotaDeCreditoA_B_C_MInformacionDeVentas, <br>
* Obtiene información detallada sobre las ventas realizadas mediante el tique-nota de crédito A/B/C/M en curso.<br>
* Notas:  La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique-nota<br>
* de crédito en el orden indicado por campos 3 al 4.<br>
*  Si se solicitara sin información discriminada, los campos 3 al 12 se retornarán vacíos.<br>
* Requerimientos: Documento Tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Importe total<br>
* 2	N_10_2	12	Importe total sin otros tributos<br>
* 3	N_E	4	Tasa de IVA #1 (OPCIONAL)<br>
* 4	N_10_2	12	Total vendido x tasa #1 (OPCIONAL)<br>
* 5	N_E	4	Tasa de IVA #2 (OPCIONAL)<br>
* 6	N_10_2	12	Total vendido x tasa #2 (OPCIONAL)<br>
* 7	N_E	4	Tasa de IVA #3 (OPCIONAL)<br>
* 8	N_10_2	12	Total vendido x tasa #3 (OPCIONAL)<br>
* 9	N_E	4	Tasa de IVA #4 (OPCIONAL)<br>
* 10	N_10_2	12	Total vendido x tasa #4 (OPCIONAL)<br>
* 11	N_E	4	Tasa de IVA #5 (OPCIONAL)<br>
* 12	N_10_2	12	Total vendido x tasa #5 (OPCIONAL)<br>
* 13	N_E	4	Tasa de IVA #6 (OPCIONAL)<br>
* 14	N_10_2	12	Total vendido x tasa #6 (OPCIONAL)<br>
* 15	N_E	4	Tasa de IVA #7 (OPCIONAL)<br>
* 16	N_10_2	12	Total vendido x tasa #7 (OPCIONAL)<br>
* 
*/
public class InformacionDeVentasNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionDeVentasNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ComandosDeTique_NotaDeCreditoA_B_C_MInformacionDeVentas"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información detallada sobre las ventas realizadas mediante el tique-nota de crédito A/B/C/M en curso.";
    }

    @Override
    public String getNotas() {
        return " La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique-nota\n"
                + "de crédito en el orden indicado por campos 3 al 4.\n"
                + " Si se solicitara sin información discriminada, los campos 3 al 12 se retornarán vacíos.";
    }

    @Override
    public String getRequerimientos() {
        return "Documento Tique-nota de crédito abierto.";
    }

    @Override
    public int getCodigo() {
        return 0x0D0D;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x0D;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar tasas",
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTO", 0b0000000000000000,
            "CON_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTO", 0b0000000000000001),
            new TipoExtension(0b0000000000001000, "BRUTOS_NETOS",
            "RETORNAR_VALORES_BRUTOS_PARA_A_Y_NETOS_PARA_BC", 0b0000000000000000,
            "RETORNAR_VALORES_NETOS_PARA_A_Y_BRUTOS_PARA_BC", 0b0000000000001000)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Importe total", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Importe total sin otros tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Tasa de IVA #1", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 4, "Total vendido x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 5, "Tasa de IVA #2", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 6, "Total vendido x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 7, "Tasa de IVA #3", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 8, "Total vendido x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 9, "Tasa de IVA #4", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 10, "Total vendido x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 11, "Tasa de IVA #5", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 12, "Total vendido x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 13, "Tasa de IVA #6", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 14, "Total vendido x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 15, "Tasa de IVA #7", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 16, "Total vendido x tasa #7", TipoDato.N_10_2, 12, true)
        };
    }

}
