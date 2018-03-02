package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ContinuarDescargaDeReporteDesdeMemoriaDeTransacciones, <br>
* Continuar Descarga de Reporte desde Memoria de Transacciones<br>
* Notas: Los datos son auditados o descargados en forma continua.<br>
* Requerimientos: Datos transaccionales pendientes de auditoría/descarga.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	-1	Datos de informe a descargar<br>
* 1	Y	1	Indicador de datos por descargar<br>
* 
*/
public class ContinuarDescargaDeReporteDesdeMemoriaDeTransacciones extends TipoComandoFiscal {

    public ContinuarDescargaDeReporteDesdeMemoriaDeTransacciones() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ContinuarDescargaDeReporteDesdeMemoriaDeTransacciones"};
    }

    @Override
    public String getDescripcion() {
        return "Continuar Descarga de Reporte desde Memoria de Transacciones";
    }

    @Override
    public int getCodigo() {
        return 0x0970;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x70;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Los datos son auditados o descargados en forma continua.";
    }

    @Override
    public String getRequerimientos() {
        return "Datos transaccionales pendientes de auditoría/descarga.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Datos de informe a descargar", TipoDato.B, -1, false),
            new TipoCampoFiscal(this, 1, "Indicador de datos por descargar", TipoDato.Y, 1, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
