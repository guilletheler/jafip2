package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalInformacionElectronicaDeImpuestosDeLaJornadaFiscalEnCurso, <br>
* Obtiene información electrónica de impuestos de la jornada fiscal en curso.<br>
* Notas:  La impresora fiscal devolverá 5 campos por cada tasa que haya sido utilizada durante la jornada<br>
* fiscal en el orden indicado del campo 2 al 6.<br>
*  La codificación númerica del campo de entrada Tipo de Documento, es la siguiente:<br>
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
* 953	DNFH Cambio de Inscripción en Ingresos Brutos<br>
* Solamente retornarán información los siguientes tipo de documentos:<br>
* 81	Tique Factura A<br>
* 82	Tique Factura B<br>
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
* Requerimientos: Jornada fiscal abierta.<br>
* Campos de entrada: <br>
* 1	N_E	3	Tipo de Documento<br>
* Campos de salida: <br>
* 1	N_10_2	12	Total de impuestos<br>
* 2	N_0_4	4	Tasa de IVA #1<br>
* 3	N_10_2	12	Monto de IVA x tasa #1<br>
* 4	N_10_2	12	Monto vendido x tasa #1<br>
* 5	N_10_2	12	Monto de impuestos internos fijos x tasa #1<br>
* 6	N_10_2	12	Monto de impuestos internos porcentuales x tasa #1<br>
* 7	N_0_4	4	Tasa de IVA #2<br>
* 8	N_10_2	12	Monto de IVA x tasa #2<br>
* 9	N_10_2	12	Monto vendido x tasa #2<br>
* 10	N_10_2	12	Monto de impuestos internos fijos x tasa #2<br>
* 11	N_10_2	12	Monto de impuestos internos porcentuales x tasa #2<br>
* 12	N_0_4	4	Tasa de IVA #3<br>
* 13	N_10_2	12	Monto de IVA x tasa #3<br>
* 14	N_10_2	12	Monto vendido x tasa #3<br>
* 15	N_10_2	12	Monto de impuestos internos fijos x tasa #3<br>
* 16	N_10_2	12	Monto de impuestos internos porcentuales x tasa #3<br>
* 17	N_0_4	4	Tasa de IVA #4<br>
* 18	N_10_2	12	Monto de IVA x tasa #4<br>
* 19	N_10_2	12	Monto vendido x tasa #4<br>
* 20	N_10_2	12	Monto de impuestos internos fijos x tasa #4<br>
* 21	N_10_2	12	Monto de impuestos internos porcentuales x tasa #4<br>
* 22	N_0_4	4	Tasa de IVA #5<br>
* 23	N_10_2	12	Monto de IVA x tasa #5<br>
* 24	N_10_2	12	Monto vendido x tasa #5<br>
* 24	N_10_2	12	Monto de impuestos internos fijos x tasa #5<br>
* 25	N_10_2	12	Monto de impuestos internos porcentuales x tasa #5<br>
* 27	N_0_4	4	Tasa de IVA #6<br>
* 28	N_10_2	12	Monto de IVA x tasa #6<br>
* 29	N_10_2	12	Monto vendido x tasa #6<br>
* 30	N_10_2	12	Monto de impuestos internos fijos x tasa #6<br>
* 31	N_10_2	12	Monto de impuestos internos porcentuales x tasa #6<br>
* 32	N_0_4	4	Tasa de IVA #7<br>
* 33	N_10_2	12	Monto de IVA x tasa #7<br>
* 34	N_10_2	12	Monto vendido x tasa #7<br>
* 35	N_10_2	12	Monto de impuestos internos fijos x tasa #7<br>
* 36	N_10_2	12	Monto de impuestos internos porcentuales x tasa #7<br>
* 
*/
public class JornadaFiscalInformacionElectronicaDeImpuestosDeLaJornadaFiscalEnCurso extends TipoComandoFiscal {

    public JornadaFiscalInformacionElectronicaDeImpuestosDeLaJornadaFiscalEnCurso() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalInformacionElectronicaDeImpuestosDeLaJornadaFiscalEnCurso"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene información electrónica de impuestos de la jornada fiscal en curso.";
    }

    @Override
    public int getCodigo() {
        return 0x080B;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x0B;
        return ret;
    }

    @Override
    public String getNotas() {
        return " La impresora fiscal devolverá 5 campos por cada tasa que haya sido utilizada durante la jornada\n"
                + "fiscal en el orden indicado del campo 2 al 6.\n"
                + " La codificación númerica del campo de entrada Tipo de Documento, es la siguiente:\n"
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
                + "953	DNFH Cambio de Inscripción en Ingresos Brutos\n"
                + "Solamente retornarán información los siguientes tipo de documentos:\n"
                + "81	Tique Factura A\n"
                + "82	Tique Factura B\n"
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
                + "120	Tique Nota de Débito M";
    }

    @Override
    public String getRequerimientos() {
        return "Jornada fiscal abierta.";
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
          new TipoCampoFiscal(this, 1, "Tipo de Documento", TipoDato.N_E, 3, false),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
          new TipoCampoFiscal(this, 1, "Total de impuestos", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 2, "Tasa de IVA #1", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 3, "Monto de IVA x tasa #1", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 4, "Monto vendido x tasa #1", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 5, "Monto de impuestos internos fijos x tasa #1", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 6, "Monto de impuestos internos porcentuales x tasa #1", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 7, "Tasa de IVA #2", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 8, "Monto de IVA x tasa #2", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 9, "Monto vendido x tasa #2", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 10, "Monto de impuestos internos fijos x tasa #2", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 11, "Monto de impuestos internos porcentuales x tasa #2", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 12, "Tasa de IVA #3", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 13, "Monto de IVA x tasa #3", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 14, "Monto vendido x tasa #3", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 15, "Monto de impuestos internos fijos x tasa #3", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 16, "Monto de impuestos internos porcentuales x tasa #3", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 17, "Tasa de IVA #4", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 18, "Monto de IVA x tasa #4", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 19, "Monto vendido x tasa #4", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 20, "Monto de impuestos internos fijos x tasa #4", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 21, "Monto de impuestos internos porcentuales x tasa #4", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 22, "Tasa de IVA #5", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 23, "Monto de IVA x tasa #5", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 24, "Monto vendido x tasa #5", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 24, "Monto de impuestos internos fijos x tasa #5", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 25, "Monto de impuestos internos porcentuales x tasa #5", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 27, "Tasa de IVA #6", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 28, "Monto de IVA x tasa #6", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 29, "Monto vendido x tasa #6", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 30, "Monto de impuestos internos fijos x tasa #6", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 31, "Monto de impuestos internos porcentuales x tasa #6", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 32, "Tasa de IVA #7", TipoDato.N_0_4, 4, false),
          new TipoCampoFiscal(this, 33, "Monto de IVA x tasa #7", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 34, "Monto vendido x tasa #7", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 35, "Monto de impuestos internos fijos x tasa #7", TipoDato.N_10_2, 12, false),
          new TipoCampoFiscal(this, 36, "Monto de impuestos internos porcentuales x tasa #7", TipoDato.N_10_2, 12, false),
        };
    }

}
