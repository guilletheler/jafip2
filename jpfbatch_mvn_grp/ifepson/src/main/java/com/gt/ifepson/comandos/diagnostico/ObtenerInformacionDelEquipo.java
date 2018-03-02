package com.gt.ifepson.comandos.diagnostico;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ObtenerInformacionDelEquipo, <br>
* Obtener Información del Equipo<br>
* Notas: Obtiene las características fiscales de la impresora fiscal.<br>
* Requerimientos: Mecanismo impresor en línea y con papel (En caso de impresión del documento)<br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	A	-1	Nombre de la versión<br>
* 2	N_E	3	ID de País<br>
* 3	N_E	2	Versión del firmware (mayor)<br>
* 4	N_E	2	Versión del firmware (menor)<br>
* 5	N_E	3	Versión del firmware (compilación)<br>
* 6	N_E	2	ID del mecanismo impresor<br>
* 7	P	-1	Nombre del mecanismo impresor<br>
* 8	N_E	7	Capacidad de la memoria fiscal (en bytes)<br>
* 9	N_E	10	Capacidad de la memoria de transacciones (en bytes)<br>
* 10	N_E	6	Capacidad de la memoria de trabajo (en bytes)<br>
* 11	Y	1	Jumper de servicio conectado<br>
* 12	B	1	Estado de los dips switches<br>
* 
*/
public class ObtenerInformacionDelEquipo extends TipoComandoFiscal {

    public ObtenerInformacionDelEquipo() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerInformacionDelEquipo"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Información del Equipo";
    }

    @Override
    public int getCodigo() {
        return 0x020A;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.DIAGNOSTICO;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x02;
        ret[1] = 0x0A;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{
            new TipoExtension(0b0000000000000001, "IMPRIMIR",
            "NO_IMPRIME_EL_DOCUMENTO_CON_LAS_CARACTERISTICAS", 0b0000000000000000,
            "IMPRIME_EL_DOCUMENTO_CON_LAS_CARACTERISTICAS", 0b0000000000000001)
        };
    }

    @Override
    public String getNotas() {
        return "Obtiene las características fiscales de la impresora fiscal.";
    }

    @Override
    public String getRequerimientos() {
        return "Mecanismo impresor en línea y con papel (En caso de impresión del documento)";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Nombre de la versión", TipoDato.A, -1, false),
            new TipoCampoFiscal(this, 2, "ID de País", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 3, "Versión del firmware (mayor)", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 4, "Versión del firmware (menor)", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 5, "Versión del firmware (compilación)", TipoDato.N_E, 3, false),
            new TipoCampoFiscal(this, 6, "ID del mecanismo impresor", TipoDato.N_E, 2, false),
            new TipoCampoFiscal(this, 7, "Nombre del mecanismo impresor", TipoDato.P, -1, false),
            new TipoCampoFiscal(this, 8, "Capacidad de la memoria fiscal (en bytes)", TipoDato.N_E, 7, false),
            new TipoCampoFiscal(this, 9, "Capacidad de la memoria de transacciones (en bytes)", TipoDato.N_E, 10, false),
            new TipoCampoFiscal(this, 10, "Capacidad de la memoria de trabajo (en bytes)", TipoDato.N_E, 6, false),
            new TipoCampoFiscal(this, 11, "Jumper de servicio conectado", TipoDato.Y, 1, false),
            new TipoCampoFiscal(this, 12, "Estado de los dips switches", TipoDato.B, 1, false)
        };
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
