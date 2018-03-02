package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: AbrirNotaCreditoABCM, <br>
* Realiza la apertura de un documento tique-nota de crédito A/B/C/M.<br>
* Notas:  Imprime el logo configurado por el usuario 56<br>
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
* Requerimientos:  Memoria fiscal no llena.<br>
*  Memoria de Transacciones no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
*  Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean<br>
* obligatorios.<br>
*  No se aceptan códigos de barra en las líneas de texto.<br>
*  El formato de la línea de documento asociado y la línea de comprobante de origen es la siguiente:<br>
* “ddd-ppppp-nnnnnnnn”<br>
* Siendo<br>
*  ddd: el tipo de documento. (ejemplo: “081”)<br>
* ppppp: número de caja. (ejemplo: “00001”)<br>
* nnnnnnnn: el número de documento. (ejemplo: “00000027”)<br>
* Campos de entrada: <br>
* 1	RT	-1	Nombre del comprador, linea #1 (Se verifica que haya al menos un carácter ASCII imprimible.)<br>
* 2	RT	-1	Nombre del comprador, linea #2 (OPCIONAL)<br>
* 3	RT	-1	Domicilio del comprador, linea #1 (Se verifica que haya al menos un carácter ASCII imprimible.)<br>
* 4	RT	-1	Domicilio del comprador, linea #2 (OPCIONAL)<br>
* 5	RT	-1	Domicilio del comprador, linea #3 (OPCIONAL)<br>
* 6	L	1	Tipo de documento del comprador (Si el comprador no es Consumidor Final, el tipo de documento debe ser CUIT.)<br>
* 7	A	20	Número de documento del comprador (Sólo en caso de pasaporte se aceptan caracteres alfabéticos. Si “Tipo de Documento del Comprador” es CUIT o CUIL, este campo debe tener un número válido según algoritmo.)<br>
* 8	L	1	Responsabilidad ante el IVA del comprador<br>
* 9	RT	-1	Línea de documento asociado #1 (OPCIONAL)<br>
* 10	RT	-1	Línea de documento asociado #2 (OPCIONAL)<br>
* 11	RT	-1	Línea de documento asociado #3 (OPCIONAL)<br>
* 12	RT	-1	Línea de comprobante de origen (Debe cumplir con el formato requerido.)<br>
* Campos de salida: <br>
* 
*/
public class AbrirNotaCreditoABCM extends TipoComandoFiscal {

    public AbrirNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"AbrirNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza la apertura de un documento tique-nota de crédito A/B/C/M.";
    }

    @Override
    public String getNotas() {
        return " Imprime el logo configurado por el usuario 56\n"
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
                + "E = Libreta de Enrolamiento";
    }

    @Override
    public String getRequerimientos() {
        return " Memoria fiscal no llena.\n"
                + " Memoria de Transacciones no llena.\n"
                + " Mecanismo impresor en línea y con papel.\n"
                + " Se deben haber configurado previamente los datos de fiscalización y del establecimiento que sean\n"
                + "obligatorios.\n"
                + " No se aceptan códigos de barra en las líneas de texto.\n"
                + " El formato de la línea de documento asociado y la línea de comprobante de origen es la siguiente:\n"
                + "“ddd-ppppp-nnnnnnnn”\n"
                + "Siendo\n"
                + " ddd: el tipo de documento. (ejemplo: “081”)\n"
                + "ppppp: número de caja. (ejemplo: “00001”)\n"
                + "nnnnnnnn: el número de documento. (ejemplo: “00000027”)";
    }

    @Override
    public int getCodigo() {
        return 0x0D01;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x01;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "Impresion",
            "IMPRESION_DE_ORIGINAL", 0X0000000000000000,
            "IMPRESION_DE_ORIGINAL_Y_TRIPLICADO", 0X0000000000000001)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Nombre del comprador, linea #1 (Se verifica que haya al menos un carácter ASCII imprimible.)", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 2, "Nombre del comprador, linea #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 3, "Domicilio del comprador, linea #1 (Se verifica que haya al menos un carácter ASCII imprimible.)", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 4, "Domicilio del comprador, linea #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 5, "Domicilio del comprador, linea #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 6, "Tipo de documento del comprador (Si el comprador no es Consumidor Final, el tipo de documento debe ser CUIT.)", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 7, "Número de documento del comprador (Sólo en caso de pasaporte se aceptan caracteres alfabéticos. Si “Tipo de Documento del Comprador” es CUIT o CUIL, este campo debe tener un número válido según algoritmo.)", TipoDato.A, 20, false),
            new TipoCampoFiscal(this, 8, "Responsabilidad ante el IVA del comprador", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 9, "Línea de documento asociado #1", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 10, "Línea de documento asociado #2", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 11, "Línea de documento asociado #3", TipoDato.RT, -1, true),
            new TipoCampoFiscal(this, 12, "Línea de comprobante de origen (Debe cumplir con el formato requerido.)", TipoDato.RT, -1, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
