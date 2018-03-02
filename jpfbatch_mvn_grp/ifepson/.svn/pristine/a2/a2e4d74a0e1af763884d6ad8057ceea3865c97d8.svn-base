package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalInformacionDeContadores_seRefiereALosAcumuladoresInternosDeLaImpresoraFiscal, <br>
* Informa los acumuladores del impresor fiscal.<br>
* Notas:  Los campos de salida número seis (6) y siete (7) no se recuperarán, ante una recuperación del<br>
* equipo, desde los datos guardados en la memoria fiscal.<br>
* Requerimientos:  La codificación númerica del campo de entrada Tipo de Documento, es la siguiente:<br>
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
* 953	DNFH Cambio de Inscripción en Ingeresos Brutos<br>
* Campos de entrada: <br>
* 1	N_E	3	Tipo de Documento<br>
* Campos de salida: <br>
* 1	N_E	5	Número último Cierre Z realizado<br>
* 2	N_E	10	Número último intervención realizada<br>
* 3	N_E	10	Número último cambio del RTC realizado<br>
* 4	N_E	10	Número último del informe de auditoría (COD904)<br>
* 5	N_E	10	Número último del tipo de documento solicitado<br>
* 6	N_E	10	Número último del tipo de documento solicitado completado<br>
* 7	N_E	10	Cantidad de doc. cancelados, para el tipo de doc. solicitado<br>
* 
*/
public class JornadaFiscalInformacionDeContadores_seRefiereALosAcumuladoresInternosDeLaImpresoraFiscal extends TipoComandoFiscal {

    public JornadaFiscalInformacionDeContadores_seRefiereALosAcumuladoresInternosDeLaImpresoraFiscal() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalInformacionDeContadores_seRefiereALosAcumuladoresInternosDeLaImpresoraFiscal"};
    }

    @Override
    public String getDescripcion() {
        return "Informa los acumuladores del impresor fiscal.";
    }

    @Override
    public int getCodigo() {
        return 0x0830;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x30;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Los campos de salida número seis (6) y siete (7) no se recuperarán, ante una recuperación del\n"
                + "equipo, desde los datos guardados en la memoria fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return " La codificación númerica del campo de entrada Tipo de Documento, es la siguiente:\n"
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
                + "953	DNFH Cambio de Inscripción en Ingeresos Brutos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Tipo de Documento", TipoDato.N_E, 3, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número último Cierre Z realizado", TipoDato.N_E, 5, false),
            new TipoCampoFiscal(this, 2, "Número último intervención realizada", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 3, "Número último cambio del RTC realizado", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 4, "Número último del informe de auditoría (COD904)", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 5, "Número último del tipo de documento solicitado", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 6, "Número último del tipo de documento solicitado completado", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 7, "Cantidad de doc. cancelados, para el tipo de doc. solicitado", TipoDato.N_E, 10, false),
        };
    }
}
