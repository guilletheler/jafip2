package com.gt.ifepson.comandos.diagnostico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerInformacionDeCertificados, <br>
* Obtener Información de Certificados<br>
* Notas: Obtiene información acerca los certificados instalados en el controlador fiscal.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	1	Indica si el certificado root es válido<br>
* 2	D	6	Fecha desde la cual está vigente el certificado root<br>
* 3	D	6	Fecha hasta la cual está vigente el certificado root<br>
* 4	B	1	Indica si el certificado del controlador fiscal es válido<br>
* 5	D	6	Fecha desde la cual está vigente el certificado del controlador fiscal<br>
* 6	D	6	Fecha hasta la cual está vigente el certificado del controlador fiscal<br>
* 
*/
public class ObtenerInformacionDeCertificados extends TipoComandoFiscal {

    public ObtenerInformacionDeCertificados() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerInformacionDeCertificados"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Información de Certificados";
    }

    @Override
    public int getCodigo() {
        return 0x0240;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DIAGNOSTICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x02;
        ret[1] = 0x40;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "Obtiene información acerca los certificados instalados en el controlador fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Indica si el certificado root es válido", TipoDato.B, 1, false),
            new TipoCampoFiscal(this, 2, "Fecha desde la cual está vigente el certificado root", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 3, "Fecha hasta la cual está vigente el certificado root", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 4, "Indica si el certificado del controlador fiscal es válido", TipoDato.B, 1, false),
            new TipoCampoFiscal(this, 5, "Fecha desde la cual está vigente el certificado del controlador fiscal", TipoDato.D, 6, false),
            new TipoCampoFiscal(this, 6, "Fecha hasta la cual está vigente el certificado del controlador fiscal", TipoDato.D, 6, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
