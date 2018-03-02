package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;


/**
* Comando: JornadaFiscalFinalizarDuplicadoDeDocumentos, <br>
* Confirma la descarga dando por por finalizada la misma.<br>
* Notas: No posee notas<br>
* Requerimientos: No deben existir datos pendientes de descarga.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class JornadaFiscalFinalizarDuplicadoDeDocumentos extends TipoComandoFiscal {

	public JornadaFiscalFinalizarDuplicadoDeDocumentos() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"JornadaFiscalFinalizarDuplicadoDeDocumentos"};
	}

	@Override
	public String getDescripcion() {
		return "Confirma la descarga dando por por finalizada la misma.";
	}

	@Override
	public int getCodigo() {
		return 0x08F5;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.JORNADA_FISCAL;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x08;
		ret[1] = 0xF5;
		return ret;
	}

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "No deben existir datos pendientes de descarga.";
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