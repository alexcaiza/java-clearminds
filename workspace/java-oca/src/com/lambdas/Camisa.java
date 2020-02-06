package com.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Camisa {
    
    private static final String TEMPLATE = "{color: \"%s\", talla: \"%s\"}";
    
    String color;
    String talla;
    
    Camisa(String color, String talla) {
        super();
        this.color = color;
        this.talla = talla;
    }
    
    @Override
    public String toString() {
        return String.format(TEMPLATE, color, talla);
    }
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }
    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
    public static List<Camisa> getListaCamisas() {
        
        List<Camisa> lista = new ArrayList<Camisa>();

        Camisa c1;
        
        c1 = new Camisa("NEGRO", "xs");
        lista.add(c1);
        
        c1 = new Camisa("NEGRO", "s");
        lista.add(c1);
        
        c1 = new Camisa("NEGRO", "m");
        lista.add(c1);
        
        c1 = new Camisa("NEGRO", "l");
        lista.add(c1);
        
        c1 = new Camisa("NEGRO", "xl");
        lista.add(c1);
        
        c1 = new Camisa("NEGRO", "xxl");
        lista.add(c1);
        
        
        c1 = new Camisa("AZUL", "xs");
        lista.add(c1);
        
        c1 = new Camisa("AZUL", "s");
        lista.add(c1);
        
        c1 = new Camisa("AZUL", "m");
        lista.add(c1);
        
        c1 = new Camisa("AZUL", "l");
        lista.add(c1);
        
        c1 = new Camisa("AZUL", "xl");
        lista.add(c1);
        
        c1 = new Camisa("AZUL", "xxl");
        lista.add(c1);
        
        
        c1 = new Camisa("BLANCO", "xs");
        lista.add(c1);
        
        c1 = new Camisa("BLANCO", "s");
        lista.add(c1);
        
        c1 = new Camisa("BLANCO", "m");
        lista.add(c1);
        
        c1 = new Camisa("BLANCO", "l");
        lista.add(c1);
        
        c1 = new Camisa("BLANCO", "xl");
        lista.add(c1);
        
        c1 = new Camisa("BLANCO", "xxl");
        lista.add(c1);
        
        
        
        c1 = new Camisa("AMARILLO", "xs");
        lista.add(c1);
        
        c1 = new Camisa("AMARILLO", "s");
        lista.add(c1);
        
        c1 = new Camisa("AMARILLO", "m");
        lista.add(c1);
        
        c1 = new Camisa("AMARILLO", "l");
        lista.add(c1);
        
        c1 = new Camisa("AMARILLO", "xl");
        lista.add(c1);
        
        c1 = new Camisa("AMARILLO", "xxl");
        lista.add(c1);
        
        
        
        return lista;
    }
    

}
