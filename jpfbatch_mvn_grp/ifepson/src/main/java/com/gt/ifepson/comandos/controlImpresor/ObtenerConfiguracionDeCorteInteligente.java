package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDeCorteInteligente, <br>
* Obtener Configuración de Corte Inteligente<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	Y	1	Corte inteligente activo<br>
* 
*/
public class ObtenerConfiguracionDeCorteInteligente extends TipoComandoFiscal {

    public ObtenerConfiguracionDeCorteInteligente() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDeCorteInteligente"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Configuración de Corte Inteligente";
    }

    @Override
    public int getCodigo() {
        return 0x0761;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x61;
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
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Corte inteligente activo", TipoDato.Y, 1, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
