package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalInformacionElectronicaGeneralDeLaJornadaFiscalEnCurso, <br>
* Obtiene información electrónica de la jornada en curso. Se recomienda el uso de este comando para<br>
* obtener información completa acerca del estado actual de la jornada en curso.<br>
* Notas: En el caso particular de los DNFH valorizados solamente se retornará el valor del campo de salida<br>
* número 9.-Total de ventas. A continuación se detallan los documentos en cuestión:902  DNFH Recibo ‘X’<br>
* 903  DNFH Presupuesto ‘X’<br>
* 907  DNFH Comprobante Donación<br>
* Requerimientos:  La codificación númerica soportada del campo de entrada “Tipo de documento de venta”, es la siguiente: <br>
* 83	Tique<br>
* 81	Tique Factura A<br>
* 82	Tique Factura B<br>
* 91	DNFH Remito ‘R’<br>
* 110	Tique Nota de Crédito<br>
* 111	Tique Factura C<br>
* 112	Tique Nota de Crédito A<br>
* 113	Tique Nota de Crédito B<br>
* 114	Tique Nota de Crédito C<br>
* 115	Tique Nota de Débito A<br>
* 116	Tique Nota de Débito B<br>
* 117	Tique Nota de Débito C<br>
* 118	Tique Factura M<br>
* 119	Tique Nota de Crédito M<br>
* 120	Tique Nota de Débito M<br>
* 901	DNFH Remito ‘X’<br>
* 902	DNFH Recibo ‘X’<br>
* 903	DNFH Presupuesto ‘X’<br>
* 907	DNFH Comprobante Donación<br>
* 910	DNFH Documento Genérico<br>
* 923	Documento de Cambio de Línea de Establecimiento,<br>
* 	Documento de Diagnóstico del Módulo Impresor,<br>
* 	Reporte de Información del Equipo,<br>
* 	Documento Mensaje del Sistema<br>
* 936	Salida de Cajero<br>
* 941	Total de Ventas<br>
* 950	DNFH Documento de Uso Interno<br>
* 951	DNFH Cambio de Fecha y Hora<br>
* 952	DNFH Cambio de Categorización Ante el IVA<br>
* 953	DNFH Cambio de Inscripción en Ingeresos Brutos<br>
* Campos de entrada: <br>
* 1	N_E	3	Tipo de Documento de venta<br>
* Campos de salida: <br>
* 1	D	6	Fecha de apertura de a jornada fiscal<br>
* 2	T	6	Hora de apertura de a jornada fiscal<br>
* 3	N_E	5	Número del último cierre Z<br>
* 4	Y	1	Se requiere un Cierre Z pues cambió el día respecto a la apertura de la jornada fiscal<br>
* 5	D	6	Fecha de apertura del primer comprobante impreso<br>
* 6	T	6	Hora de apertura del primer comprobante impreso<br>
* 7	N_E	10	Cantidad de documentos emitidos<br>
* 8	N_E	10	Cantidad de documentos cancelados<br>
* 9	N_10_2	12	Total de ventas<br>
* 10	N_10_2	12	Total de IVA<br>
* 11	N_10_2	12	Total de impuestos internos fijos<br>
* 12	N_10_2	12	Total de impuestos internos porcentuales<br>
* 13	N_10_2	12	Total de Otros Tributos<br>
* 14	Y	1	Período de actividades iniciado<br>
* 
*/
public class JornadaFiscalInformacionElectronicaGeneralDeLaJornadaFiscalEnCurso extends TipoComandoFiscal {

    public JornadaFiscalInformacionElectronicaGeneralDeLaJornadaFiscalEnCurso() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalInformacionElectronicaGeneralDeLaJornadaFiscalEnCurso"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información electrónica de la jornada en curso. Se recomienda el uso de este comando para\n"
                + "obtener información completa acerca del estado actual de la jornada en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x080A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x0A;
        return ret;
    }

    @Override
    public String getNotas() {
        return "En el caso particular de los DNFH valorizados solamente se retornará el valor del campo de salida\n"
                + "número 9.-Total de ventas. A continuación se detallan los documentos en cuestión:"
                + "902  DNFH Recibo ‘X’\n"
                + "903  DNFH Presupuesto ‘X’\n"
                + "907  DNFH Comprobante Donación";
    }

    @Override
    public String getRequerimientos() {
        return " La codificación númerica soportada del campo de entrada “Tipo de documento de venta”, es la siguiente: \n"
                + "83	Tique\n"
                + "81	Tique Factura A\n"
                + "82	Tique Factura B\n"
                + "91	DNFH Remito ‘R’\n"
                + "110	Tique Nota de Crédito\n"
                + "111	Tique Factura C\n"
                + "112	Tique Nota de Crédito A\n"
                + "113	Tique Nota de Crédito B\n"
                + "114	Tique Nota de Crédito C\n"
                + "115	Tique Nota de Débito A\n"
                + "116	Tique Nota de Débito B\n"
                + "117	Tique Nota de Débito C\n"
                + "118	Tique Factura M\n"
                + "119	Tique Nota de Crédito M\n"
                + "120	Tique Nota de Débito M\n"
                + "901	DNFH Remito ‘X’\n"
                + "902	DNFH Recibo ‘X’\n"
                + "903	DNFH Presupuesto ‘X’\n"
                + "907	DNFH Comprobante Donación\n"
                + "910	DNFH Documento Genérico\n"
                + "923	Documento de Cambio de Línea de Establecimiento,\n"
                + "	Documento de Diagnóstico del Módulo Impresor,\n"
                + "	Reporte de Información del Equipo,\n"
                + "	Documento Mensaje del Sistema\n"
                + "936	Salida de Cajero\n"
                + "941	Total de Ventas\n"
                + "950	DNFH Documento de Uso Interno\n"
                + "951	DNFH Cambio de Fecha y Hora\n"
                + "952	DNFH Cambio de Categorización Ante el IVA\n"
                + "953	DNFH Cambio de Inscripción en Ingeresos Brutos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000100000000, "DATOS_DESDE",
            "DATOS_DESDE_EL_ULTIMO_CIERRE_DE_CAJERO_O_INICIO_DE_JORNADA", 0b0000000000000000,
            "DATOS_DESDE_EL_INICIO_DE_JORNADA_FISCAL", 0b0000000100000000),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Tipo de Documento de venta", TipoDato.N_E, 3, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Fecha de apertura de a jornada fiscal", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 2, "Hora de apertura de a jornada fiscal", TipoDato.T, 6, false),
            new TipoCampoFiscal(this, 3, "Número del último cierre Z", TipoDato.N_E, 5, false),
            new TipoCampoFiscal(this, 4, "Se requiere un Cierre Z pues cambió el día respecto a la apertura de la jornada fiscal", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 5, "Fecha de apertura del primer comprobante impreso", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 6, "Hora de apertura del primer comprobante impreso", TipoDato.T, 6, false),
            new TipoCampoFiscal(this, 7, "Cantidad de documentos emitidos", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 8, "Cantidad de documentos cancelados", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 9, "Total de ventas", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 10, "Total de IVA", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 11, "Total de impuestos internos fijos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 12, "Total de impuestos internos porcentuales", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 13, "Total de Otros Tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 14, "Período de actividades iniciado", TipoDato.Y, 1, false),};
    }

}
