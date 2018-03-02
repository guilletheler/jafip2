package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: AbrirTiqueFactNDABCM, <br>
* Realiza la apertura de un documento tique-factura o nota de débito A/B/C/M.<br>
* Notas:  Imprime el logo configurado por el usuario 46<br>
*  Para que una línea no sea impresa se debe enviar el campo texto vacío.<br>
*  Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).<br>
*  Los atributos de impresión serán ignorados, para todas las líneas de texto<br>
*  En las líneas de nombre y domicilio se aceptarán las siguientes combinaciones de la palabra “Total”:<br>
* “TOTAL”, “total”, “Total”, pero al momento de ser impresas, siempre se imprimirán como “Total”.<br>
*  Se incrementa en uno el contador de documento correspondiente.<br>
*  Los valores posibles del campo de entrada #6 son:<br>
* D = DNI<br>
* L = CUIL<br>
* T = CUIT<br>
* C = Cédula de Identidad<br>
* P = Pasaporte<br>
* V = Libreta Cívica<br>
* E = Libreta de Enrolamiento<br>
*  Los valores posibles del campo de entrada #8 son:<br>
* I = Responsable Inscripto<br>
* N = No Responsable<br>
* M = Monotributista<br>
* E = Exento<br>
* U = No Categorizado<br>
* F = Consumidor Final<br>
* T = Monotributista Social<br>
* P = Monotributo Trabajador Independiente Promovido<br>
* Requerimientos:  Memoria fiscal no llena.<br>
*  Memoria de transacciones no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
*  Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean<br>
* obligatorios.<br>
*  No se aceptan códigos de barra en las líneas de texto.<br>
*  El formato de la línea de documento asociado es la siguiente: “ddd-ppppp-nnnnnnnn”<br>
* Siendo: <br>
*      ddd: el tipo de documento. (ejemplo: “081”)<br>
*    ppppp: número de caja. (ejemplo: “00001”)<br>
* nnnnnnnn: el número de documento. (ejemplo: “00000027”)<br>
* Campos de entrada: <br>
* 1	RT	-1	Nombre del comprador, linea #1 ( Opcional solo si Responsabilidad del comprador es Consumidor Final. Se verifica que haya al menos un carácter ASCII imprimible)<br>
* 2	RT	-1	Nombre del comprador, linea #2 (OPCIONAL)<br>
* 3	RT	-1	Domicilio del comprador, linea #1 ( Opcional solo si Responsabilidad del comprador es Consumidor Final. Se verifica que haya al menos un carácter ASCII imprimible)<br>
* 4	RT	-1	Domicilio del comprador, linea #2 (OPCIONAL)<br>
* 5	RT	-1	Domicilio del comprador, linea #3 (OPCIONAL)<br>
* 6	L	1	Tipo de documento del comprador (Opcional solo si Responsabilidad del comprador es Consumidor Final. En caso de ser opcional, si no se envía tipo de documento, el<br>
* número de documento es ignorado. Si el comprador no es Consumidor Final, el tipo de documento debe ser CUIT.)<br>
* 7	A	20	Número de documento del comprador (44 Opcional solo si Responsabilidad del Comprador es Consumidor Final y Tipo de Documento es distinto de CUIL / CUIT. Sólo en caso de<br>
* pasaporte se aceptan caracteres alfabéticos. Si “Tipo de Documento del Comprador” es CUIT o CUIL, este campo debe tener un número<br>
* válido según algoritmo. Obligatoria en caso de solicitarse comprobante B para turista)<br>
* 8	L	1	Responsabilidad ante el IVA del comprador<br>
* 9	RT	-1	Línea de documento asociado (Remito) #1 (OPCIONAL)<br>
* 10	RT	-1	Línea de documento asociado (Remito) #2 (OPCIONAL)<br>
* 11	RT	-1	Línea de documento asociado (Remito) #3 (OPCIONAL)<br>
* 12	RT	-1	Línea de Cheque de Reintegro para Turista (álido según algoritmo. Obligatoria en caso de solicitarse comprobante B para turista<br>
*  La impresión del logo depende de las preferencias configuradas para el)<br>
* Campos de salida: <br>
* 
*/
public class AbrirTiqueFactNDABCM extends TipoComandoFiscal {

