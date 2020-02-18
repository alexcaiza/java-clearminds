package com.parametros;

class Calc {
    public String modif(String d) {
        d += " bye"; 
        return d;
    }
}

public class PasoParametros1 {
    
    public static void main(String[] args) {
        Calc cl = new Calc();
        String s = new String("hello");
        
        String d = cl.modif(s);
        
        System.out.println("s: " + s + " d:" + d);
    }

}
