package com.gt.ifepson.comandos.tiqueFact;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerConfiguracionDePreferenciasTiqueFactNDABCM, <br>
* Obtiene los valores de configuración para la emisión de tique-factura o nota de débito fiscales que se<br>
* encuentran almacenados en la memoria de trabajo.<br>
* Notas: <br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	Y	1	Imprime información sobre el total pagado y vuelto<br>
* 2	B	0	Reservado<br>
* 3	Y	1	Imprime line feeds luego del encabezado y antes de las colas<br>
* 4	B	0	Reservado<br>
* 5	Y	1	Imprime línea 'Cosumidor Final'<br>
* 6	B	0	Reservado<br>
* 7	Y	1	Imprime domicilio comercial<br>
* 8	Y	1	Imprime líneas de nombre de fantasía<br>
* 9	Y	1	Imprime líneas de IIBB<br>
* 10	B	0	Reservado<br>
* 11	Y	1	Imprime líneas de logo de usuario<br>
* 12	Y	1	Utiliza pago automático<br>
* 13	Y	1	Imprime line feeds luego y antes de TOTAL<br>
* 14	Y	1	Imprime cantidad unitaria<br>
* 15	B	0	Reservado<br>
* 16	B	0	Reservado<br>
* 17	Y	1	Imprime QR<br>
* 18	RT	-1	Descripción del pago automático<br>
* 19	N_E	2	Código del pago automático<br>
* 
*/
public class ObtenerConfiguracionDePreferenciasTiqueFactNDABCM extends TipoComandoFiscal {

    public ObtenerConfiguracionDePreferenciasTiqueFactNDABCM() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerConfiguracionDePreferenciasTiqueFactNDABCM"};
    }

    @Override
    public String getDescripcion() {
        return "Obtiene los valores de configuración para la emisión de tique-factura o nota de débito fiscales que se\n"
                + "encuentran almacenados en la memoria de trabajo.";
    }

    @Override
    public int getCodigo() {
        return 0x0B09;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.TFND;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x0B;
        ret[1] = 0x09;
        return ret;
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
            new TipoCampoFiscal(this, 1, "Imprime información sobre el total pagado y vuelto", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 2, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 3, "Imprime line feeds luego del encabezado y antes de las colas", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 4, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 5, "Imprime línea 'Cosumidor Final'", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 6, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 7, "Imprime domicilio comercial", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 8, "Imprime líneas de nombre de fantasía", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 9, "Imprime líneas de IIBB", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 10, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 11, "Imprime líneas de logo de usuario", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 12, "Utiliza pago automático", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 13, "Imprime line feeds luego y antes de TOTAL", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 14, "Imprime cantidad unitaria", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 15, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 16, "Reservado", TipoDato.B, 0, false),
            new TipoCampoFiscal(this, 17, "Imprime QR", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 18, "Descripción del pago automático", TipoDato.RT, -1, false),
            new TipoCampoFiscal(this, 19, "Código del pago automático", TipoDato.N_E, 2, false)
        };
    }

}
