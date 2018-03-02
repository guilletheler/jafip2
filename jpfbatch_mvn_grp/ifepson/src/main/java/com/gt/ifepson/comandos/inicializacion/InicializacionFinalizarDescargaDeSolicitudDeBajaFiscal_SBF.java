package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: InicializacionFinalizarDescargaDeSolicitudDeBajaFiscal_SBF, <br>
* Finaliza la descarga del archivo de SBF y deja el equipo en modo entrenamiento. La baja se hará efectiva<br>
* una vez que se apague y se vuelva a encender la impresora.<br>
* Notas:  Al finalizar el proceso correctamente el LED parpadeará rápidamente en verde y se imprimirá un<br>
* aviso. Se debe reiniciar el equipo para finalizar la baja fiscal.<br>
* Requerimientos:  Haber finalizado la descarga SBF mediante llamadas al comando ’04 11’<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class InicializacionFinalizarDescargaDeSolicitudDeBajaFiscal_SBF extends TipoComandoFiscal {

    public InicializacionFinalizarDescargaDeSolicitudDeBajaFiscal_SBF() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionFinalizarDescargaDeSolicitudDeBajaFiscal_SBF"};
    }

    @Override
    public String getDescripcion() {
        return "Finaliza la descarga del archivo de SBF y deja el equipo en modo entrenamiento. La baja se hará efectiva\n"
                + "una vez que se apague y se vuelva a encender la impresora.";
    }

    @Override
    public int getCodigo() {
        return 0x0412;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x12;
        return ret;
    }

    @Override
    public String getNotas() {
        return " Al finalizar el proceso correctamente el LED parpadeará rápidamente en verde y se imprimirá un\n"
                + "aviso. Se debe reiniciar el equipo para finalizar la baja fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return " Haber finalizado la descarga SBF mediante llamadas al comando ’04 11’";
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
