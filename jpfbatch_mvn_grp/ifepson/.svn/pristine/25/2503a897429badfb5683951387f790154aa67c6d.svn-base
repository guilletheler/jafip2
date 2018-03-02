package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionIniciarDescargaDeSolicitudDeBajaFiscal_SBF, <br>
* Iniciar Descarga de Solicitud de Baja Fiscal (SBF)<br>
* Notas: En modo fiscalizado la ejecución de este comando finaliza con el proceso de la baja fiscal.<br>
* Una vez finalizada la baja fiscal, el equipo pasa a modo entrenamiento.<br>
* En modo entrenamiento se podrá descargar el archivo de SBF, sin provocar nigún cambio al equipo.<br>
* En caso de nunca haberse hecho una baja fiscal, se devuelve error.<br>
* Requerimientos:  Período de actividades cerrado.<br>
*  Debe estar la Memoria de Transacciones descargada y borrada. (Ver los comandos: Borrado de<br>
* Jornadas de Memoria de Transacciones (09 10) e Información de Memoria de Transacciones (09 15))<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionIniciarDescargaDeSolicitudDeBajaFiscal_SBF extends TipoComandoFiscal {

    public InicializacionIniciarDescargaDeSolicitudDeBajaFiscal_SBF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionIniciarDescargaDeSolicitudDeBajaFiscal_SBF"};
    }

    @Override
    public String getDescripcion() {
        return "Iniciar Descarga de Solicitud de Baja Fiscal (SBF)";
    }

    @Override
    public int getCodigo() {
        return 0x0410;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x10;
        return ret;
    }

    @Override
    public String getNotas() {
        return "En modo fiscalizado la ejecución de este comando finaliza con el proceso de la baja fiscal.\n"
                + "Una vez finalizada la baja fiscal, el equipo pasa a modo entrenamiento.\n"
                + "En modo entrenamiento se podrá descargar el archivo de SBF, sin provocar nigún cambio al equipo.\n"
                + "En caso de nunca haberse hecho una baja fiscal, se devuelve error.";
    }

    @Override
    public String getRequerimientos() {
        return " Período de actividades cerrado.\n"
                + " Debe estar la Memoria de Transacciones descargada y borrada. (Ver los comandos: Borrado de\n"
                + "Jornadas de Memoria de Transacciones (09 10) e Información de Memoria de Transacciones (09 15))";
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
