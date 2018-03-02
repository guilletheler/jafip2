package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: BorradoDeJornadasDeMemoriaDeTransacciones, <br>
* Borrado de Jornadas de Memoria de Transacciones: <br>
* Habilita al controlador fiscal a eliminar definitivamente las jornadas fiscales almacenadas en la Memoria de Transacciones indicada.<br>
* Notas: <br>
* Requerimientos: Haber descargado los reportes obligatorios de las jornadas a borrar.<br>
* Campos de entrada: <br>
* 1	N_E	4	Borra hasta la jornada fiscal número<br>
* Campos de salida: <br>
* 
*/
public class BorradoDeJornadasDeMemoriaDeTransacciones extends TipoComandoFiscal {

    public BorradoDeJornadasDeMemoriaDeTransacciones() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"BorradoDeJornadasDeMemoriaDeTransacciones"};
    }

    @Override
    public String getDescripcion() {
        return "Borrado de Jornadas de Memoria de Transacciones: \n"
                + "Habilita al controlador fiscal a eliminar definitivamente las jornadas fiscales almacenadas en la Memoria de Transacciones indicada.";
    }

    @Override
    public int getCodigo() {
        return 0x0910;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x10;
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
        return "Haber descargado los reportes obligatorios de las jornadas a borrar.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{new TipoCampoFiscal(this, 1, "Borra hasta la jornada fiscal número", TipoDato.N_E, 4, false)};
    }

}
