package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarFechaYHora, ConfigurarFechaHora, SetFechaHora, <br>
* Configurar Fecha y Hora<br>
* Notas:  Si la impresora fiscal se encuentra en modo técnico, la nueva configuración no tiene restricciones con respecto al último comprobante emitido<br>
*  Se iniciará el período de actividades, una vez ejecutado el comando.<br>
* Requerimientos:  La jornada fiscal debe estar cerrada.<br>
*  La nueva configuración debe ser dentro del rango +/- 5 minutos si la impresora fiscal no se encuentra en modo técnico.<br>
*  Mecanismo impresor en línea y con papel23.<br>
*  La Memoria fiscal no debe estar llena.<br>
*  El uso del horario de verano solo se permite una sola vez por año<br>
*  No se permiten duplicidad en los comandos de entrar / salir del horario de verano<br>
* Campos de entrada: <br>
* 1	D	6	Fecha<br>
* 2	T	6	Hora<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarFechaHora extends TipoComandoFiscal {

    public ConfigurarFechaHora() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarFechaYHora", "ConfigurarFechaHora", "SetFechaHora"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Fecha y Hora";
    }

    @Override
    public String getRequerimientos() {
        return " La jornada fiscal debe estar cerrada.\n"
                + " La nueva configuración debe ser dentro del rango +/- 5 minutos si la impresora fiscal no se encuentra en modo técnico.\n"
                + " Mecanismo impresor en línea y con papel23.\n"
                + " La Memoria fiscal no debe estar llena.\n"
                + " El uso del horario de verano solo se permite una sola vez por año\n"
                + " No se permiten duplicidad en los comandos de entrar / salir del horario de verano";
    }

    @Override
    public String getNotas() {
        return " Si la impresora fiscal se encuentra en modo técnico, la nueva configuración no tiene restricciones con respecto al último comprobante emitido\n"
                + " Se iniciará el período de actividades, una vez ejecutado el comando.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[] {
            new TipoExtension(0x0000000000000011, "TIPO_HORARIO", "NORMAL", 0b0000000000000000, "ENTRAR_EN_HORARIO_DE_VERANO", 0b0000000000000001, "SALIR_EN_HORARIO_DE_VERANO", 0b0000000000000011)
        };
    }
    

    @Override
    public int getCodigo() {
        return 0x0501;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Fecha", TipoDato.D, 6, false), 
            new TipoCampoFiscal(this, 2, "Hora", TipoDato.T, 6, false)};

    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
