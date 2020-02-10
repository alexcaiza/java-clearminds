package com.strings;

public class StringConcat {
    
    public static void main(String[] args) {
        
        /**
        Los metodos de la clase String son inmutable, 
        Los metodos de la clase String no modifican el valor de la cadena original despues de realizar alguna operacion de algun cambio realizado
        Los metodos de la clase String devuelven una nueva cadena
        Ningun metodo de la clase String modifica la cadena original
        
        String es inmutable, no cambia el valor original del objeto
        El lenguaje reutiliza las cadenas creadas en memoria, 
          si alguien necesita una cadena en memoria, el lenguaje reutiliza las cadenas en memoria
          
        */
        
        //concat(): Hace lo mismo que el operador de concatenacion +
        
        
        String cadena = "Programacion ";
        
        cadena.concat("Java");
        
        String nueva = cadena.concat("Java");
        
        System.out.println("cadena:" + cadena + " nueva:"+nueva);
    }

}
