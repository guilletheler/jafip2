package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;


/**
* Comando: InformacionDeImpuestosInternosTiqueFactNDABCM, <br>
* Información de Impuestos Internos<br>
* Notas: La impresora fiscal devolverá 3 campos por cada tasa que haya sido utilizada durante el tique fiscal<br>
* en el orden indicado por campos 4 al 6.<br>
* Si se solicitara sin información discriminada, los campos 4 al 18 se retornarán vacíos.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_10_2	12	Total impuestos internos<br>
* 2	N_10_2	12	Total impuestos internos fijos<br>
* 3	N_10_2	12	Total impuestos internos porcentuales<br>
* 4	N_0_4	4	Tasa de IVA #1 (OPCIONAL)<br>
* 5	N_10_2	12	Total impuestos internos x tasa #1 (OPCIONAL)<br>
* 6	N_10_2	12	Total impuestos internos fijos x tasa #1 (OPCIONAL)<br>
* 7	N_10_2	12	Total impuestos internos porcentuales x tasa #1 (OPCIONAL)<br>
* 8	N_0_4	4	Tasa de IVA #2 (OPCIONAL)<br>
* 9	N_10_2	12	Total impuestos internos x tasa #2 (OPCIONAL)<br>
* 10	N_10_2	12	Total impuestos internos fijos x tasa #2 (OPCIONAL)<br>
* 11	N_10_2	12	Total impuestos internos porcentuales x tasa #2 (OPCIONAL)<br>
* 12	N_0_4	4	Tasa de IVA #3 (OPCIONAL)<br>
* 13	N_10_2	12	Total impuestos internos x tasa #3 (OPCIONAL)<br>
* 14	N_10_2	12	Total impuestos internos fijos x tasa #3 (OPCIONAL)<br>
* 15	N_10_2	12	Total impuestos internos porcentuales x tasa #3 (OPCIONAL)<br>
* 16	N_0_4	4	Tasa de IVA #4 (OPCIONAL)<br>
* 17	N_10_2	12	Total impuestos internos x tasa #4 (OPCIONAL)<br>
* 18	N_10_2	12	Total impuestos internos fijos x tasa #4 (OPCIONAL)<br>
* 19	N_10_2	12	Total impuestos internos porcentuales x tasa #4 (OPCIONAL)<br>
* 20	N_0_4	4	Tasa de IVA #5 (OPCIONAL)<br>
* 21	N_10_2	12	Total impuestos internos x tasa #5 (OPCIONAL)<br>
* 22	N_10_2	12	Total impuestos internos fijos x tasa #5 (OPCIONAL)<br>
* 23	N_10_2	12	Total impuestos internos porcentuales x tasa #5 (OPCIONAL)<br>
* 24	N_0_4	4	Tasa de IVA #6 (OPCIONAL)<br>
* 25	N_10_2	12	Total impuestos internos x tasa #6 (OPCIONAL)<br>
* 26	N_10_2	12	Total impuestos internos fijos x tasa #6 (OPCIONAL)<br>
* 27	N_10_2	12	Total impuestos internos porcentuales x tasa #6 (OPCIONAL)<br>
* 28	N_0_4	4	Tasa de IVA #7 (OPCIONAL)<br>
* 29	N_10_2	12	Total impuestos internos x tasa #7 (OPCIONAL)<br>
* 30	N_10_2	12	Total impuestos internos fijos x tasa #7 (OPCIONAL)<br>
* 31	N_10_2	12	Total impuestos internos porcentuales x tasa #7 (OPCIONAL)<br>
* 
*/
public class InformacionDeImpuestosInternosTiqueFactNDABCM extends TipoComandoFiscal {

	public InformacionDeImpuestosInternosTiqueFactNDABCM() {
	}

	@Override
	public String[] getNames() {
		return new String[] {"InformacionDeImpuestosInternosTiqueFactNDABCM"};
	}

	@Override
	public String getDescripcion() {
		return "Información de Impuestos Internos";
	}

	@Override
	public int getCodigo() {
		return 0x0B0E;
	}

	@Override
	public ClasificacionComando getClasificacionComando() {
		return ClasificacionComando.TFND;
	}

	@Override
	public int[] getComando() {
		int[] ret = new int[2];
		ret[0] = 0x0B;
		ret[1] = 0x0E;
		return ret;
	}
        
        @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Discriminar tasas",
            "CON_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000000,
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000001)
        };
    }
    
     @Override
    public String getNotas() {
        return "La impresora fiscal devolverá 3 campos por cada tasa que haya sido utilizada durante el tique fiscal\n"
                + "en el orden indicado por campos 4 al 6.\n"
                + "Si se solicitara sin información discriminada, los campos 4 al 18 se retornarán vacíos.";
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
            new TipoCampoFiscal(this, 1, "Total impuestos internos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total impuestos internos fijos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total impuestos internos porcentuales", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Tasa de IVA #1", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 5, "Total impuestos internos x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 6, "Total impuestos internos fijos x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 7, "Total impuestos internos porcentuales x tasa #1", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 8, "Tasa de IVA #2", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 9, "Total impuestos internos x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 10, "Total impuestos internos fijos x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 11, "Total impuestos internos porcentuales x tasa #2", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 12, "Tasa de IVA #3", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 13, "Total impuestos internos x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 14, "Total impuestos internos fijos x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 15, "Total impuestos internos porcentuales x tasa #3", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 16, "Tasa de IVA #4", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 17, "Total impuestos internos x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 18, "Total impuestos internos fijos x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 19, "Total impuestos internos porcentuales x tasa #4", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 20, "Tasa de IVA #5", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 21, "Total impuestos internos x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 22, "Total impuestos internos fijos x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 23, "Total impuestos internos porcentuales x tasa #5", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 24, "Tasa de IVA #6", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 25, "Total impuestos internos x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 26, "Total impuestos internos fijos x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 27, "Total impuestos internos porcentuales x tasa #6", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 28, "Tasa de IVA #7", TipoDato.N_0_4, 4, true),
            new TipoCampoFiscal(this, 29, "Total impuestos internos x tasa #7", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 30, "Total impuestos internos fijos x tasa #7", TipoDato.N_10_2, 12, true),
            new TipoCampoFiscal(this, 31, "Total impuestos internos porcentuales x tasa #7", TipoDato.N_10_2, 12, true)
        };
    }

}