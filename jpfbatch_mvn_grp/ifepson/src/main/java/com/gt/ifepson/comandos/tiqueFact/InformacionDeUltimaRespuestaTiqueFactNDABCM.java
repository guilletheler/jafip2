package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeUltimaRespuestaTiqueFactNDABCM, <br>
* Obtiene información sobre la respuesta enviada por el comando de cierre del último tique-factura o nota<br>
* de débito A/B/C/M cerrado exitosamente.<br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Número del tique fiscal o tique nota de crédito<br>
* 2	L	1	Tipo de tique-factura o nota de débito (A B C M)<br>
* 3	N_10_2	12	Monto total del tique fiscal o tique nota de crédito<br>
* 4	N_10_2	12	Monto total de IVA del tique fiscal o tique nota de crédito<br>
* 5	N_10_2	12	Vuelto final<br>
* 
*/
public class InformacionDeUltimaRespuestaTiqueFactNDABCM extends TipoComandoFiscal {

    public InformacionDeUltimaRespuestaTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeUltimaRespuestaTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información sobre la respuesta enviada por el comando de cierre del último tique-factura o nota\n"
                + "de débito A/B/C/M cerrado exitosamente.";
    }

    @Override
    public int getCodigo() {
        return 0x0B10;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x10;
        return ret;
    }
    
    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
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
            new TipoCampoFiscal(this, 2, "Tipo de tique-factura o nota de débito (A B C M)", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 3, "Monto total del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Monto total de IVA del tique fiscal o tique nota de crédito", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Vuelto final", TipoDato.N_10_2, 12, false),};
    }

}
