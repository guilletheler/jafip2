package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: CancelarDescargaDeReporteDesdeMemoriaDeTransacciones, <br>
* Cancelar Descarga de Reporte desde Memoria de Transacciones<br>
* Notas: <br>
* Requerimientos:  Descarga de datos de Memoria de Transacciones iniciada.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class CancelarDescargaDeReporteDesdeMemoriaDeTransacciones extends TipoComandoFiscal {

    public CancelarDescargaDeReporteDesdeMemoriaDeTransacciones() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CancelarDescargaDeReporteDesdeMemoriaDeTransacciones"};
    }

    @Override
    public String getDescripcion() {
        return "Cancelar Descarga de Reporte desde Memoria de Transacciones";
    }

    @Override
    public int getCodigo() {
        return 0x0972;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x72;
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
        return " Descarga de datos de Memoria de Transacciones iniciada.";
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
