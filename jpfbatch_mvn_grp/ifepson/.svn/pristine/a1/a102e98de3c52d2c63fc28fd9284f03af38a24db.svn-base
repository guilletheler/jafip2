package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ObtenerErrorDeProcesoInterno, ConsultarErrorDeProcesoInterno, <br>
* Obtener Error de Proceso Interno<br>
* Notas: Este comando permite conocer la causa precisa del error si se produjo un fallo en una operación internay la impresora fiscal detecta que quedan operaciones pendientes. Al intentar ejecutar un comando larespuesta indica que se produjo un error en procesos internos. Por ejemplo ante un determinadocomando que requiera impresión pero al momento de realizarla el mecanismo impresor falla.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ObtenerErrorDeProcesoInterno extends TipoComandoFiscal {

    public ObtenerErrorDeProcesoInterno() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerErrorDeProcesoInterno", "ConsultarErrorDeProcesoInterno"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Error de Proceso Interno";
    }

    @Override
    public String getNotas() {
        return "Este comando permite conocer la causa precisa del error si se produjo un fallo en una operación interna"
                + "y la impresora fiscal detecta que quedan operaciones pendientes. Al intentar ejecutar un comando la"
                + "respuesta indica que se produjo un error en procesos internos. Por ejemplo ante un determinado"
                + "comando que requiera impresión pero al momento de realizarla el mecanismo impresor falla.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public int getCodigo() {
        return 0x0004;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.SISTEMA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x00;
        ret[1] = 0x04;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
}
