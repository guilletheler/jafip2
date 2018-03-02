package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ComandosDeTique_NotaDeCreditoA_B_C_MInformacionDePagos, <br>
* Obtiene información de pagos del tique-nota de crédito A/B/C/M en curso.<br>
* Notas: <br>
* Requerimientos: Documento Tique-nota de crédito abierto.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Monto total pagado<br>
* 2	N_10_2	12	Monto total a pagar<br>
* 3	N_10_2	12	Vuelto<br>
* 4	N_E	1	Cantidad de pagos realizados<br>
* 5	N_E	1	Cantidad de pagos disponibles<br>
* 
*/
public class InformacionDePagosNotaCreditoABCM extends TipoComandoFiscal {

    public InformacionDePagosNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ComandosDeTique_NotaDeCreditoA_B_C_MInformacionDePagos"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información de pagos del tique-nota de crédito A/B/C/M en curso.";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Documento Tique-nota de crédito abierto.";
    }

    @Override
    public int getCodigo() {
        return 0x0D0C;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x0C;
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
            new TipoCampoFiscal(this, 1, "Monto total pagado", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Monto total a pagar", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Vuelto", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Cantidad de pagos realizados", TipoDato.N_E, 1, false),
            new TipoCampoFiscal(this, 5, "Cantidad de pagos disponibles", TipoDato.N_E, 1, false)
        };
    }

}
