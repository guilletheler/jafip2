package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeOtrosTributosNotaCreditoABCM, <br>
* Información de Otros Tributos<br>
* Notas: Si se solicitara sin información discriminada, los campos 6 a 9 se retornarán vacíos.<br>
* No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).<br>
* El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.<br>
* El campo #1 es requerido si se solicita información discriminada.<br>
* Requerimientos: Documento Tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* 1	N_E	2	Número (#) de otros tributos a reportar (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de Otros Tributos<br>
* 2	N_10_2	12	Total de Otros Tributos código 07 (Precep. de Ingresos Brutos)<br>
* 3	N_10_2	12	Total de Otros Tributos código 06 (Precep. de IVA)<br>
* 4	N_10_2	12	Total de Otros Tributos código 09 (Otras Percepciones)<br>
* 5	N_E	2	Cantidad de otros tributos encontrados<br>
* 6	RT	-1	Descripción de Otros Tributos #n (OPCIONAL)<br>
* 7	N_10_2	12	Monto de Otros Tributos #n (OPCIONAL)<br>
* 8	N_E	4	Tasa asociada a Otros Tributos #n (OPCIONAL)<br>
* 9	N_E	2	Código asociado a Otros Tributos #n (OPCIONAL)<br>
* 
*/
public class InformacionDeOtrosTributosNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionDeOtrosTributosNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeOtrosTributosNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Información de Otros Tributos";
    }

    @Override
    public String getNotas() {
        return "Si se solicitara sin información discriminada, los campos 6 a 9 se retornarán vacíos.\n"
                + "No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).\n"
                + "El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.\n"
                + "El campo #1 es requerido si se solicita información discriminada.";
    }

    @Override
    public String getRequerimientos() {
        return "Documento Tique-nota de crédito abierto.";
    }

    @Override
    public int getCodigo() {
        return 0x0D0F;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x0F;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar otros tributos",
            "SIN_INFORMACION_DISCRIMINADA_POR_OTROS_TRIBUTOS", 0b0000000000000000,
            "CON_INFORMACION_DISCRIMINADA_POR_OTROS_TRIBUTOS", 0b0000000000000001)
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
            new TipoCampoFiscal(this, 2, "Total de Otros Tributos código 07 (Precep. de Ingresos Brutos)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total de Otros Tributos código 06 (Precep. de IVA)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total de Otros Tributos código 09 (Otras Percepciones)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Cantidad de otros tributos encontrados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 6, "Descripción de Otros Tributos #n", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Monto de Otros Tributos #n", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 8, "Tasa asociada a Otros Tributos #n", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 9, "Código asociado a Otros Tributos #n", TipoDato.N_E, 2, true)
        };
    }
}