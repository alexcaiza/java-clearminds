package com.strings;

public class StringTrim {
    
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
        
        //trim(): quita los espacios en blanco del inicio y el final de la cadena, 
        //  devuelve una nueva cadena, no modifica la cadena original
        
        
        String cadena = " Programacion ";

        cadena.trim();
        
        String nueva = cadena.trim();
        
        System.out.println("cadena:" + cadena + " nueva:"+nueva);
    }

}
