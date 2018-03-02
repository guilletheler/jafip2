package com.gt.ifepson.comandos.dnfh;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeOtrosTributosDNFH, <br>
* Obtiene información detallada sobre los otros tributos involucrados en el Documento no Fiscal Homologad en curso.<br>
* Notas:  Si se especifica sin información discriminada, los campos 6 a 9 se retornarán vacíos.<br>
*  No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).<br>
*  El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.<br>
*  El campo #1 es requerido si se solicita información discriminada.<br>
*  Los documentos Donación, Rebico R/X no soportan otros tributos.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	N_E	2	Número (#) de otros tributos a reportar (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de otros atributos<br>
* 2	N_10_2	12	Total de otros atributos Cod07 (Percep. Ingreso Brutos)<br>
* 3	N_10_2	12	Total de otros atributos Cod06 (Percep. de IVA)<br>
* 4	N_10_2	12	Total de otros atributos Cod09 (Otras Percepciones)<br>
* 5	N_E	2	Cantidad de otros tributos encontrados<br>
* 6	RT	-1	Descripción de otros tributos #n (OPCIONAL)<br>
* 7	N_10_2	12	Monto de otros tributos #n (OPCIONAL)<br>
* 8	N_0_4	4	Tasa asociada a otros tributos #n (OPCIONAL)<br>
* 9	N_E	2	Código asociado a otros tributos #n (OPCIONAL)<br>
* 
*/
public class InformacionDeOtrosTributosDNFH extends TipoComandoFiscal {

    public InformacionDeOtrosTributosDNFH() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeOtrosTributosDNFH"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información detallada sobre los otros tributos involucrados en el Documento no Fiscal Homologad en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x100F;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x10;
        ret[1] = 0x0F;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Si se especifica sin información discriminada, los campos 6 a 9 se retornarán vacíos.\n"
                + " No se permite el valor cero en el campo de entrada número 1 (Número (#) de otros tributos a reportar).\n"
                + " El valor mínimo del campo de entrada número 1 (Número (#) de otros tributos a reportar) es uno.\n"
                + " El campo #1 es requerido si se solicita información discriminada.\n"
                + " Los documentos Donación, Rebico R/X no soportan otros tributos.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "INFORMACION_OTROS_ATRIBUTOS",
            "INFORMACION_CON_DISCRIMINACIO_POR_OTROS_ATRIBUTOS", 0b0000000000000001,
            "SIN_INFORMACION_DISCRIMINADA_POR_OTROS_ATRIBUTOS", 0b0000000000000000
            )
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
            new TipoCampoFiscal(this, 1, "Total de otros atributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total de otros atributos Cod07 (Percep. Ingreso Brutos)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total de otros atributos Cod06 (Percep. de IVA)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total de otros atributos Cod09 (Otras Percepciones)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Cantidad de otros tributos encontrados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 6, "Descripción de otros tributos #n", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 7, "Monto de otros tributos #n", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 8, "Tasa asociada a otros tributos #n", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 9, "Código asociado a otros tributos #n", TipoDato.N_E, 2, true)
        };
    }

}
