package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerEstadoDeImpresionDeArqueoDePagos, <br>
* Obtener Estado de Impresión de Arqueo de Pagos<br>
* Consulta si se encuentra activo el informe de arqueo de pagos.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	Y	1	Arqueo de pago activo<br>
* 
*/
public class ObtenerEstadoDeImpresionDeArqueoDePagos extends TipoComandoFiscal {

    public ObtenerEstadoDeImpresionDeArqueoDePagos() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerEstadoDeImpresionDeArqueoDePagos"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Estado de Impresión de Arqueo de Pagos\n"
                + "Consulta si se encuentra activo el informe de arqueo de pagos.";
    }

    @Override
    public int getCodigo() {
        return 0x0553;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x53;
        return ret;
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
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Arqueo de pago activo", TipoDato.Y, 1, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
}
