package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InicializacionContinuarDescargaDeSolicitudDeBajaFiscal_SBF, <br>
* Envía el archivo por partes. La descarga se completa con sucesivas llamadas hasta que se indique que<br>
* no hay más datos para descargar.<br>
* Notas: No posee notas<br>
* Requerimientos: Haber iniciado la descarga de SBF.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	-1	Datos de informe a descargar<br>
* 2	Y	1	Indicador de datos por descargar<br>
* 
*/
public class InicializacionContinuarDescargaDeSolicitudDeBajaFiscal_SBF extends TipoComandoFiscal {

    public InicializacionContinuarDescargaDeSolicitudDeBajaFiscal_SBF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionContinuarDescargaDeSolicitudDeBajaFiscal_SBF"};
    }

    @Override
    public String getDescripcion() {
        return "Envía el archivo por partes. La descarga se completa con sucesivas llamadas hasta que se indique que\n"
                + "no hay más datos para descargar.";
    }

    @Override
    public int getCodigo() {
        return 0x0411;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x11;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Haber iniciado la descarga de SBF.";
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
            new TipoCampoFiscal(this, 2, "Indicador de datos por descargar", TipoDato.Y, 1, false),
        };
    }
    
    

}
