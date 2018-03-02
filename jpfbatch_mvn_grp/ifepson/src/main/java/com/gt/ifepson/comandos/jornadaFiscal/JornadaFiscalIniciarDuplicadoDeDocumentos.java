package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalIniciarDuplicadoDeDocumentos, <br>
* Inicia la descarga del duplicado electrónico en formato XML de un documento ya emitido con<br>
* anterioridad, y opcionalmente se puede elegir realizar la Reimpresión del documento solicitado.<br>
* Notas: Los valores posibles para el campo tipo de documentoson: <br>
* 080 - Cierre Z.<br>
* 081 - Tique Factura A.<br>
* 082 - Tique Factura B.<br>
* 083 - Tique.<br>
* 091 - Remito R.<br>
* 110 - Tique Nota de Crédito.<br>
* 111 - Tique Factura C.<br>
* 112 - Tique Nota de Crédito A.<br>
* 113 - Tique Nota de Crédito B.<br>
* 114 - Tique Nota de Crédito C.<br>
* 115 - Tique Nota de Débito A.<br>
* 116 - Tique Nota de Débito B.<br>
* 117 - Tique Nota de Débito C.<br>
* 118 - Tique Factura M. <br>
* 119 - Tique Nota de Crédito M.<br>
* 120 - Tique Nota de Débito M.<br>
* 901 - Remito X.<br>
* 902 - Recibo X.<br>
* 903 - Presupuesto.<br>
* 907 - Comprobante Donación.<br>
* 910 - Documento Genérico.<br>
* 923 - Mensaje del Controlador Fiscal o del Sistema.<br>
* 936 - Salida de Cajero.<br>
* 941 - Total de Ventas.<br>
* 950 - Documento de Uso Interno.<br>
* 951 - Cambio de Fecha y Hora.<br>
* 952 - Cambio de Categorización ante el IVA.<br>
* 953 - Cambio de Ingresos Brutos.<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* 1	N_E	3	Tipo de Documento<br>
* 2	N_E	-1	Número de Documento<br>
* Campos de salida: <br>
* 1	D	6	Fecha de apertura de la jornada fiscal<br>
* 2	T	6	Hora de apertura de la jornada fiscal<br>
* 3	N_E	5	Número del último cierre Z<br>
* 4	Y	1	Se requiere un Cierre Z pues combió el día respecto de la apertura de la jornada fiscal<br>
* 5	D	6	Fecha de apertura del primer comprobante impreso<br>
* 6	T	6	Hora de apertura del primer comprobante impreso<br>
* 7	N_E	10	Cantidad de documentos emitidos<br>
* 8	N_E	10	Cantidad de documentos cancelados<br>
* 9	N_10_2	12	Total de ventas<br>
* 10	N_10_2	12	Total IVA<br>
* 11	N_10_2	12	Total de impuestos internos fijos<br>
* 12	N_10_2	12	Total de impuestos internos porcentuales<br>
* 13	N_10_2	12	Total de Otros Tributos<br>
* 14	Y	1	Período de actividades iniciado<br>
* 
*/
public class JornadaFiscalIniciarDuplicadoDeDocumentos extends TipoComandoFiscal {

    public JornadaFiscalIniciarDuplicadoDeDocumentos() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalIniciarDuplicadoDeDocumentos"};
    }

    @Override
    public String getDescripcion() {
        return "Inicia la descarga del duplicado electrónico en formato XML de un documento ya emitido con\n"
                + "anterioridad, y opcionalmente se puede elegir realizar la Reimpresión del documento solicitado.";
    }

    @Override
    public int getCodigo() {
        return 0x08F0;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0xF0;
        return ret;
    }

    @Override
    public String getNotas() {
        return "Los valores posibles para el campo tipo de documentoson: \n"
                + "080 - Cierre Z.\n"
                + "081 - Tique Factura A.\n"
                + "082 - Tique Factura B.\n"
                + "083 - Tique.\n"
                + "091 - Remito R.\n"
                + "110 - Tique Nota de Crédito.\n"
                + "111 - Tique Factura C.\n"
                + "112 - Tique Nota de Crédito A.\n"
                + "113 - Tique Nota de Crédito B.\n"
                + "114 - Tique Nota de Crédito C.\n"
                + "115 - Tique Nota de Débito A.\n"
                + "116 - Tique Nota de Débito B.\n"
                + "117 - Tique Nota de Débito C.\n"
                + "118 - Tique Factura M. \n"
                + "119 - Tique Nota de Crédito M.\n"
                + "120 - Tique Nota de Débito M.\n"
                + "901 - Remito X.\n"
                + "902 - Recibo X.\n"
                + "903 - Presupuesto.\n"
                + "907 - Comprobante Donación.\n"
                + "910 - Documento Genérico.\n"
                + "923 - Mensaje del Controlador Fiscal o del Sistema.\n"
                + "936 - Salida de Cajero.\n"
                + "941 - Total de Ventas.\n"
                + "950 - Documento de Uso Interno.\n"
                + "951 - Cambio de Fecha y Hora.\n"
                + "952 - Cambio de Categorización ante el IVA.\n"
                + "953 - Cambio de Ingresos Brutos.";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
         return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIME_DUPLICADO",
            "NO_IMPRIME_DUPLICADO", 0b0000000000000000,
            "IMPRIME_DUPLICADO", 0b0000000000000001),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
          new TipoCampoFiscal(this, 1, "Tipo de Documento", TipoDato.N_E, 3, false),
          new TipoCampoFiscal(this, 2, "Número de Documento", TipoDato.N_E, -1, false),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
          new TipoCampoFiscal(this, 1, "Fecha de apertura de la jornada fiscal", TipoDato.D, 6, false),
          new TipoCampoFiscal(this, 2, "Hora de apertura de la jornada fiscal", TipoDato.T, 6, false),
          new TipoCampoFiscal(this, 3, "Número del último cierre Z", TipoDato.N_E, 5, false),
          new TipoCampoFiscal(this, 4, "Se requiere un Cierre Z pues combió el día respecto de la apertura de la jornada fiscal", TipoDato.Y, 1, false),
          new TipoCampoFiscal(this, 5, "Fecha de apertura del primer comprobante impreso", TipoDato.D, 6, false),
          new TipoCampoFiscal(this, 6, "Hora de apertura del primer comprobante impreso", TipoDato.T, 6, false),
          new TipoCampoFiscal(this, 7, "Cantidad de documentos emitidos", TipoDato.N_E, 10, false),
          new TipoCampoFiscal(this, 8, "Cantidad de documentos cancelados", TipoDato.N_E, 10, false),
          new TipoCampoFiscal(this, 9, "Total de ventas", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 10, "Total IVA", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 11, "Total de impuestos internos fijos", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 12, "Total de impuestos internos porcentuales", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 13, "Total de Otros Tributos", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 14, "Período de actividades iniciado", TipoDato.Y, 1, false),
        };
    }

}
