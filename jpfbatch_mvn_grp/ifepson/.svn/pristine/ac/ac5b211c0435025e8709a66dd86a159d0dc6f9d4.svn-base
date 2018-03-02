package com.gt.ifepson.comandos.diagnostico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerInformacionHistoricaDeMemoriaFiscal, <br>
* Obtener Información Histórica de Memoria Fiscal<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	8	Cantidad histórica de Informes Diario de Cierre emitidos<br>
* 2	N_E	8	Cantidad histórica de descargas de reportes efectuadas<br>
* 3	N_E	8	Cantidad histórica de altas fiscales efectuadas<br>
* 1	N_E	8	Cantidad histórica de bajas fiscales efectuadas<br>
* 
*/
public class ObtenerInformacionHistoricaDeMemoriaFiscal extends TipoComandoFiscal {

    public ObtenerInformacionHistoricaDeMemoriaFiscal() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerInformacionHistoricaDeMemoriaFiscal"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Información Histórica de Memoria Fiscal";
    }

    @Override
    public int getCodigo() {
        return 0x020B;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DIAGNOSTICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x02;
        ret[1] = 0x0B;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
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
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Cantidad histórica de Informes Diario de Cierre emitidos", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 2, "Cantidad histórica de descargas de reportes efectuadas", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 3, "Cantidad histórica de altas fiscales efectuadas", TipoDato.N_E, 8, false),
            new TipoCampoFiscal(this, 1, "Cantidad histórica de bajas fiscales efectuadas", TipoDato.N_E, 8, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
