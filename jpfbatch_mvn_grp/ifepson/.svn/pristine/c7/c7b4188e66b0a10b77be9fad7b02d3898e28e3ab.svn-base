package com.gt.ifepson.comandos.tiqueNc;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeUltimaRespuestaTiqueNC, InformacionUltimaRespuestaTiqueNC, UltimaRespuestaTiqueNC, <br>
* Obtiene información sobre la respuesta enviada por el comando de cierre del último tique o tique nota de crédito cerrado exitosamente.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique fiscal o tique nota de crédito<br>
* 2	N_10_2	12	Monto total del tique fiscal o tique nota de crédito<br>
* 3	N_10_2	12	Monto total de IVA del tique fiscal o tique nota de crédito<br>
* 4	N_10_2	12	Vuelto final<br>
* 
*/
public class InformacionDeUltimaRespuestaTiqueNC extends TipoComandoFiscal {

    public InformacionDeUltimaRespuestaTiqueNC() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeUltimaRespuestaTiqueNC", "InformacionUltimaRespuestaTiqueNC", "UltimaRespuestaTiqueNC"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información sobre la respuesta enviada por el comando de cierre del último tique o tique nota de crédito cerrado exitosamente.";
    }

    @Override
    public int getCodigo() {
        return 0x0A10;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TIQUE;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0A;
        ret[1] = 0x10;
        return ret;
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
            new TipoCampoFiscal(this, 1, "Número del tique fiscal o tique nota de crédito", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Monto total del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Monto total de IVA del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Vuelto final", TipoDato.N_10_2, 12, false),};
    }

}
