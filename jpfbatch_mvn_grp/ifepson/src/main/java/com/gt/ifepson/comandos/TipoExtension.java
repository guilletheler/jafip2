/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.ifepson.comandos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guillermot
 */
public class TipoExtension {
    
    int bits;
    
    String campo;
    
    List<ValorExtension> campos;
    
    public TipoExtension(int bits, String campo, Object... valores) {
        this.bits = bits;
        this.campo = campo;
        
        for(int i = 0; i < valores.length; i+= 2) {
            this.getCampos().add(new ValorExtension(this, (String) valores[i], (Integer) valores[i + 1]));
        }
        
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public List<ValorExtension> getCampos() {
        if(campos == null) {
            campos = new ArrayList<>();
        }
        
        return campos;
    }

}
