package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;


/**
* Comando: JornadaFiscalContinuarDuplicadoDeDocumentos, <br>
* Obtiene el primero o siguiente paquete de datos a descargar.<br>
* Notas: Los datos son descargados en forma continua.<br>
* Requerimientos: Datos pendientes de descargas.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	A	-1	Datos a descargar<br>
* 1	Y	1	Indicador de datos por descargar<br>
* 
*/
public class JornadaFiscalContinuarDuplicadoDeDocumentos extends TipoComandoFiscal {

	public JornadaFiscalContinuarDuplicadoDeDocumentos() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"JornadaFiscalContinuarDuplicadoDeDocumentos"};
	}

	@Override
	public String getDescripcion() {
		return "Obtiene el primero o siguiente paquete de datos a descargar.";
	}

	@Override
	public int getCodigo() {
		return 0x08F4;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.JORNADA_FISCAL;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x08;
		ret[1] = 0xF4;
		return ret;
	}

    @Override
    public String getNotas() {
        return "Los datos son descargados en forma continua.";
    }

    @Override
    public String getRequerimientos() {
        return "Datos pendientes de descargas.";
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
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Datos a descargar", TipoDato.A, -1, false),
            new TipoCampoFiscal(this, 1, "Indicador de datos por descargar", TipoDato.Y, 1, false),
        };
    }
        
        

}