    public AbrirTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la apertura de un documento tique-factura o nota de débito A/B/C/M.";
    }

    @Override
    public int getCodigo() {
        return 0x0B01;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Imprime el logo configurado por el usuario 46\n"
                + " Para que una línea no sea impresa se debe enviar el campo texto vacío.\n"
                + " Para que la impresión resulte en una línea en blanco se debe enviar el caracter espacio ASCII(32).\n"
                + " Los atributos de impresión serán ignorados, para todas las líneas de texto\n"
                + " En las líneas de nombre y domicilio se aceptarán las siguientes combinaciones de la palabra “Total”:\n"
                + "“TOTAL”, “total”, “Total”, pero al momento de ser impresas, siempre se imprimirán como “Total”.\n"
                + " Se incrementa en uno el contador de documento correspondiente.\n"
                + " Los valores posibles del campo de entrada #6 son:\n"
                + "D = DNI\n"
                + "L = CUIL\n"
                + "T = CUIT\n"
                + "C = Cédula de Identidad\n"
                + "P = Pasaporte\n"
                + "V = Libreta Cívica\n"
                + "E = Libreta de Enrolamiento\n"
                + " Los valores posibles del campo de entrada #8 son:\n"
                + "I = Responsable Inscripto\n"
                + "N = No Responsable\n"
                + "M = Monotributista\n"
                + "E = Exento\n"
                + "U = No Categorizado\n"
                + "F = Consumidor Final\n"
                + "T = Monotributista Social\n"
                + "P = Monotributo Trabajador Independiente Promovido";
    }

    @Override
    public String getRequerimientos() {
        return " Memoria fiscal no llena.\n"
                + " Memoria de transacciones no llena.\n"
                + " Mecanismo impresor en línea y con papel.\n"
                + " Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean\n"
                + "obligatorios.\n"
                + " No se aceptan códigos de barra en las líneas de texto.\n"
                + " El formato de la línea de documento asociado es la siguiente: “ddd-ppppp-nnnnnnnn”\n"
                + "Siendo: \n"
                + "     ddd: el tipo de documento. (ejemplo: “081”)\n"
                + "   ppppp: número de caja. (ejemplo: “00001”)\n"
                + "nnnnnnnn: el número de documento. (ejemplo: “00000027”)";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000010, "IMPRESION_ORIGINAL_Y_TRIPLICADO",
            "IMPRESION_ORIGINAL", 0b0000000000000000,
            "IMPRESION_ORIGINAL_Y_TRIPLICADO", 0b0000000000000010),
            new TipoExtension(0b0000000010000000, "ATRIBUTOS_IMPRESION (DNFH de farmacia, talón de envío a domicilio, talón de cambio).",
            "NO_ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000000000000,
            "ALMACENA_DESCRIPCIONES_ITEMS", 0b0000000010000000),
            new TipoExtension(0b0000000100000000, "CONSERVA_ATRIBUTOS_IMPRESION",
            "NO_CONSERVA_ATRIBUTOS_IMPRESION_DE_LAS_DESCRIPCIONES", 0b0000000000000000,
            "CONSERVA_ATRIBUTOS_IMPRESION_DE_LAS_DESCRIPCIONES", 0b0000000100000000),
            new TipoExtension(0b0000001000000000, "ALAMCENA_DESCRIPCIONES_EXTERNAS",
            "ALAMCENA_DESCRIPCIONES_EXTERNAS", 0b0000000000000000,
            "ALAMCENA_SOLO_PRIMER_DESCRIPCION_EXTRA", 0b0000001000000000),
            new TipoExtension(0b0001000000000000, "USA_LINEA_CHEQUE_REINTEGRO_PARA_TURISTA",
            "NO_USA_LINEA_CHEQUE_REINTEGRO_PARA_TURISTA", 0b0000000000000000,
            "USA_LINEA_CHEQUE_REINTEGRO_PARA_TURISTA", 0b0001000000000000),
            new TipoExtension(0b0010000000000000, "TIQUE_FACTURA_O_NOTA_DEBITO",
            "TIQUE_FACTURA", 0b0000000000000000,
            "TIQUE_NOTA_DEBITO", 0b0010000000000000),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Nombre del comprador, linea #1 ( Opcional solo si Responsabilidad del comprador es Consumidor Final. Se verifica que haya al menos un carácter ASCII imprimible)", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Nombre del comprador, linea #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Domicilio del comprador, linea #1 ( Opcional solo si Responsabilidad del comprador es Consumidor Final. Se verifica que haya al menos un carácter ASCII imprimible)", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 4, "Domicilio del comprador, linea #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Domicilio del comprador, linea #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 6, "Tipo de documento del comprador (Opcional solo si Responsabilidad del comprador es Consumidor Final. En caso de ser opcional, si no se envía tipo de documento, el\n"
            + "número de documento es ignorado. Si el comprador no es Consumidor Final, el tipo de documento debe ser CUIT.)", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 7, "Número de documento del comprador (44 Opcional solo si Responsabilidad del Comprador es Consumidor Final y Tipo de Documento es distinto de CUIL / CUIT. Sólo en caso de\n"
            + "pasaporte se aceptan caracteres alfabéticos. Si “Tipo de Documento del Comprador” es CUIT o CUIL, este campo debe tener un número\n"
            + "válido según algoritmo. Obligatoria en caso de solicitarse comprobante B para turista)", TipoDato.A, 20, false),
            new TipoCampoFiscal(this, 8, "Responsabilidad ante el IVA del comprador", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 9, "Línea de documento asociado (Remito) #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 10, "Línea de documento asociado (Remito) #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 11, "Línea de documento asociado (Remito) #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 12, "Línea de Cheque de Reintegro para Turista (álido según algoritmo. Obligatoria en caso de solicitarse comprobante B para turista\n"
            + " La impresión del logo depende de las preferencias configuradas para el)", TipoDato.RT, -1, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
