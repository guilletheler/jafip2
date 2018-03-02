package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InicializacionContinuarDescargaDeSolicitudDeAltaFiscal_SAF, <br>
* Descarga el archivo firmado por la impresora en los pasos necesarios.<br>
* Notas: Descarga el archivo firmado por la impresora en los pasos necesarios.<br>
* Requerimientos: Haber comenzado la descarga de la SAF (comando 04 40).<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	-1	Datos de informe a descargar<br>
* 2	Y	1	Indicador de datos por descargar<br>
* 
*/
public class InicializacionContinuarDescargaDeSolicitudDeAltaFiscal_SAF extends TipoComandoFiscal {

    public InicializacionContinuarDescargaDeSolicitudDeAltaFiscal_SAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionContinuarDescargaDeSolicitudDeAltaFiscal_SAF"};
    }

    @Override
    public String getDescripcion() {
        return "Descarga el archivo firmado por la impresora en los pasos necesarios.";
    }

    @Override
    public int getCodigo() {
        return 0x0441;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x41;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Descarga el archivo firmado por la impresora en los pasos necesarios.";
    }

    @Override
    public String getRequerimientos() {
        return "Haber comenzado la descarga de la SAF (comando 04 40).";
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
            new TipoCampoFiscal(this, 1, "Datos de informe a descargar", TipoDato.B, -1, false),
            new TipoCampoFiscal(this, 2, "Indicador de datos por descargar", TipoDato.Y, 1, false),};
    }

}
