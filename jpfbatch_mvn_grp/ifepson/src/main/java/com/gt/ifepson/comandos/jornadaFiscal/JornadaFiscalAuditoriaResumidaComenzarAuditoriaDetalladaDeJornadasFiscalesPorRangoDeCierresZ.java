package com.gt.ifepson.comandos.jornadaFiscal;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: JornadaFiscalAuditoriaResumidaComenzarAuditoriaDetalladaDeJornadasFiscalesPorRangoDeCierresZ, <br>
* Inicia un informe de Auditoría detallada de Jornadas Fiscales. Obtiene la información de acuerdo a los<br>
* parámetros solicitados y prepara la descarga electrónica de datos.<br>
* Notas:  El reporte impreso siempre es detallado por número de cierre Z.<br>
*  Al no enviar el valor del campo “Número del último cierre Z” el mismo tomará el valor máximo posible<br>
* (valor igual a 9999).<br>
* Requerimientos:  Mecanismo impresor en línea y con papel. (En caso de impresion del documento)<br>
* Campos de entrada: <br>
* 1	N_E	4	Número de cierre de Z inicial<br>
* 2	N_E	4	Número de cierre de Z final (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class JornadaFiscalAuditoriaResumidaComenzarAuditoriaDetalladaDeJornadasFiscalesPorRangoDeCierresZ extends TipoComandoFiscal {

    public JornadaFiscalAuditoriaResumidaComenzarAuditoriaDetalladaDeJornadasFiscalesPorRangoDeCierresZ() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"JornadaFiscalAuditoriaResumidaComenzarAuditoriaDetalladaDeJornadasFiscalesPorRangoDeCierresZ"};
    }

    @Override
    public String getDescripcion() {
        return "Inicia un informe de Auditoría detallada de Jornadas Fiscales. Obtiene la información de acuerdo a los\n"
                + "parámetros solicitados y prepara la descarga electrónica de datos.";
    }

    @Override
    public int getCodigo() {
        return 0x0813;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.JORNADA_FISCAL;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x08;
        ret[1] = 0x13;
        return ret;
    }

    @Override
    public String getNotas() {
        return " El reporte impreso siempre es detallado por número de cierre Z.\n"
                + " Al no enviar el valor del campo “Número del último cierre Z” el mismo tomará el valor máximo posible\n"
                + "(valor igual a 9999).";
    }

    @Override
    public String getRequerimientos() {
        return " Mecanismo impresor en línea y con papel. (En caso de impresion del documento)";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIME_REPORTE",
            "IMPRIME_REPORTE", 0b0000000000000000,
            "NO_IMPRIME_REPORTE", 0b0000000000000001),
            new TipoExtension(0b0000000000000010, "AUDITORIA_RESUMIDA_O_DETALLADA",
            "AUDITORIA_RESUMIDA", 0b0000000000000000,
            "AUDITORIA_DETALLADA", 0b0000000000000010),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{
          new TipoCampoFiscal(this, 1, "Número de cierre de Z inicial", TipoDato.N_E, 4, false),
          new TipoCampoFiscal(this, 2, "Número de cierre de Z final", TipoDato.N_E, 4, true),
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

}
