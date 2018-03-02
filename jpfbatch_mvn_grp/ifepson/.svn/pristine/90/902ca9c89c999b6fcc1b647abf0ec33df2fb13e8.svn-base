package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDePagosTiqueFactNDABCM, <br>
* Obtiene información de pagos del tique-factura o nota de débito A/B/C/M en curso.<br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Monto total pagado<br>
* 2	N_10_2	12	Monto total a pagar<br>
* 3	N_10_2	12	Vuelto<br>
* 4	N_E	1	Cantidad de pagos realizados<br>
* 5	N_E	1	Cantidad de pagos disponibles<br>
* 
*/
public class InformacionDePagosTiqueFactNDABCM extends TipoComandoFiscal {

    public InformacionDePagosTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDePagosTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información de pagos del tique-factura o nota de débito A/B/C/M en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x0B0C;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x0C;
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
            new TipoCampoFiscal(this, 1, "Monto total pagado", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Monto total a pagar", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Vuelto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Cantidad de pagos realizados", TipoDato.N_E, 1, false),
            new TipoCampoFiscal(this, 5, "Cantidad de pagos disponibles", TipoDato.N_E, 1, false)
        };
    }

}
