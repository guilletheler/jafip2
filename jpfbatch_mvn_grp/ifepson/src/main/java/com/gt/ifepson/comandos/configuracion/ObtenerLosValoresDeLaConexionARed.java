package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerLosValoresDeLaConexionARed, <br>
* Obtener los Valores de la Conexión a Red<br>
* Notas: <br>
* Requerimientos: Debe estar fisicamente establecidad la conexión a la red.<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	Y	1	Uso de DHCP<br>
* 2	P	19	Dirección IP<br>
* 3	P	19	Máscara de red<br>
* 4	P	19	Puerta de enlace (gateway)<br>
* 5	P	19	Dirección MAC<br>
* 
*/
public class ObtenerLosValoresDeLaConexionARed extends TipoComandoFiscal {

    public ObtenerLosValoresDeLaConexionARed() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerLosValoresDeLaConexionARed"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener los Valores de la Conexión a Red";
    }

    @Override
    public int getCodigo() {
        return 0x05C2;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0xC2;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "Debe estar fisicamente establecidad la conexión a la red.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Uso de DHCP", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 2, "Dirección IP", TipoDato.P, 19, false),
            new TipoCampoFiscal(this, 3, "Máscara de red", TipoDato.P, 19, false),
            new TipoCampoFiscal(this, 4, "Puerta de enlace (gateway)", TipoDato.P, 19, false),
            new TipoCampoFiscal(this, 5, "Dirección MAC", TipoDato.P, 19, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
