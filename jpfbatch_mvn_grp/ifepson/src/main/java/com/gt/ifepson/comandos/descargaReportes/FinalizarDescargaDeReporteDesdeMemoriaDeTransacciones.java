package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: FinalizarDescargaDeReporteDesdeMemoriaDeTransacciones, <br>
* Finalizar Descarga de Reporte desde Memoria de Transacciones<br>
* Notas: <br>
* Requerimientos:  No deben existir pendientes de descarga.<br>
*  Auditoría/descarga de datos de memoria transaccional iniciada.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class FinalizarDescargaDeReporteDesdeMemoriaDeTransacciones extends TipoComandoFiscal {

    public FinalizarDescargaDeReporteDesdeMemoriaDeTransacciones() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"FinalizarDescargaDeReporteDesdeMemoriaDeTransacciones"};
    }

    @Override
    public String getDescripcion() {
        return "Finalizar Descarga de Reporte desde Memoria de Transacciones";
    }

    @Override
    public int getCodigo() {
        return 0x0971;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x71;
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
        return " No deben existir pendientes de descarga.\n"
                + " Auditoría/descarga de datos de memoria transaccional iniciada.";
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
