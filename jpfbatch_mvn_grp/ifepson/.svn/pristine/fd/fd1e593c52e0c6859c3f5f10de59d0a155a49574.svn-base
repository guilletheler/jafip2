package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: AuditoriaResumidaODetallada, <br>
* Auditoría Resumida /Comenzar Auditoría Detallada de Jornadas Fiscales por Rango de Fechas<br>
* Inicia un informe de Auditoría detallada de Jornadas Fiscales. Obtiene la información de acuerdo a los parámetros solicitados y prepara la descarga electrónica de datos.<br>
* Notas: Al no enviar el valor del campo “Fecha final de informe” el mismo tomará el valor actual del equipo.<br>
* Requerimientos: Mecanismo impresor en línea y con papel (Mecanismo impresor en línea y con papel)<br>
* Campos de entrada: <br>
* 1	D	6	Fecha inicial del informe<br>
* 2	D	6	Fecha final del informe (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class AuditoriaResumidaODetallada extends TipoComandoFiscal {

    public AuditoriaResumidaODetallada() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AuditoriaResumidaODetallada"};
    }

    @Override
    public String getDescripcion() {
        return "Auditoría Resumida /Comenzar Auditoría Detallada de Jornadas Fiscales por Rango de Fechas\n"
                + "Inicia un informe de Auditoría detallada de Jornadas Fiscales. Obtiene la información de acuerdo a los parámetros solicitados y prepara la descarga electrónica de datos.";
    }

    @Override
    public int getCodigo() {
        return 0x0812;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x12;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Al no enviar el valor del campo “Fecha final de informe” el mismo tomará el valor actual del equipo.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel (Mecanismo impresor en línea y con papel)";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIMIR",
            "NO_IMPRIME_REPORTE", 0b0000000000000000,
            "IMPRIME_REPORTE", 0b0000000000000001),
            new TipoExtension(0b0000000000000010, "TIPO_AUDITORIA",
            "AUDITORIA_DETALLADA", 0b0000000000000000,
            "AUDITORIA_RESUMIDA", 0b0000000000000010)
        };

    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Fecha inicial del informe", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 2, "Fecha final del informe", TipoDato.D, 6, true)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
