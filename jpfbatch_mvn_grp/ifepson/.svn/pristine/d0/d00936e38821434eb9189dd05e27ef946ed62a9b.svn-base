package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ImpresionDeArqueoDePagos, <br>
* Impresión de Arqueo de Pagos<br>
* Activa o desactiva la impresión de impresión de los arqueos de pagos al final de los informes “Salida de Cajero” y “Total de Ventas”.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ImpresionDeArqueoDePagos extends TipoComandoFiscal {
    
    
    /**
     * Campo 1 Bit 0
     */
    public static final int DESACTIVA_ARQUEO_DE_PAGOS = 0b0000000000000000;

    /**
     * Campo 1 Bit 0
     */
    public static final int ACTIVA_ARQUEO_DE_PAGOS = 0b0000000000000001;

    public ImpresionDeArqueoDePagos() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ImpresionDeArqueoDePagos"};
    }

    @Override
    public String getDescripcion() {
        return "Impresión de Arqueo de Pagos\n"
                + "Activa o desactiva la impresión de impresión de los arqueos de pagos al final de los informes “Salida de Cajero” y “Total de Ventas”.";
    }

    @Override
    public int getCodigo() {
        return 0x0552;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x52;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "ARQUEO_DE_PAGOS",
            "DESACTIVA_ARQUEO_DE_PAGOS", 0b0000000000000000,
            "ACTIVA_ARQUEO_DE_PAGOS", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }

    
}
