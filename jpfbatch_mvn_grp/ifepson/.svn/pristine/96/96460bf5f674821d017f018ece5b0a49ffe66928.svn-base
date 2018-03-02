package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: JornadaFiscalFinalizarAuditoriaDetalladaDeJornadasFiscales, <br>
* Confirma la descarga exitosa y da por finalizado el informe de Auditoría de JornadasFiscales.<br>
* Notas: No posee notas<br>
* Requerimientos:  Informe de cierres Z iniciado.<br>
*  No deben existir pendientes de descarga.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class JornadaFiscalFinalizarAuditoriaDetalladaDeJornadasFiscales extends TipoComandoFiscal {

    public JornadaFiscalFinalizarAuditoriaDetalladaDeJornadasFiscales() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalFinalizarAuditoriaDetalladaDeJornadasFiscales"};
    }

    @Override
    public String getDescripcion() {
        return "Confirma la descarga exitosa y da por finalizado el informe de Auditoría de JornadasFiscales.";
    }

    @Override
    public int getCodigo() {
        return 0x0815;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x15;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return " Informe de cierres Z iniciado.\n"
                + " No deben existir pendientes de descarga.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
