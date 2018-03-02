package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionComenzarDescargaDeSolicitudDeAltaFiscal_SAF, <br>
* Comienza el proceso de descarga del archivo de Solicitud de Alta Fiscal.<br>
* Notas: En caso de ejecutarse exitosamente, se entra en subestado de descarga SAF.<br>
* Requerimientos: Certificados digitales instalados y válidos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionComenzarDescargaDeSolicitudDeAltaFiscal_SAF extends TipoComandoFiscal {

    public InicializacionComenzarDescargaDeSolicitudDeAltaFiscal_SAF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionComenzarDescargaDeSolicitudDeAltaFiscal_SAF"};
    }

    @Override
    public String getDescripcion() {
        return "Comienza el proceso de descarga del archivo de Solicitud de Alta Fiscal.";
    }

    @Override
    public int getCodigo() {
        return 0x0440;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x40;
        return ret;
    }

    @Override
    public String getNotas() {
        return "En caso de ejecutarse exitosamente, se entra en subestado de descarga SAF.";
    }

    @Override
    public String getRequerimientos() {
        return "Certificados digitales instalados y válidos";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
