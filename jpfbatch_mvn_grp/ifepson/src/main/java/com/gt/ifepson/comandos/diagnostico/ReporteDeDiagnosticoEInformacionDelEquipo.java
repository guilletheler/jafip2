package com.gt.ifepson.comandos.diagnostico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: DeDiagnosticoEInformacionDelEquipo, <br>
* Reporte de Diagnóstico e Información del Equipo<br>
* Notas: Imprime un documento con las características del mecanismo impresor.<br>
* Requerimientos: Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ReporteDeDiagnosticoEInformacionDelEquipo extends TipoComandoFiscal {

    public static final int ESTACION_SLIP = 0b0000000000000001;

    public ReporteDeDiagnosticoEInformacionDelEquipo() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"DeDiagnosticoEInformacionDelEquipo"};
    }

    @Override
    public String getDescripcion() {
        return "Reporte de Diagnóstico e Información del Equipo";
    }

    @Override
    public int getCodigo() {
        return 0x0201;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DIAGNOSTICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x02;
        ret[1] = 0x01;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "ESTACION",
            "ESTACION_ROLLO", 0b0000000000000000,
            "ESTACION_SLIP", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "Imprime un documento con las características del mecanismo impresor.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
