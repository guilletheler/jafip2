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
public enum TipoDato {
    /**
     * Alfanumerico
     */
    A("Alfanumerico", "'a'-'z', 'A'-'Z', '0'-'9'"),
    /**
     * Alfabetico
     */
    L("Alfabetico", "'a'-'z', 'A'-'Z'"),
    /**
     * Numerico entero
     */
    N_E("Numerico entero", "'0'-'9'"),
    /**
     * Numerico 10 entero 2 decimal
     */
    N_10_2("Numerico 10, 2", "'0'-'9'"),
    /**
     * Numerico 7 entero 4 decimal
     */
    N_7_4("Numerico 7, 4", "'0'-'9'"),
    /**
     * Numerico 7 entero 2 decimal
     */
    N_7_2("Numerico 7, 2", "'0'-'9'"),
    /**
     * Numerico 5 entero 4 decimal
     */
    N_5_4("Numerico 5, 4", "'0'-'9'"),
    /**
     * Numerico 2 entero 2 decimal
     */
    N_2_2("Numerico 2, 2", "'0'-'9'"),
    /**
     * Numerico 0 entero 8 decimal
     */
    N_0_8("Numerico 0, 8", "'0'-'9'"),
    /**
     * Numerico 0 entero 4 decimal
     */
    N_0_4("Numerico 0, 4", "'0'-'9'"),
    /**
     * Binario
     */
    B("Binario", "0x00-0xFF"),
    /**
     * Imprimible
     */
    P("Imprimible", "0x20-0xFF"),
    /**
     * Hexadecimal
     */
    H("Hexadecimal", "'a'-'f', 'A'-'F', '0'-'9'"),
    /**
     * Fecha
     */
    D("Fecha", "Ddmmyyyy"),
    /**
     * Hora
     */
    T("Hora", "Hhmmss"),
    /**
     * Booleano
     */
    Y("Booleano", "'S', 'N'"),
    /**
     * Texto Fiscal Enriquecido
     */
    RT("Texto Fiscal Enriquecido", "0x20-0xFF, aceptando atributos y códigos de barra");
    
    String descripcion;
    String regex;

    private TipoDato(String descripcion, String regex) {
        this.descripcion = descripcion;
        this.regex = regex;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRegex() {
        return regex;
    }
    
}
