package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;


/**
* Comando: InformacionDeIVATiqueFactNDABCM, <br>
* Obtiene información de IVA del tique-factura o nota de débito A/B/C/M en curso.<br>
* Notas: La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique fiscal en el orden indicado por campos 2 al 3.<br>
* Si se solicitara sin información discriminada, los campos 2 al 15 se retornarán vacíos.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de IVA<br>
* 2	N_E	4	Tasa de IVA #1 (OPCIONAL)<br>
* 3	N_10_2	12	Monto de IVA x tasa #1 (OPCIONAL)<br>
* 4	N_E	4	Tasa de IVA #2 (OPCIONAL)<br>
* 5	N_10_2	12	Monto de IVA x tasa #2 (OPCIONAL)<br>
* 6	N_E	4	Tasa de IVA #3 (OPCIONAL)<br>
* 7	N_10_2	12	Monto de IVA x tasa #3 (OPCIONAL)<br>
* 8	N_E	4	Tasa de IVA #4 (OPCIONAL)<br>
* 9	N_10_2	12	Monto de IVA x tasa #4 (OPCIONAL)<br>
* 10	N_E	4	Tasa de IVA #5 (OPCIONAL)<br>
* 11	N_10_2	12	Monto de IVA x tasa #5 (OPCIONAL)<br>
* 12	N_E	4	Tasa de IVA #6 (OPCIONAL)<br>
* 13	N_10_2	12	Monto de IVA x tasa #6 (OPCIONAL)<br>
* 14	N_E	4	Tasa de IVA #7 (OPCIONAL)<br>
* 15	N_10_2	12	Monto de IVA x tasa #7 (OPCIONAL)<br>
* 
*/
public class InformacionDeIVATiqueFactNDABCM extends TipoComandoFiscal {

	public InformacionDeIVATiqueFactNDABCM() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"InformacionDeIVATiqueFactNDABCM"};
	}

	@Override
	public String getDescripcion() {
		return "Obtiene información de IVA del tique-factura o nota de débito A/B/C/M en curso.";
	}

	@Override
	public int getCodigo() {
		return 0x0B0B;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.TFND;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x0B;
		ret[1] = 0x0B;
		return ret;
	}
        
        @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar tasas",
            "CON_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS_INCLUIDA", 0b0000000000000000,
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "La impresora fiscal devolverá 2 campos por cada tasa que haya sido utilizada durante el tique fiscal en el orden indicado por campos 2 al 3.\n"
                + "Si se solicitara sin información discriminada, los campos 2 al 15 se retornarán vacíos.";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Total de IVA", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Tasa de IVA #1", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 3, "Monto de IVA x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 4, "Tasa de IVA #2", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 5, "Monto de IVA x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 6, "Tasa de IVA #3", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 7, "Monto de IVA x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 8, "Tasa de IVA #4", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 9, "Monto de IVA x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 10, "Tasa de IVA #5", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 11, "Monto de IVA x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 12, "Tasa de IVA #6", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 13, "Monto de IVA x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 14, "Tasa de IVA #7", TipoDato.N_E, 4, true),
            new TipoCampoFiscal(this, 15, "Monto de IVA x tasa #7", TipoDato.N_10_2, 12, true)
        };
    }

}