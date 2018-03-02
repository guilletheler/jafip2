package com.gt.ifepson.comandos.configuracion;

import com.gt.ifepson.comandos.TipoCampoFiscal;
import com.gt.ifepson.comandos.TipoComandoFiscal;
import com.gt.ifepson.comandos.ClasificacionComando;
import com.gt.ifepson.comandos.TipoExtension;
import com.gt.ifepson.comandos.TipoDato;

/**
* Comando: ConfigurarResponsabilidadFrenteAlIVA, ConfigurarIVA, SetIVA, <br>
* Configurar Responsabilidad Frente al IVA<br>
* Notas: El reporte de fiscalización sólo será impreso en modo fiscal.<br>
* Mecanismo impresor en línea y con papel24.<br>
* Los valores admitidos en el campo “Responsabilidad ante el IVA” son:<br>
* I = Responsable Inscripto.<br>
* N = No Responsable.<br>
* M = Monotributista.<br>
* E = IVA Exento.<br>
* T = Monotributista Social.<br>
* Los valores admitidos en el campo “Tipo de Tique-Factura A” sólo para la responsabilidad ante el IVA del tipo Responsable Inscripto(“I”) son:<br>
* 0 = Normal.<br>
* 1 = Comprobantes A con leyenda.<br>
* 2 = Comprobantes M.<br>
* En caso de elegir una responsabilidad ante el IVA distinta a “I”, este campo debe enviarse vacío.<br>
* Requerimientos: Jornada fiscal cerrada.<br>
* Campos de entrada: <br>
* 1	L	1	Responsabilidad ante el IVA<br>
* 2	N_E	1	Tipo de Tique-Factura A (OPCIONAL)<br>
* Campos de salida: <br>
* 
*/
public class ConfigurarResponsabilidadFrenteAlIVA extends TipoComandoFiscal {

    public ConfigurarResponsabilidadFrenteAlIVA() {
    }

    @Override
    public String[] getNames() {
        return new String[]{"ConfigurarResponsabilidadFrenteAlIVA", "ConfigurarIVA", "SetIVA"};
    }

    @Override
    public String getDescripcion() {
        return "Configurar Responsabilidad Frente al IVA";
    }

    @Override
    public int getCodigo() {
        return 0x0504;
    }

    @Override
    public ClasificacionComando getClasificacionComando() {
        return ClasificacionComando.CONFIGURACION;
    }

    @Override
    public int[] getComando() {
        int[] ret = new int[2];
        ret[0] = 0x05;
        ret[1] = 0x04;
        return ret;
    }
    
    @Override
    public TipoExtension[] getExtensiones() {
        return new TipoExtension[]{};
    }

    @Override
    public String getNotas() {
        return "El reporte de fiscalización sólo será impreso en modo fiscal.\n"
                + "Mecanismo impresor en línea y con papel24.\n"
                + "Los valores admitidos en el campo “Responsabilidad ante el IVA” son:\n"
                + "I = Responsable Inscripto.\n"
                + "N = No Responsable.\n"
                + "M = Monotributista.\n"
                + "E = IVA Exento.\n"
                + "T = Monotributista Social.\n"
                + "Los valores admitidos en el campo “Tipo de Tique-Factura A” sólo para la responsabilidad ante el IVA del tipo Responsable Inscripto(“I”) son:\n"
                + "0 = Normal.\n"
                + "1 = Comprobantes A con leyenda.\n"
                + "2 = Comprobantes M.\n"
                + "En caso de elegir una responsabilidad ante el IVA distinta a “I”, este campo debe enviarse vacío.";
    }

    @Override
    public String getRequerimientos() {
        return "Jornada fiscal cerrada.";
    }

    @Override
    public TipoCampoFiscal[] getCamposSalida() {
        return new TipoCampoFiscal[] {};
    }

    @Override
    public TipoCampoFiscal[] getCamposEntrada() {
        return new TipoCampoFiscal[] {
            new TipoCampoFiscal(this, 1, "Responsabilidad ante el IVA", TipoDato.L, 1, false), 
            new TipoCampoFiscal(this, 2, "Tipo de Tique-Factura A", TipoDato.N_E, 1, true)};
    }

}
