package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeVentasTiqueFactNDABCM, <br>
* Obtiene información detallada sobre las ventas realizadas mediante el tique-factura o nota de débito<br>
* A/B/C/M en curso.<br>
* Notas:  La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique fiscal en el orden indicado por campos 2 al 3.<br>
* Si se solicitara sin información discriminada, los campos 2 al 11 se retornarán vacíos.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Total bruto<br>
* 2	N_10_2	12	Total sin otros tributos<br>
* 3	N_0_4	4	Tasa de IVA #1 (OPCIONAL)<br>
* 4	N_10_2	12	Total vendido x tasa #1 (OPCIONAL)<br>
* 5	N_0_4	4	Tasa de IVA #2 (OPCIONAL)<br>
* 6	N_10_2	12	Total vendido x tasa #2 (OPCIONAL)<br>
* 7	N_0_4	4	Tasa de IVA #3 (OPCIONAL)<br>
* 8	N_10_2	12	Total vendido x tasa #3 (OPCIONAL)<br>
* 9	N_0_4	4	Tasa de IVA #4 (OPCIONAL)<br>
* 10	N_10_2	12	Total vendido x tasa #4 (OPCIONAL)<br>
* 11	N_0_4	4	Tasa de IVA #5 (OPCIONAL)<br>
* 12	N_10_2	12	Total vendido x tasa #5 (OPCIONAL)<br>
* 13	N_0_4	4	Tasa de IVA #6 (OPCIONAL)<br>
* 14	N_10_2	12	Total vendido x tasa #6 (OPCIONAL)<br>
* 15	N_0_4	4	Tasa de IVA #7 (OPCIONAL)<br>
* 16	N_10_2	12	Total vendido x tasa #7 (OPCIONAL)<br>
* 
*/
public class InformacionDeVentasTiqueFactNDABCM extends TipoComandoFiscal {

    public InformacionDeVentasTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeVentasTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información detallada sobre las ventas realizadas mediante el tique-factura o nota de débito\n"
                + "A/B/C/M en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x0B0D;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x0D;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique fiscal en el orden indicado por campos 2 al 3.\n"
                + "Si se solicitara sin información discriminada, los campos 2 al 11 se retornarán vacíos.";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar tasas",
            "CON_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS_INCLUIDA", 0b0000000000000000,
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000001),
            new TipoExtension(0b0000000000001000, "Retorna valores brutos y netos segun tipo",
            "RETORNA_BRUTOS_AM_NETOS_BC", 0b0000000000000000,
            "RETORNA_NETOS_AM_BRUTOS_BC", 0b0000000000001000),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Total bruto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total sin otros tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Tasa de IVA #1", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 4, "Total vendido x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 5, "Tasa de IVA #2", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 6, "Total vendido x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 7, "Tasa de IVA #3", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 8, "Total vendido x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 9, "Tasa de IVA #4", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 10, "Total vendido x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 11, "Tasa de IVA #5", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 12, "Total vendido x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 13, "Tasa de IVA #6", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 14, "Total vendido x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 15, "Tasa de IVA #7", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 16, "Total vendido x tasa #7", TipoDato.N_10_2, 12, true)
        };
    }

}
