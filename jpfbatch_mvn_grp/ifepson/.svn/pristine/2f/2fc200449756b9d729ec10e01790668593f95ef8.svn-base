package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeUltimaRespuestaNotaCreditoABCM, <br>
* Obtiene información sobre la respuesta enviada por el comando de cierre del último tique-nota de crédito A/B/C/M cerrado exitosamente.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique-nota de crédito<br>
* 2	L	1	Tipo de tique-nota de crédito (A, B, C, M)<br>
* 3	N_10_2	12	Monto total del tique fiscal o tique nota de crédito<br>
* 4	N_10_2	12	Monto total de IVA del tique fiscal o tique nota de crédito<br>
* 5	N_10_2	12	Vuelto final<br>
* 
*/
public class InformacionDeUltimaRespuestaNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionDeUltimaRespuestaNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeUltimaRespuestaNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información sobre la respuesta enviada por el comando de cierre del último tique-nota de crédito A/B/C/M cerrado exitosamente.";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public int getCodigo() {
        return 0x0D10;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x10;
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
            new TipoCampoFiscal(this, 1, "Número del tique-nota de crédito", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Tipo de tique-nota de crédito (A, B, C, M)", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 3, "Monto total del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Monto total de IVA del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Vuelto final", TipoDato.N_10_2, 12, false),};
    }

}
