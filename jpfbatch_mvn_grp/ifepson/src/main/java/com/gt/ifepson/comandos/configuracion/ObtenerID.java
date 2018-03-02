package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerID, ConsultarID, <br>
* Obtener ID<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	P	-1	Nombre del mecanismo impresor	<br>
* 2	A	16	Número de serie<br>
* 3	L	-1	Nombre de la versión<br>
* 4	P	5	Versión de firmware<br>
* 5	N_E	5	Punto de venta<br>
* 6	N_E	3	Ancho de la impresora en columnas a 10cpi para Factura<br>
* 7	N_E	3	Ancho de la impresora en columnas a 12cpi para Factura<br>
* 8	N_E	3	Ancho de la impresora en columnas a 17cpi para Factura<br>
* 9	N_E	3	Ancho en columnas para Tique, Tique-Factura, Tique - Nota de Crédito<br>
* 10	N_E	3	Cantidad de líneas de validación<br>
* 11	Y	1	Impresora fiscal soporta Tique<br>
* 12	Y	1	Impresora fiscal soporta Tique - Factura<br>
* 13	Y	1	Impresora fiscal soporta Factura<br>
* 14	N_E	1	Cantidad de dígitos decimales para los centavos en Reporte Z o en el subtotal<br>
* 15	N_E	1	Estación de impresora seleccionada. 0 – Rollo, 1 – Slip, 2 – Validación<br>
* 
*/
public class ObtenerID extends TipoComandoFiscal {

    public ObtenerID() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerID", "ConsultarID"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener ID";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Nombre del mecanismo impresor	", TipoDato.P, -1, false),
            new TipoCampoFiscal(this, 2, "Número de serie", TipoDato.A, 16, false),
            new TipoCampoFiscal(this, 3, "Nombre de la versión", TipoDato.L, -1, false),
            new TipoCampoFiscal(this, 4, "Versión de firmware", TipoDato.P, 5, false),
            new TipoCampoFiscal(this, 5, "Punto de venta", TipoDato.N_E, 5, false),
            new TipoCampoFiscal(this, 6, "Ancho de la impresora en columnas a 10cpi para Factura", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 7, "Ancho de la impresora en columnas a 12cpi para Factura", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 8, "Ancho de la impresora en columnas a 17cpi para Factura", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 9, "Ancho en columnas para Tique, Tique-Factura, Tique - Nota de Crédito", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 10, "Cantidad de líneas de validación", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 11, "Impresora fiscal soporta Tique", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 12, "Impresora fiscal soporta Tique - Factura", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 13, "Impresora fiscal soporta Factura", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 14, "Cantidad de dígitos decimales para los centavos en Reporte Z o en el subtotal", TipoDato.N_E, 1, false),
            new TipoCampoFiscal(this, 15, "Estación de impresora seleccionada. 0 – Rollo, 1 – Slip, 2 – Validación", TipoDato.N_E, 1, false)};
    }

    @Override
    public int getCodigo() {
        return 0x0005;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.SISTEMA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x00;
        ret[1] = 0x05;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
}
