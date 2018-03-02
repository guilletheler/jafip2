package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: EnviarDatosDeLogoDelUsuario, <br>
* Enviar Datos de Logo del Usuario<br>
* Notas: <br>
* Requerimientos: Mecanismo impresor en línea y con papel.<br>
* Carga de logos de usuario iniciada.<br>
* Campos de entrada: <br>
* 1	B	-1	Datos de los logos del usuario<br>
* Campos de salida: <br>
* 
*/
public class EnviarDatosDeLogoDelUsuario extends TipoComandoFiscal {

    public EnviarDatosDeLogoDelUsuario() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"EnviarDatosDeLogoDelUsuario"};
    }

    @Override
    public String getDescripcion() {
        return "Enviar Datos de Logo del Usuario";
    }

    @Override
    public int getCodigo() {
        return 0x0531;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x31;
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
        return "Mecanismo impresor en línea y con papel.\n"
                + "Carga de logos de usuario iniciada.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Datos de los logos del usuario", TipoDato.B, -1, false)};
    }

}
