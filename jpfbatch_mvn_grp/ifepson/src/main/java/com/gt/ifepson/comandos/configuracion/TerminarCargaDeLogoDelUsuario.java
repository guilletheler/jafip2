package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: TerminarCargaDeLogoDelUsuario, <br>
* Terminar Carga de Logo del Usuario<br>
* Notas: <br>
* Requerimientos:  Carga de logos de usuario iniciada.<br>
*  Mecanismo impresor en línea.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class TerminarCargaDeLogoDelUsuario extends TipoComandoFiscal {

    public TerminarCargaDeLogoDelUsuario() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"TerminarCargaDeLogoDelUsuario"};
    }

    @Override
    public String getDescripcion() {
        return "Terminar Carga de Logo del Usuario";
    }

    @Override
    public int getCodigo() {
        return 0x0532;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x32;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return " Carga de logos de usuario iniciada.\n"
                + " Mecanismo impresor en línea.";
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
