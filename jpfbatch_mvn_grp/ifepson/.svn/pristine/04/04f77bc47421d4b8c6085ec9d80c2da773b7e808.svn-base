package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalInformacionElectronicaDeOtrosTributosDeLaJornadaFiscalEnCurso, <br>
* Obtiene información electrónica detallada sobre los Otros Tributos involucrados en la jornada en curso.<br>
* Notas:  La impresora fiscal devolverá 4 campos por cada otro tributo que se solicitó reportar, en el orden<br>
* indicado por campos 6 al 9.<br>
*  Si se especifica sin información discriminada, los campos 6 a 9 se retornarán vacíos.<br>
*  La codificación númerica del campo de entrada Tipo de Documento, es la siguiente: <br>
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
* 110	Tique Nota de Crédito<br>
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
* 953	DNFH Cambio de Inscripción en Ingeresos Brutos <br>
* Solamenteretornarán información los siguientes tipo de documentos:<br>
* 83	Tique<br>
* 81	Tique-factura A<br>
* 82	Tique-factura B<br>
* 110	Tique-nota de crédito<br>
* 111	Tique-factura C<br>
* 112	Tique-nota de crédito A<br>
* 113	Tique-nota de crédito B<br>
* 114	Tique-nota de crédito C<br>
* 115	Tique-nota de débito A<br>
* 116	Tique-nota de débito B<br>
* 117	Tique-nota de débito C<br>
* 110	Tique-nota de crédito<br>
* 118	Tique-factura M<br>
* 119	Tique-nota de crédito M<br>
* 120	Tique-nota de débito M<br>
* Requerimientos: Jornada fiscal abierta.<br>
* Campos de entrada: <br>
* 1	N_E	3	Tipo de Documento<br>
* 1	N_E	2	Número (#) de otros atributos a repostar (OPCIONAL)<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de Otros Tributos<br>
* 2	N_10_2	12	Total de Otros Tributos - Codigo 07 (Percep. Ingresos Brutos)<br>
* 3	N_10_2	12	Total de Otros Tributos - Codigo 06 (Percep. de IVA)<br>
* 4	N_10_2	12	Total de Otros Tributos - Codigo 09 (Otras Percepciones)<br>
* 5	N_E	2	Cantidad de otros tributos encontrados<br>
* 6	RT	-1	Descripcion de otros tributos #n<br>
* 7	N_10_2	12	Monto de Otros Tributos #n<br>
* 8	N_0_4	4	Tasa asociada a Otros Tributos #n<br>
* 9	N_E	2	Código asociado a Otros Tributos #n<br>
* 
*/
public class JornadaFiscalInformacionElectronicaDeOtrosTributosDeLaJornadaFiscalEnCurso extends TipoComandoFiscal {

    public JornadaFiscalInformacionElectronicaDeOtrosTributosDeLaJornadaFiscalEnCurso() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalInformacionElectronicaDeOtrosTributosDeLaJornadaFiscalEnCurso"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información electrónica detallada sobre los Otros Tributos involucrados en la jornada en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x080C;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x0C;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresora fiscal devolverá 4 campos por cada otro tributo que se solicitó reportar, en el orden\n"
                + "indicado por campos 6 al 9.\n"
                + " Si se especifica sin información discriminada, los campos 6 a 9 se retornarán vacíos.\n"
                + " La codificación númerica del campo de entrada Tipo de Documento, es la siguiente: \n"
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
                + "110	Tique Nota de Crédito\n"
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
                + "953	DNFH Cambio de Inscripción en Ingeresos Brutos \n"
                + "Solamenteretornarán información los siguientes tipo de documentos:\n"
                + "83	Tique\n"
                + "81	Tique-factura A\n"
                + "82	Tique-factura B\n"
                + "110	Tique-nota de crédito\n"
                + "111	Tique-factura C\n"
                + "112	Tique-nota de crédito A\n"
                + "113	Tique-nota de crédito B\n"
                + "114	Tique-nota de crédito C\n"
                + "115	Tique-nota de débito A\n"
                + "116	Tique-nota de débito B\n"
                + "117	Tique-nota de débito C\n"
                + "110	Tique-nota de crédito\n"
                + "118	Tique-factura M\n"
                + "119	Tique-nota de crédito M\n"
                + "120	Tique-nota de débito M";
    }

    @Override
    public String getRequerimientos() {
        return "Jornada fiscal abierta.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
          return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS",
            "INFORMACION_CON_DISCRIMINACION_POR_TASA_DE_IMPUESTOS_INCLUIDO", 0b0000000000000000,
            "SIN_INFORMACION_DISCRIMINADA_POR_TASA_DE_IMPUESTOS", 0b0000000000000001),
            new TipoExtension(0b0000000100000000, "DATOS_DESDE",
            "DATOS_DESDE_EL_ULTIMO_CIERRE_DE_CAJERO_O_INICIO_DE_JORNADA", 0b0000000000000000,
            "DATOS_DESDE_EL_INICIO_DE_JORNADA_FISCAL", 0b0000000000000001),
          
          };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Tipo de Documento", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 1, "Número (#) de otros atributos a repostar", TipoDato.N_E, 2, true),
        };
    }
    
    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Total de Otros Tributos", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 2, "Total de Otros Tributos - Codigo 07 (Percep. Ingresos Brutos)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 3, "Total de Otros Tributos - Codigo 06 (Percep. de IVA)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 4, "Total de Otros Tributos - Codigo 09 (Otras Percepciones)", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 5, "Cantidad de otros tributos encontrados", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 6, "Descripcion de otros tributos #n", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 7, "Monto de Otros Tributos #n", TipoDato.N_10_2, 12, false),
            new TipoCampoFiscal(this, 8, "Tasa asociada a Otros Tributos #n", TipoDato.N_0_4, 4, false),
            new TipoCampoFiscal(this, 9, "Código asociado a Otros Tributos #n", TipoDato.N_E, 2, false),
        };
    }


}
