package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
 * Comando: ObtenerConfiguracionDeFechaYHora, getFechaHora, <br>
 * Obtener Configuración de Fecha y Hora<br>
 * Notas: Obtiene los valores actuales de configuración del RTC interno de la impresora fiscal.<br>
 * Requerimientos: La fecha y hora deben estar configuradas previamente.<br>
 * Campos de entrada: <br>
 * Campos de salida: <br>
 * 1	D	6	Fecha<br>
 * 2	T	6	Hora<br>
 *
 */
public class ObtenerConfiguracionDeFechaYHora extends TipoComandoFiscal {

    public ObtenerConfiguracionDeFechaYHora() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDeFechaYHora", "getFechaHora", "ObtenerFechaHora"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Configuración de Fecha y Hora";
    }

    @Override
    public int getCodigo() {
        return 0x0502;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x02;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Obtiene los valores actuales de configuración del RTC interno de la impresora fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return "La fecha y hora deben estar configuradas previamente.";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Fecha", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 2, "Hora", TipoDato.T, 6, false)
        };
    }

}
