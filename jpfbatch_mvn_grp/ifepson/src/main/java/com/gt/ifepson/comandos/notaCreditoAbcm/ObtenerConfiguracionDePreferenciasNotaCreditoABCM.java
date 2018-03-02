package com.gt.ifepson.comandos.notaCreditoAbcm;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDePreferenciasNotaCreditoABCM, <br>
* Obtiene los valores de configuración para la emisión de tique-nota de crédito A/B/C/M que se encuentran almacenados en la memoria de trabajo.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	B	0	Reservado<br>
* 2	B	0	Reservado<br>
* 3	Y	1	Imprime line feeds antes de las colas<br>
* 4	B	0	Reservado<br>
* 5	B	0	Reservado<br>
* 6	B	0	Reservado<br>
* 7	Y	1	Imprime lineas de domicilio comercial<br>
* 8	Y	1	Imprime líneas de nombre de fantasía<br>
* 9	Y	1	Imprime líneas de IIBB<br>
* 10	B	0	Reservado<br>
* 11	Y	1	Imprime líneas de logo de usuario<br>
* 12	B	0	Reservado<br>
* 13	Y	1	Imprime line feeds luego y antes de TOTAL<br>
* 14	B	0	Reservado<br>
* 15	B	0	Reservado<br>
* 16	B	0	Reservado<br>
* 17	Y	1	Imprime QR<br>
* 
*/
public class ObtenerConfiguracionDePreferenciasNotaCreditoABCM extends TipoComandoFiscal {

    public ObtenerConfiguracionDePreferenciasNotaCreditoABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDePreferenciasNotaCreditoABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene los valores de configuración para la emisión de tique-nota de crédito A/B/C/M que se encuentran almacenados en la memoria de trabajo.";
    }

    @Override
    public String getNotas() {
        return "";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public int getCodigo() {
        return 0x0D09;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TNC;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0D;
        ret[1] = 0x09;
        return ret;
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
            new TipoCampoFiscal(this, 2, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 3, "Imprime line feeds antes de las colas", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 4, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 5, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 6, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 7, "Imprime lineas de domicilio comercial", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 8, "Imprime líneas de nombre de fantasía", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 9, "Imprime líneas de IIBB", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 10, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 11, "Imprime líneas de logo de usuario", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 12, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 13, "Imprime line feeds luego y antes de TOTAL", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 14, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 15, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 16, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 17, "Imprime QR", TipoDato.Y, 1, false)
        };
    }
}
