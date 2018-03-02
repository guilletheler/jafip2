package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDNFHGenerico, <br>
* Obtiene información del documento no fiscal homologado genérico o de uso interno en proceso de emisión.<br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	5	Número de documento correspondiente<br>
* 2	N_E	8	Cantidad de líneas impresas<br>
* 
*/
public class InformacionDNFHGenerico extends TipoComandoFiscal {

    public InformacionDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información del documento no fiscal homologado genérico o de uso interno en proceso de emisión.";
    }

    @Override
    public int getCodigo() {
        return 0x0E0A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x0A;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
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
            new TipoCampoFiscal(this, 1, "Número de documento correspondiente",TipoDato.N_E,5,false),
            new TipoCampoFiscal(this, 2, "Cantidad de líneas impresas",TipoDato.N_E,8,false),
        };
    }
    
    

}
