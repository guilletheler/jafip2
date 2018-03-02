package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CerrarDNFHGenerico, <br>
* Realiza el cierre del documento no fiscal homologado genérico o de uso interno en proceso de emisión.<br>
* Notas: No posee notas<br>
* Requerimientos: Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	N_E	3	Número de líneas de cola de reemplazo #1 (OPCIONAL)<br>
* 2	RT	-1	Descripción de reemplazo #1 (OPCIONAL)<br>
* 3	N_E	3	Número de líneas de cola de reemplazo #2 (OPCIONAL)<br>
* 4	RT	-1	Descripción de reemplazo #2 (OPCIONAL)<br>
* 5	N_E	3	Número de líneas de cola de reemplazo #3 (OPCIONAL)<br>
* 6	RT	-1	Descripción de reemplazo #3 (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_E	5	Número de documento no fiscal homologado genérico<br>
* 
*/
public class CerrarDNFHGenerico extends TipoComandoFiscal {

    public CerrarDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CerrarDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza el cierre del documento no fiscal homologado genérico o de uso interno en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x0E06;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x06;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "CORTA_PAPEL",
            "NO_CORTA_PAPEL", 0b0000000000000000,
            "CORTA_PAPEL", 0b0000000000000001),
            new TipoExtension(0b0000010000000000, "IMPRIME_COLAS",
            "IMPRIME_COLAS", 0b0000000000000000,
            "NO_IMPRIME_COLAS", 0b0000010000000000),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de líneas de cola de reemplazo #1", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 2, "Descripción de reemplazo #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Número de líneas de cola de reemplazo #2", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 4, "Descripción de reemplazo #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Número de líneas de cola de reemplazo #3", TipoDato.N_E, 3, true),
            new TipoCampoFiscal(this, 6, "Descripción de reemplazo #3", TipoDato.RT, -1, true),};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de documento no fiscal homologado genérico",TipoDato.N_E,5,false),
        };
    }

}
