package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ImprimirTextoDNFHGenerico, <br>
* Imprime una línea de texto no fiscal homologado genérico o de uso interno.<br>
* Notas:  Cada 8(ocho) líneas enviadas la impresora fiscal imprimirá automáticamente una línea de texto<br>
* identificando que se trata de un documento no fiscal homologado.<br>
*  Además cada 60(sesenta) líneas enviadas la impresora emitirá un cartel indicando que no se trata<br>
* de un documento fiscal e indicando si el documento es para entregar al cliente o de uso interno.<br>
* Requerimientos:  Mecanismo impresor en línea y con papel ó poco papel disponible.<br>
* Campos de entrada: <br>
* 1	RT	-1	Texto (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class ImprimirTextoDNFHGenerico extends TipoComandoFiscal {

    public ImprimirTextoDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ImprimirTextoDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Imprime una línea de texto no fiscal homologado genérico o de uso interno.";
    }

    @Override
    public int getCodigo() {
        return 0x0E02;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x02;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Cada 8(ocho) líneas enviadas la impresora fiscal imprimirá automáticamente una línea de texto\n"
                + "identificando que se trata de un documento no fiscal homologado.\n"
                + " Además cada 60(sesenta) líneas enviadas la impresora emitirá un cartel indicando que no se trata\n"
                + "de un documento fiscal e indicando si el documento es para entregar al cliente o de uso interno.";
    }

    @Override
    public String getRequerimientos() {
        return " Mecanismo impresor en línea y con papel ó poco papel disponible.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1,"Texto",TipoDato.RT,-1,true),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
