package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: AbrirCajonDeDinero, AbrirCajon, <br>
* Abrir Cajón de Dinero<br>
* Notas: <br>
* Requerimientos: Mecanismo impresor en línea<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class AbrirCajonDeDinero extends TipoComandoFiscal {

    public AbrirCajonDeDinero() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirCajonDeDinero", "AbrirCajon"};
    }

    @Override
    public String getDescripcion() {
        return "Abrir Cajón de Dinero";
    }

    @Override
    public int getCodigo() {
        return 0x0707;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x07;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "SELECCION_CAJON_DE_DINERO",
            "CAJON_DE_DINERO_1", 0b0000000000000000,
            "CAJON_DE_DINERO_2", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
