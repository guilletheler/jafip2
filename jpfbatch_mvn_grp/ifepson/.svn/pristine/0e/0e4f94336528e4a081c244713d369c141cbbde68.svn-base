package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalInformeTotalDeVentas, <br>
*  A fin incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).<br>
* Notas:  A fin incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).<br>
* Requerimientos:  Jornada fiscal abierta.<br>
*  Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	5	Número de Informe Total de Ventas<br>
* 
*/
public class JornadaFiscalInformeTotalDeVentas extends TipoComandoFiscal {

    public JornadaFiscalInformeTotalDeVentas() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalInformeTotalDeVentas"};
    }

    @Override
    public String getDescripcion() {
        return " A fin incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).";
    }

    @Override
    public int getCodigo() {
        return 0x0803;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x03;
        return ret;
    }

    @Override
    public String getNotas() {
        return " A fin incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).";
    }

    @Override
    public String getRequerimientos() {
        return " Jornada fiscal abierta.\n"
                + " Mecanismo impresor en línea y con papel.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000100000, "IMPRIME_OTROS_TRIBUTOS_DESCRIMINADOS",
            "NO_IMPRIME_OTROS_TRIBUTOS_DESCRIMINADOS", 0b0000000000000000,
            "IMPRIME_OTROS_TRIBUTOS_DESCRIMINADOS", 0b0000000000100000),
            new TipoExtension(0b0000010000000000, "IMPRIME_ENCABEZADOS_Y_COLAS",
            "NO_IMPRIME_ENCABEZADOS_Y_COLAS", 0b0000000000000000,
            "IMPRIME_ENCABEZADOS_Y_COLAS", 0b0000010000000000),
            new TipoExtension(0b0000100000000000, "IMPRIME_LINEAS_DE_ESTABLECIMIENTO",
            "NO_IMPRIME_LINEAS_DE_ESTABLECIMIENTO", 0b0000000000000000,
            "IMPRIME_LINEAS_DE_ESTABLECIMIENTO", 0b0000100000000000),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de Informe Total de Ventas", TipoDato.N_E, 5, false)
        };
    }

}
