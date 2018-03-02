package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDeClavesDeFirmaDigital, <br>
* Obtener configuración de Claves de Firma Digital<br>
* Notas:  Si la jornada fiscal se encuentra abierta no se realizará la impresión del documento.<br>
*  Los valores de salida 1 deben interpretarse de acuerdo a los siguientes valores: 0 = RSA<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	1	Tipo de algoritmo<br>
* 2	B	-1	Datos de clave pública<br>
* 3	D	6	Fecha de generación<br>
* 4	T	6	Hora de generación<br>
* 
*/
public class ObtenerConfiguracionDeClavesDeFirmaDigital extends TipoComandoFiscal {

    public ObtenerConfiguracionDeClavesDeFirmaDigital() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDeClavesDeFirmaDigital"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener configuración de Claves de Firma Digital";
    }

    @Override
    public int getCodigo() {
        return 0x0522;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x22;
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
        return " Si la jornada fiscal se encuentra abierta no se realizará la impresión del documento.\n"
                + " Los valores de salida 1 deben interpretarse de acuerdo a los siguientes valores: 0 = RSA";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Tipo de algoritmo", TipoDato.N_E, 1, false),
            new TipoCampoFiscal(this, 2, "Datos de clave pública", TipoDato.B, -1, false),
            new TipoCampoFiscal(this, 3, "Fecha de generación", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 4, "Hora de generación", TipoDato.T, 6, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
