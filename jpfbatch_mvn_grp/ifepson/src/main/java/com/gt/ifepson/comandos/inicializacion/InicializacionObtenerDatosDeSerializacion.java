package com.gt.ifepson.comandos.inicializacion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InicializacionObtenerDatosDeSerializacion, <br>
* Obtiene los datos de serialización que se encuentran configurados en el equipo. Es posible obtener una<br>
* salida impresa.<br>
* Notas: No posee notas<br>
* Requerimientos: Mecanismo impresor en línea y con papel (En caso de impresión del documento)<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	A	16	Número de serie.<br>
* 2	D	6	Fecha de serialización<br>
* 
*/
public class InicializacionObtenerDatosDeSerializacion extends TipoComandoFiscal {

    public InicializacionObtenerDatosDeSerializacion() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InicializacionObtenerDatosDeSerializacion"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene los datos de serialización que se encuentran configurados en el equipo. Es posible obtener una\n"
                + "salida impresa.";
    }

    @Override
    public int getCodigo() {
        return 0x0402;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.INICIALIZACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x04;
        ret[1] = 0x02;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel (En caso de impresión del documento)";
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIME_REPORTE",
            "IMPRIME_REPORTE", 0b0000000000000000,
            "NO_IMPRIME_REPORTE", 0b0000000000000001),};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Número de serie.", TipoDato.A, 16, false),
            new TipoCampoFiscal(this, 2, "Fecha de serialización", TipoDato.D, 6, false),};
    }

}
