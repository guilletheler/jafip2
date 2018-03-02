package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerDensidadDeImpresion, <br>
* Obtener Densidad de Impresión<br>
* Notas:  El valor retornado en el campo de salida corresponde a la siguiente tabla:<br>
* 1. 120 %<br>
* 2. 115 %<br>
* 3. 110 %<br>
* 4. 105 %<br>
* 5. 100 % ( Valor por defecto )<br>
* 6.  95 %<br>
* 7.  90 %<br>
* 8.  85 %<br>
* 9.  80 %<br>
* 10. 75 %<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	2	Densidad de impresión<br>
* 
*/
public class ObtenerDensidadDeImpresion extends TipoComandoFiscal {

    public ObtenerDensidadDeImpresion() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerDensidadDeImpresion"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Densidad de Impresión";
    }

    @Override
    public int getCodigo() {
        return 0x0778;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x78;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
    
    @Override
    public String getNotas() {
        return " El valor retornado en el campo de salida corresponde a la siguiente tabla:\n"
                + "1. 120 %\n"
                + "2. 115 %\n"
                + "3. 110 %\n"
                + "4. 105 %\n"
                + "5. 100 % ( Valor por defecto )\n"
                + "6.  95 %\n"
                + "7.  90 %\n"
                + "8.  85 %\n"
                + "9.  80 %\n"
                + "10. 75 %";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Densidad de impresión", TipoDato.N_E, 2, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
