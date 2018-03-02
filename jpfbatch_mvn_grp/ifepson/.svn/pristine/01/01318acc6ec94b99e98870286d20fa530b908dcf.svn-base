package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ReiniciarALosValoresDeConfiguracionDeFabrica, <br>
* Reiniciar a los Valores de Configuración de Fábrica<br>
* Notas: Elimina las configuraciones particulares del usuario y del controlador fiscal, volviendo a establecer las configuraciones de fábrica<br>
*  Al finalizar el proceso correctamente el LED parpadeará rápidamente en verde y se imprimirá un aviso. Se debe reiniciar el equipo para finalizar el proceso.<br>
* Requerimientos: Período de actividades cerrado.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ReiniciarALosValoresDeConfiguracionDeFabrica extends TipoComandoFiscal {

    public ReiniciarALosValoresDeConfiguracionDeFabrica() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ReiniciarALosValoresDeConfiguracionDeFabrica"};
    }

    @Override
    public String getDescripcion() {
        return "Reiniciar a los Valores de Configuración de Fábrica";
    }

    @Override
    public int getCodigo() {
        return 0x0564;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x64;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Elimina las configuraciones particulares del usuario y del controlador fiscal, volviendo a establecer las configuraciones de fábrica\n"
                + " Al finalizar el proceso correctamente el LED parpadeará rápidamente en verde y se imprimirá un aviso. Se debe reiniciar el equipo para finalizar el proceso.";
    }

    @Override
    public String getRequerimientos() {
        return "Período de actividades cerrado.";
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
