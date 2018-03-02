package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeOtrosTributosTiqueNC, InformacionOtrosTributosTiqueNC, <br>
* Información de Otros Tributos<br>
* Notas: Si se solicitara sin información discriminada, los campos 3 a 6 se retornarán vacíos.<br>
* No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).<br>
* El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.<br>
* El campo #1 es requerido si se solicita información discriminada.<br>
* Requerimientos: Documento Tique, tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* 1	N_E	2	Número (#) de otros tributos a reportar (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de Otros Tributos<br>
* 2	N_E	2	Cantidad de otros tributos encontrados<br>
* 3	RT	-1	Descripción de Otros Tributos #n (OPCIONAL)<br>
* 4	N_10_2	12	Monto de Otros Tributos #n (OPCIONAL)<br>
* 5	N_E	4	Tasa asociada a Otros Tributos #n (OPCIONAL)<br>
* 6	N_E	2	Código asociado a Otros Tributos #n (OPCIONAL)<br>
* 
*/
public class InformacionDeOtrosTributosTiqueNC extends TipoComandoFiscal {

    public InformacionDeOtrosTributosTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeOtrosTributosTiqueNC", "InformacionOtrosTributosTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Información de Otros Tributos";
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
        return "Documento Tique, tique-nota de crédito abierto.";
    }

    @Override
    public int getCodigo() {
        return 0x0A0F;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x0F;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar otros tributos",
            "SIN_INFORMACION_CON_DISCRIMINACION_POR_OTROS_TRIBUTOS", 0b0000000000000000,
            "CON_INFORMACION_CON_DISCRIMINACION_POR_OTROS_TRIBUTOS", 0b0000000000000001)
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
            new TipoCampoFiscal(this, 2, "Cantidad de otros tributos encontrados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 3, "Descripción de Otros Tributos #n", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Monto de Otros Tributos #n", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 5, "Tasa asociada a Otros Tributos #n", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 6, "Código asociado a Otros Tributos #n", TipoDato.N_E, 2, true)
        };
    }

}
