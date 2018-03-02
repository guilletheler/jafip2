package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ConfigurarFuenteSeleccionDeFuente, <br>
* Configurar Fuente Selección de Fuente: Comando no soportado en TM-U220AFII Versión 22.01 Demeter<br>
* Notas:  Si se encontrara el corte inteligente activo y algún documento en cola, antes de efectuarse el cambio de la configuración de fuente, el documento será expulsado de la estación de impresión.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ConfigurarFuenteSeleccionDeFuente extends TipoComandoFiscal {
    
    public ConfigurarFuenteSeleccionDeFuente() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarFuenteSeleccionDeFuente"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Fuente Selección de Fuente: Comando no soportado en TM-U220AFII Versión 22.01 Demeter";
    }

    @Override
    public int getCodigo() {
        return 0x0770;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x70;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "TIPO_FUENTE",
            "FUENTE_TIPO_A", 0b0000000000000000,
            "FUENTE_TIPO_B", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return " Si se encontrara el corte inteligente activo y algún documento en cola, antes de efectuarse el cambio de la configuración de fuente, el documento será expulsado de la estación de impresión.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    
}
