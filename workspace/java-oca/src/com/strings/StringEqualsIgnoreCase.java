package com.strings;

public class StringEqualsIgnoreCase {
    
    public static void main(String[] args) {
        
        /**
        Los metodos de la clase String son inmutable, 
        Los metodos de la clase String no modifican de valor de la cadena original despues de realizar alguna operacion de algun cambio realizado
        Los metodos de la clase String devuelven una nueva cadena
        Ningun metodo de la clase String modifica la cadena original
        
        String es inmutable, no cambia el valor original del objeto
        El lenguaje reutiliza las cadenas creadas en memoria, 
          si alguien necesita una cadena en memoria, el lenguaje reutiliza las cadenas en memoria
          
        */
        
        //equals(): Compara el contenido de dos cadenas, no toma en cuenta mayusculas y minusculas
        
        
        String cadena1 = "Programacion";
        String cadena2 = "Programa";
        String cadena3 = cadena2.concat("CION");
        
        boolean band1 = cadena1.equalsIgnoreCase(cadena3);
        
        System.out.println("cadena1:" + cadena1);
        System.out.println("cadena3:" + cadena3);
        
        System.out.println("cadena1.equalsIgnoreCase(cadena3):" + band1);
    }

}
