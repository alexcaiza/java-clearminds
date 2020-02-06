package com.strings;

public class StringToLowerCase {
    
    public static void main(String[] args) {
        
        /**
        Los metodos de la clase String son inmutable, 
        Los metodos de la clase String no modifican de valor de la cadena original despues de realizar alguna operacion, algun cambio
        Los metodos de la clase String devuelven una nueva cadena
        Ningun metodo de la clase String modifica la cadena original
        
        String es inmutable, no cambia el valor original del objeto
        El lenguaje reutiliza las cadenas creadas en memoria, si alguien necesita una cadena en memoria, el lenguaje la reutiliza
        */
        
        //toUpperCase(): Convierte una cadena a minusculas, devuelve una nueva cadena con los cambios realizados, 
        //  no modifica la cadena original
        
        
        String cadena = "Programacion";

        cadena.toUpperCase();
        cadena.toLowerCase();
        
        String nueva = cadena.toLowerCase();
        
        System.out.println("cadena:" + cadena + " nueva:" + nueva);
        
        
    }

}
