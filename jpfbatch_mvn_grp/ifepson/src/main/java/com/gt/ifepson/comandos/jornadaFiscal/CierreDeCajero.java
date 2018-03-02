package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: CierreDeCajero, CierreX, <br>
* Realiza el cierre de cajero (cambio de turno). Imprimiendo la información parcial desde el último cierre<br>
* de cajero o desde el inicio de la jornada fiscal.<br>
* Notas: A fin de incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).<br>
* Requerimientos: Memoria fiscal no llena.<br>
*  Mecanismo impresor en línea y con papel.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	5	Número de Salida de Cajero<br>
* 
*/
public class CierreDeCajero extends TipoComandoFiscal {

    public CierreDeCajero() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"CierreDeCajero", "CierreX"};
    }

    @Override
    public String getDescripcion() {
        return "Realiza el cierre de cajero (cambio de turno). Imprimiendo la información parcial desde el último cierre\n"
                + "de cajero o desde el inicio de la jornada fiscal.";
    }

    @Override
    public int getCodigo() {
        return 0x0802;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x02;
        return ret;
    }

    @Override
    public String getNotas() {
        return "A fin de incluir el arqueo de pagos ver el comando Impresión de Arqueo de Pagos (05 52).";
    }

    @Override
    public String getRequerimientos() {
        return "Memoria fiscal no llena.\n"
                + " Mecanismo impresor en línea y con papel.";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIME_RECORTE",
            "NO_IMPRIME_RECORTE", 0b0000000000000000,
            "IMPRIME_RECORTE", 0b0000000000000001),
            new TipoExtension(0b0000000000100000, "IMPRIME_OTROS_TRIBUTOS_DISCRIMINADOS",
            "NO_IMPRIME_OTROS_TRIBUTOS_DISCRIMINADOS", 0b0000000000000000,
            "IMPRIME_OTROS_TRIBUTOS_DISCRIMINADOS", 0b0000000000100000),
            new TipoExtension(0b0000010000000000, "IMPRIME_ENCABEZADOS_Y_COLAS",
            "NO_IMPRIME_ENCABEZADOS_Y_COLAS", 0b0000000000000000,
            "IMPRIME_ENCABEZADOS_Y_COLAS", 0b0000000000100000),
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
          new TipoCampoFiscal(this, 1, "Número de Salida de Cajero", TipoDato.N_E, 5, false),
        };
    }

}
