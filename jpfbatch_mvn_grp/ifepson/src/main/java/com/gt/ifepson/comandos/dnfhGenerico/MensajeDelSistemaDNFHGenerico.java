package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;


/**
* Comando: MensajeDelSistemaDNFHGenerico, <br>
* Imprime mensaje del sistema con hasta 5 lineas de texto libre.<br>
* Notas: Se incrementa en uno el contador de mensajes.<br>
* Requerimientos: Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	RT	-1	Linea de texto #1<br>
* 2	RT	-1	Linea de texto #2 (OPCIONAL)<br>
* 3	RT	-1	Linea de texto #3 (OPCIONAL)<br>
* 4	RT	-1	Linea de texto #4 (OPCIONAL)<br>
* 5	RT	-1	Linea de texto #5 (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class MensajeDelSistemaDNFHGenerico extends TipoComandoFiscal {

	public MensajeDelSistemaDNFHGenerico() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"MensajeDelSistemaDNFHGenerico"};
	}

	@Override
	public String getDescripcion() {
		return "Imprime mensaje del sistema con hasta 5 lineas de texto libre.";
	}

	@Override
	public int getCodigo() {
		return 0x0E50;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.DNFH_GENERICO;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x0E;
		ret[1] = 0x50;
		return ret;
	}

    @Override
    public String getNotas() {
        return "Se incrementa en uno el contador de mensajes.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Linea de texto #1", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Linea de texto #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Linea de texto #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 4, "Linea de texto #4", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Linea de texto #5", TipoDato.RT, -1, true),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}