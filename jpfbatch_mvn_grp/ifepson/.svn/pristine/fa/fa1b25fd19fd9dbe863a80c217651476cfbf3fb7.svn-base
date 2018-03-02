package com.gt.ifepson.comandos.descargaReportes;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: InformacionDeMemoriaDeTransacciones, <br>
* Información de Memoria de Transacciones<br>
* Notas: De encontrarse el valor cero (0) en los campos de salida 1 al 6, haciendo referencia a jornada<br>
* disponible desde cero y hasta cero, para cada de tipo de descarga (cinta testigo digital, duplicados<br>
* A o resumen de totales), se entenderá que no hay jornada alguna para descargar correspondiente<br>
* a ese tipo de descarga.<br>
* (32) “Disponibles para descargar”: se refiere a que aún no se ha descargado el Reporte correspondiente para su presentación a la AFIP. “Descargadas completamente”: se refiere a que ya se han descargado todos los reportes para dichas jornadas.<br>
* (34) “Jornadas borradas”: se refiere a jornadas que han sido borradas por el usuario. Una vez que el usuario las ha borrado, las jornadas<br>
* permanecerán disponibles hasta que el controlador fiscal las elimine completamente, para lo cual se deberán haber presentado los<br>
* reportes obligatorios para las jornadas correspondientes. También se eliminarán las jornadas ante una baja fiscal, siempre que se hayan<br>
* descargado todas las jornadas previamente para la presentación de todos los reportes obligatorios.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 1	N_E	4	Jornadas disponibles para descargar(32) cinta testigo digital (desde)<br>
* 2	A	4	Jornadas disponibles para descargar cinta testigo digital (hasta)<br>
* 3	N_E	4	"Jornadas disponibles para descargar duplicados tipo “A” (desde)<br>
* 4	N_E	4	Jornadas disponibles para descargar duplicados tipo “A” (hasta)<br>
* 5	N_E	4	Jornadas disponibles para descargar resumen de totales (desde)<br>
* 6	N_E	4	Jornadas disponibles para descargar resumen de totales (hasta)<br>
* 7	N_E	4	Jornadas descargadas completamente33 (desde)<br>
* 8	N_E	4	Jornadas descargadas completamente (hasta)<br>
* 9	N_E	4	Jornadas borradas(34) (desde)<br>
* 10	N_E	4	Jornadas borradas (hasta)<br>
* 
*/
public class InformacionDeMemoriaDeTransacciones extends TipoComandoFiscal {

    public InformacionDeMemoriaDeTransacciones() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"InformacionDeMemoriaDeTransacciones"};
    }

    @Override
    public String getDescripcion() {
        return "Información de Memoria de Transacciones";
    }

    @Override
    public int getCodigo() {
        return 0x0915;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.MEMORIA_TRANSACCIONES;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x09;
        ret[1] = 0x15;
        return ret;
    }

    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "De encontrarse el valor cero (0) en los campos de salida 1 al 6, haciendo referencia a jornada\n"
                + "disponible desde cero y hasta cero, para cada de tipo de descarga (cinta testigo digital, duplicados\n"
                + "A o resumen de totales), se entenderá que no hay jornada alguna para descargar correspondiente\n"
                + "a ese tipo de descarga.\n"
                + "(32) “Disponibles para descargar”: se refiere a que aún no se ha descargado el Reporte correspondiente para su presentación a la AFIP. “Descargadas completamente”: se refiere a que ya se han descargado todos los reportes para dichas jornadas.\n"
                + "(34) “Jornadas borradas”: se refiere a jornadas que han sido borradas por el usuario. Una vez que el usuario las ha borrado, las jornadas\n"
                + "permanecerán disponibles hasta que el controlador fiscal las elimine completamente, para lo cual se deberán haber presentado los\n"
                + "reportes obligatorios para las jornadas correspondientes. También se eliminarán las jornadas ante una baja fiscal, siempre que se hayan\n"
                + "descargado todas las jornadas previamente para la presentación de todos los reportes obligatorios.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[]{
            new TipoCampoFiscal(this, 1, "Jornadas disponibles para descargar(32) cinta testigo digital (desde)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 2, "Jornadas disponibles para descargar cinta testigo digital (hasta)", TipoDato.A, 4, false),
            new TipoCampoFiscal(this, 3, "\"Jornadas disponibles para descargar duplicados tipo “A” (desde)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 4, "Jornadas disponibles para descargar duplicados tipo “A” (hasta)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 5, "Jornadas disponibles para descargar resumen de totales (desde)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 6, "Jornadas disponibles para descargar resumen de totales (hasta)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 7, "Jornadas descargadas completamente33 (desde)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 8, "Jornadas descargadas completamente (hasta)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 9, "Jornadas borradas(34) (desde)", TipoDato.N_E, 4, false),
            new TipoCampoFiscal(this, 10, "Jornadas borradas (hasta)", TipoDato.N_E, 4, false)};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[]{};
    }

}
