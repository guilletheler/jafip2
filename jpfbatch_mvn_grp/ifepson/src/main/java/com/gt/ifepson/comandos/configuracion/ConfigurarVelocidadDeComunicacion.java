package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarVelocidadDeComunicacion, SetVelocidad, SetBaudios, <br>
* Configurar Velocidad de Comunicación (host port)<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarVelocidadDeComunicacion extends TipoComandoFiscal {

    public ConfigurarVelocidadDeComunicacion() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarVelocidadDeComunicacion", "SetVelocidad", "SetBaudios"};
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000111, "VELOCIDAD_BAUDIOS",
            "34800", 0b0000000000000000,
            "19200", 0b0000000000000001,
            "9600", 0b0000000000000010,
            "57600", 0b0000000000000011,
            "115200", 0b0000000000000100)
        };
    }

    @Override
    public String getDescripcion() {
        return "Configurar Velocidad de Comunicación (host port)";
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
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public int getCodigo() {
        return 0x000A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.SISTEMA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x00;
        ret[1] = 0x0A;
        return ret;
    }

}
