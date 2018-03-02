package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerDatosDeFiscalizacion, getDatosDeFiscalizacion, getFiscalData, <br>
* Obtener datos de Fiscalización<br>
* Notas:  Obtiene los datos de fiscalización que se encuentran configurados en el equipo. Es posible obtener una salida impresa.<br>
* En caso que la impresora no posea ningún dato de fiscalización, la fecha se retorna como campo vacío y los datos del usuario no configurados con valores por defecto.<br>
*  El reporte de datos de fiscalización solamente puede ser impreso en caso que no exista ningún otro documento en progreso.<br>
*  Los valores posibles para el campo de entrada “Tipo de Tique-Factura A” son:<br>
* - ‘0’ - Normal.<br>
* - ‘1’ - Comprobantes A con leyenda.<br>
* - ‘2’ - Comprobantes M.<br>
* - Vacío si la responsabilidad ante el IVA es distinta a “I”.<br>
* Requerimientos: Mecanismo impresor en linea y con papel (en caso de impresión del documento).<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	P	30	Razón Saocial<br>
* 2	N_E	11	Número de CUIT<br>
* 3	N_E	5	Númerod de caja<br>
* 4	L	1	Responsabilidad ante el IVA<br>
* 5	N_E	1	Tipo de Tique-Factura A<br>
* 6	N_2_2	4	Tasa de IVA estándar<br>
* 7	D	6	Fecha de fiscalización<br>
* 
*/
public class ObtenerDatosDeFiscalizacion extends TipoComandoFiscal {

    public ObtenerDatosDeFiscalizacion() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerDatosDeFiscalizacion", "getDatosDeFiscalizacion", "getFiscalData"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener datos de Fiscalización";
    }

    @Override
    public int getCodigo() {
        return 0x0507;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x07;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIMIR",
            "NO_IMPRIME_REPORTE", 0b0000000000000000,
            "IMPRIME_REPORTE", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return " Obtiene los datos de fiscalización que se encuentran configurados en el equipo. Es posible obtener una salida impresa.\n"
                + "En caso que la impresora no posea ningún dato de fiscalización, la fecha se retorna como campo vacío y los datos del usuario no configurados con valores por defecto.\n"
                + " El reporte de datos de fiscalización solamente puede ser impreso en caso que no exista ningún otro documento en progreso.\n"
                + " Los valores posibles para el campo de entrada “Tipo de Tique-Factura A” son:\n"
                + "- ‘0’ - Normal.\n"
                + "- ‘1’ - Comprobantes A con leyenda.\n"
                + "- ‘2’ - Comprobantes M.\n"
                + "- Vacío si la responsabilidad ante el IVA es distinta a “I”.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en linea y con papel (en caso de impresión del documento).";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Razón Saocial", TipoDato.P, 30, false),
            new TipoCampoFiscal(this, 2, "Número de CUIT", TipoDato.N_E, 11, false),
            new TipoCampoFiscal(this, 3, "Númerod de caja", TipoDato.N_E, 5, false),
            new TipoCampoFiscal(this, 4, "Responsabilidad ante el IVA", TipoDato.L, 1, false),
            new TipoCampoFiscal(this, 5, "Tipo de Tique-Factura A", TipoDato.N_E, 1, false),
            new TipoCampoFiscal(this, 6, "Tasa de IVA estándar", TipoDato.N_2_2, 4, false),
            new TipoCampoFiscal(this, 7, "Fecha de fiscalización", TipoDato.D, 6, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
