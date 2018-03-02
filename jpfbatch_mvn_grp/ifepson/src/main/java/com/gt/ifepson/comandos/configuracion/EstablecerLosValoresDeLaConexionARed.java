package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: EstablecerLosValoresDeLaConexionARed, SetNetwork, <br>
* Establecer los Valores de la Conexión a Red<br>
* Notas: En el caso de no utilizar DHCP (bit 0 de la extensión) los campos de entrada del 1 al 3 serán obligatorios.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* 1	P	19	Direccion IP (OPCIONAL)<br>
* 2	P	19	Mascara de red (OPCIONAL)<br>
* 1	P	19	Puerta de enlace (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class EstablecerLosValoresDeLaConexionARed extends TipoComandoFiscal {

    public EstablecerLosValoresDeLaConexionARed() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"EstablecerLosValoresDeLaConexionARed", "SetNetwork"};
    }

    @Override
    public String getDescripcion() {
        return "Establecer los Valores de la Conexión a Red";
    }

    @Override
    public int getCodigo() {
        return 0x05C1;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0xC1;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "USO_DHCP",
            "SIN_DHCP", 0b0000000000000000,
            "CON_DHCP", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "En el caso de no utilizar DHCP (bit 0 de la extensión) los campos de entrada del 1 al 3 serán obligatorios.";
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
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Direccion IP", TipoDato.P, 19, true),
            new TipoCampoFiscal(this, 2, "Mascara de red", TipoDato.P, 19, true),
            new TipoCampoFiscal(this, 1, "Puerta de enlace", TipoDato.P, 19, true)};
    }

}
