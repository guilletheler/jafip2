package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: IniciarCargaDeLogosDelUsuario, <br>
* Iniciar Carga de Logos del Usuario<br>
* Notas: Prepara la impresora para la carga de logo de usuario.<br>
* Requerimientos: Jornada fiscal cerrada.<br>
* No encontrarse iniciada previamente una carga de logo de usuario.<br>
* Campos de entrada: <br>
* 1	B	2	Ancho del logo<br>
* 2	B	2	Alto del logo<br>
* 3	N_E	1	Calidad del logo<br>
* Campos de salida: <br>
* 
*/
public class IniciarCargaDeLogosDelUsuario extends TipoComandoFiscal {

    public IniciarCargaDeLogosDelUsuario() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"IniciarCargaDeLogosDelUsuario"};
    }

    @Override
    public String getDescripcion() {
        return "Iniciar Carga de Logos del Usuario";
    }

    @Override
    public int getCodigo() {
        return 0x0530;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x30;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Prepara la impresora para la carga de logo de usuario.";
    }

    @Override
    public String getRequerimientos() {
        return "Jornada fiscal cerrada.\n"
                + "No encontrarse iniciada previamente una carga de logo de usuario.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Ancho del logo", TipoDato.B, 2, false),
            new TipoCampoFiscal(this, 2, "Alto del logo", TipoDato.B, 2, false),
            new TipoCampoFiscal(this, 3, "Calidad del logo", TipoDato.N_E, 1, false)};
    }

}
