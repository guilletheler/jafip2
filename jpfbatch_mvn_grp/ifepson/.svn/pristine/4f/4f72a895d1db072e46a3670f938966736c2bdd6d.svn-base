package com.gt.ifepson.comandos.controlImpresor;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarDensidadDeImpresion, setDensidadImpresion, <br>
* Configurar Densidad de Impresión<br>
* Notas: No ejecute este comando en forma reiterada ya que podría dañar el módulo impresor<br>
* El valor de densidad de impresión deseada debe corresponder a la siguiente tabla:<br>
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
* 1	N_E	2	Valor de densidad de impresión<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarDensidadDeImpresion extends TipoComandoFiscal {

    public ConfigurarDensidadDeImpresion() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarDensidadDeImpresion", "setDensidadImpresion"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Densidad de Impresión";
    }

    @Override
    public int getCodigo() {
        return 0x0777;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONTROL_IMPRESORA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x07;
        ret[1] = 0x77;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }
    
    @Override
    public String getNotas() {
        return "No ejecute este comando en forma reiterada ya que podría dañar el módulo impresor\n"
                + "El valor de densidad de impresión deseada debe corresponder a la siguiente tabla:\n"
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
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Valor de densidad de impresión", TipoDato.N_E, 2, false)};
    }

}
