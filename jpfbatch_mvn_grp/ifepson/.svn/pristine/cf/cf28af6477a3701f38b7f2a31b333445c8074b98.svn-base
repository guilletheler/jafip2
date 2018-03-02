package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeOtrosTributosTiquefactNDABCM, <br>
* Obtiene información detallada sobre los otros tributos involucrados en el tique-factura o nota de débito<br>
* A/B/C/M en curso.<br>
* Notas: Si se solicitara sin información discriminada, los campos 3 a 6 se retornarán vacíos.<br>
* No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).<br>
* El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.<br>
* El campo #1 es requerido si se solicita información discriminada.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* 1	N_E	2	Número (#) de otros tributos a reportar (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de Otros Tributos<br>
* 2	N_10_2	12	Total de Otros Tributos - Codigo 07 (Percep. Ingresos Brutos)<br>
* 3	N_10_2	12	Total de Otros Tributos - Codigo 06 (Percep. de IVA)<br>
* 4	N_10_2	12	Total de Otros Tributos - Codigo 09 (Otras Percepciones)<br>
* 5	N_E	2	Cantidad de otros tributos encontrados<br>
* 6	RT	-1	Descripcion de otros tributos #n (OPCIONAL)<br>
* 7	N_10_2	12	Monto de Otros Tributos #n (OPCIONAL)<br>
* 8	N_0_4	4	Tasa asociada a Otros Tributos #n (OPCIONAL)<br>
* 9	N_E	2	Código asociado a Otros Tributos #n (OPCIONAL)<br>
* 
*/
public class InformacionDeOtrosTributosTiquefactNDABCM extends TipoComandoFiscal {

    public InformacionDeOtrosTributosTiquefactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeOtrosTributosTiquefactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información detallada sobre los otros tributos involucrados en el tique-factura o nota de débito\n"
                + "A/B/C/M en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x0B0F;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x0F;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Si se solicitara sin información discriminada, los campos 3 a 6 se retornarán vacíos.\n"
                + "No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).\n"
                + "El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.\n"
                + "El campo #1 es requerido si se solicita información discriminada.";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar otros tributos",
            "CON_INFORMACION_CON_DISCRIMINACION_POR_OTROS_TRIBUTOS", 0b0000000000000000,
            "SIN_INFORMACION_CON_DISCRIMINACION_POR_OTROS_TRIBUTOS", 0b0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número (#) de otros tributos a reportar", TipoDato.N_E, 2, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Total de Otros Tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total de Otros Tributos - Codigo 07 (Percep. Ingresos Brutos)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total de Otros Tributos - Codigo 06 (Percep. de IVA)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total de Otros Tributos - Codigo 09 (Otras Percepciones)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Cantidad de otros tributos encontrados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 6, "Descripcion de otros tributos #n", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Monto de Otros Tributos #n", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 8, "Tasa asociada a Otros Tributos #n", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 9, "Código asociado a Otros Tributos #n", TipoDato.N_E, 2, true),};
    }

}
