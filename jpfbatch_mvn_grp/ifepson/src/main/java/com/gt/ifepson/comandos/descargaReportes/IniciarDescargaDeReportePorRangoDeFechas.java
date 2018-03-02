package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: IniciarDescargaDeReportePorRangoDeFechas, <br>
* Iniciar Descarga de Reporte por Rango de Fechas<br>
* Notas:  Al no enviar el valor del campo “Fecha final” el mismo tomará el valor actual del equipo.<br>
*  Existe la posibilidad de volver a realizar nuevamente una descarga previamente emitida y<br>
* registrada por el controlador fiscal.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	D	6	Fecha inicial<br>
* 2	D	6	Fecha final (OPCIONAL)<br>
* Campos de salida: <br>
* 1	A	-1	Nombre de archivo<br>
* 
*/
public class IniciarDescargaDeReportePorRangoDeFechas extends TipoComandoFiscal {

    public IniciarDescargaDeReportePorRangoDeFechas() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"IniciarDescargaDeReportePorRangoDeFechas"};
    }

    @Override
    public String getDescripcion() {
        return "Iniciar Descarga de Reporte por Rango de Fechas";
    }

    @Override
    public int getCodigo() {
        return 0x0951;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x51;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000111, "TIPO_REPORTE",
            "DESCARGA_CINTA_TESTIGO_DIGITAL_CTD", 0b0000000000000000,
            "DESCARGA_DUPLICADOS_DOCUMENTOS_TIPO_A", 0b0000000000000010,
            "DESCARGA_RESUMEN_DE_TOTALES", 0b0000000000000100)
        };
    }

    @Override
    public String getNotas() {
        return " Al no enviar el valor del campo “Fecha final” el mismo tomará el valor actual del equipo.\n"
                + " Existe la posibilidad de volver a realizar nuevamente una descarga previamente emitida y\n"
                + "registrada por el controlador fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Nombre de archivo", TipoDato.A, -1, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Fecha inicial", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 2, "Fecha final", TipoDato.D, 6, true)
        };
    }

}
