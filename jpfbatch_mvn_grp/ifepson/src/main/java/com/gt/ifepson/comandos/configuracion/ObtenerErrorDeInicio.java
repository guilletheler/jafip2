package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;

/**
* Comando: ObtenerErrorDeInicio, ConsultarErrorDeInicio, ObtenerErrorInicio, ConsultarErrorInicio, <br>
* Obtener Error de Inicio<br>
* Notas: Este comando permite conocer la causa precisa del error si luego de producirse un corte de corriente, al intentar ejecutar un comando la respuesta indica que se produjo un error durante el inicio.<br>
* Por ejemplo ante un corte de corriente durante la emisión de un documento determinado que necesitaser reimpreso y al volver la energía el mecanismo impresor presenta fallas y no es posible la reimpresión.<br>
* Siempre que ante un comando general el equipo devuelva un Código de Retorno 0002 (Error deInicialización del Equipo) se podrá utilizar este comando para obtener un Código de Retorno coninformación más precisa acerca de la causa del error.<br>
* Otro ejemplo es el caso que se da en algunos modelos de impresoras fiscales Epson, en la cual alencender el equipo sin tener papel colocado, el mismo debe ser instalado dentro de los 2 minutos, de locontrario se genera un error de inicialización a causa de que la impresora queda fuera de línea; el errorde inicialización es informado en el Código de Retorno ante cualquier comando general que se envíe, eldetalle de la causa puede obtenerse mediante del código de retorno del comando Obtener Error de Inicio;el problema en este caso es solucionado apagando y encendiendo el equipo.<br>
* Requerimientos: <br>
* Campos de entrada: <br>
* Campos de salida: <br>
* 
*/
public class ObtenerErrorDeInicio extends TipoComandoFiscal {

    public ObtenerErrorDeInicio() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ObtenerErrorDeInicio", "ConsultarErrorDeInicio", "ObtenerErrorInicio", "ConsultarErrorInicio"};
    }

    @Override
    public String getDescripcion() {
        return "Obtener Error de Inicio";
    }

    @Override
    public String getNotas() {
        return "Este comando permite conocer la causa precisa del error si luego de producirse un corte de corriente, al "
                + "intentar ejecutar un comando la respuesta indica que se produjo un error durante el inicio.\n"
                + "Por ejemplo ante un corte de corriente durante la emisión de un documento determinado que necesita"
                + "ser reimpreso y al volver la energía el mecanismo impresor presenta fallas y no es posible la reimpresión.\n"
                + "Siempre que ante un comando general el equipo devuelva un Código de Retorno 0002 (Error de"
                + "Inicialización del Equipo) se podrá utilizar este comando para obtener un Código de Retorno con"
                + "información más precisa acerca de la causa del error.\n"
                + "Otro ejemplo es el caso que se da en algunos modelos de impresoras fiscales Epson, en la cual al"
                + "encender el equipo sin tener papel colocado, el mismo debe ser instalado dentro de los 2 minutos, de lo"
                + "contrario se genera un error de inicialización a causa de que la impresora queda fuera de línea; el error"
                + "de inicialización es informado en el Código de Retorno ante cualquier comando general que se envíe, el"
                + "detalle de la causa puede obtenerse mediante del código de retorno del comando Obtener Error de Inicio;"
                + "el problema en este caso es solucionado apagando y encendiendo el equipo.";
    }

    @Override
    public String getRequerimientos() {
        return "";
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {};
    }
    
    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }
    

    @Override
    public int getCodigo() {
        return 0x0003;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.SISTEMA;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x00;
        ret[1] = 0x03;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

}
