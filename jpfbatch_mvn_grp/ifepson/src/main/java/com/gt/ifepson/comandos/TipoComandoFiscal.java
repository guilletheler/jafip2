/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

/**
 *
 * @author guillermot
 */
public abstract class TipoComandoFiscal {

    public abstract ClasificacionComando getClasificacionComando();

    public abstract String[] getNames();

    public abstract String getDescripcion();

    public abstract String getNotas();

    public abstract String getRequerimientos();

    public abstract int getCodigo();

    public abstract int[] getComando();

    /**
     * Posibles extensiones
     *
     * @return
     */
    public abstract TipoExtension[] getExtensiones();

    /**
     * Campos de entrada
     *
     * @return
     */
    public abstract TipoCampoFiscal[] getCamposEntrada();

    /**
     * Campos de salida
     *
     * @return
     */
    public abstract TipoCampoFiscal[] getCamposSalida();

    public String getAyuda() {

        StringBuilder sb = new StringBuilder();

        sb.append("Comando: ");
        
        String nombreComando = "";
        

        for (String nombre : this.getNames()) {
            if(!nombreComando.isEmpty()) {
                nombreComando += "\n";
            }
            nombreComando += nombre;
        }
        
        sb.append(nombreComando);
        
        
        sb.append("\nNotas: ").append(this.getNotas()).append("\n");
        sb.append("Requerimientos: ").append(this.getRequerimientos()).append("\n");

        sb.append("\n").append(this.getDescripcion()).append("\n\n");
        
        sb.append("Extensiones: ").append("\n");
        
        for(TipoExtension tipoExtension : this.getExtensiones()) {
            sb.append("Campo: ").append(tipoExtension.getCampo()).append("\nValores:\n");
            for(ValorExtension ve : tipoExtension.getCampos()) {
                sb.append("\t").append(ve.getNombre()).append("\n");
            }
        }
        
        sb.append("Campos de entrada: \n");
        for(TipoCampoFiscal tc : this.getCamposEntrada())  {
            sb.append(((Integer) tc.getIndice()).toString());
            sb.append("\t");
            sb.append(tc.getTipoDato());
            sb.append("\t");
            sb.append(tc.getLargo());
            sb.append("\t");
            sb.append(tc.getDescripcion());
            sb.append(tc.isOpcional() ? " (OPCIONAL)" : "");
            sb.append("\n");
        }
        
        sb.append("Campos de salida: \n");
        for(TipoCampoFiscal tc : this.getCamposSalida())  {
            sb.append(((Integer) tc.getIndice()).toString());
            sb.append("\t");
            sb.append(tc.getTipoDato());
            sb.append("\t");
            sb.append(tc.getLargo());
            sb.append("\t");
            sb.append(tc.getDescripcion());
            sb.append(tc.isOpcional() ? " (OPCIONAL)" : "");
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
