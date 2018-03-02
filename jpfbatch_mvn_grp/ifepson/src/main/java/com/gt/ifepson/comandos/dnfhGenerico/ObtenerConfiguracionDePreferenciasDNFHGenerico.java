package com.gt.ifepson.comandos.dnfhGenerico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDePreferenciasDNFHGenerico, <br>
* Obtiene los valores de configuración para la emisión de documentos no fiscales homologados genéricos<br>
* o de uso interno que se encuentran almacenados en la memoria de trabajo.<br>
* Notas: No posee notas<br>
* Requerimientos: No posee requerimientos<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	0	Reservado<br>
* 2	B	0	Reservado<br>
* 3	Y	1	Imprime línea de razón social<br>
* 4	Y	1	Imprime línea de punto de venta<br>
* 5	B	0	Reservado<br>
* 6	B	0	Reservado<br>
* 7	B	0	Reservado<br>
* 8	Y	1	Imprime línea de nombre de fantasía<br>
* 9	Y	1	Imprime línea de ingresos brutos<br>
* 10	Y	1	Imprime línea de inicio actividades<br>
* 11	Y	1	Imprime línea de logo usuario<br>
* 12	Y	1	Imprime línea de domicilio comercial<br>
* 13	Y	1	Imprime línea de datos fiscales<br>
* 14	B	0	Reservado<br>
* 15	B	0	Reservado<br>
* 16	B	0	Reservado<br>
* 
*/
public class ObtenerConfiguracionDePreferenciasDNFHGenerico extends TipoComandoFiscal {

    public ObtenerConfiguracionDePreferenciasDNFHGenerico() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDePreferenciasDNFHGenerico"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene los valores de configuración para la emisión de documentos no fiscales homologados genéricos\n"
                + "o de uso interno que se encuentran almacenados en la memoria de trabajo.";
    }

    @Override
    public int getCodigo() {
        return 0x0E09;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DNFH_GENERICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0E;
        ret[1] = 0x09;
        return ret;
    }

    @Override
    public String getNotas() {
        return "No posee notas";
    }

    @Override
    public String getRequerimientos() {
        return "No posee requerimientos";
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
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 2, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 3, "Imprime línea de razón social", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 4, "Imprime línea de punto de venta", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 5, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 6, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 7, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 8, "Imprime línea de nombre de fantasía", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 9, "Imprime línea de ingresos brutos", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 10, "Imprime línea de inicio actividades", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 11, "Imprime línea de logo usuario", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 12, "Imprime línea de domicilio comercial", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 13, "Imprime línea de datos fiscales", TipoDato.Y , 1, false),
            new TipoCampoFiscal(this, 14, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 15, "Reservado", TipoDato.B , 0, false),
            new TipoCampoFiscal(this, 16, "Reservado", TipoDato.B , 0, false),
        };
    }
    
    

}
