package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;


/**
* Comando: JornadaFiscalCancelarAuditoriaDetalladaDeJornadasFiscales, <br>
* Cancela el informe de Auditoría en proceso de descarga.<br>
* Notas: No posee notas<br>
* Requerimientos:  Informe de cierres Z iniciado.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class JornadaFiscalCancelarAuditoriaDetalladaDeJornadasFiscales extends TipoComandoFiscal {

	public JornadaFiscalCancelarAuditoriaDetalladaDeJornadasFiscales() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"JornadaFiscalCancelarAuditoriaDetalladaDeJornadasFiscales"};
	}

	@Override
	public String getDescripcion() {
		return "Cancela el informe de Auditoría en proceso de descarga.";
	}

	@Override
	public int getCodigo() {
		return 0x0816;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.JORNADA_FISCAL;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x08;
		ret[1] = 0x16;
		return ret;
	}
        
        @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return " Informe de cierres Z iniciado.";
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