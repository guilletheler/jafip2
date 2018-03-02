package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: IniciarDescargaDeReportePorRangoDeZ, <br>
* Iniciar Descarga de Reporte por Rango de Z <br>
* Notas:  Al no enviar el valor del campo “Z final” el mismo tomará el valor máximo posible (valor igual a<br>
* 9999).<br>
*  Existe la posibilidad de volver a realizar nuevamente una descarga previamente emitida y<br>
* registrada por el controlador fiscal.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	N_E	4	Z inicial<br>
* 2	N_E	4	Z final (OPCIONAL)<br>
* Campos de salida: <br>
* 1	A	-1	Nombre de archivo<br>
* 
*/
public class IniciarDescargaDeReportePorRangoDeZ extends TipoComandoFiscal {

    public IniciarDescargaDeReportePorRangoDeZ() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"IniciarDescargaDeReportePorRangoDeZ"};
    }

    @Override
    public String getDescripcion() {
        return "Iniciar Descarga de Reporte por Rango de Z ";
    }

    @Override
    public int getCodigo() {
        return 0x0952;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x52;
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
        return " Al no enviar el valor del campo “Z final” el mismo tomará el valor máximo posible (valor igual a\n"
                + "9999).\n"
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
            new TipoCampoFiscal(this, 1, "Z inicial", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 2, "Z final", TipoDato.N_E, 4, true)
        };
    }

}
