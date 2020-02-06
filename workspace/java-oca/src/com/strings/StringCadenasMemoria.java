package com.strings;

public class StringCadenasMemoria {
    
    public static void main(String[] args) {
        
        /**
        Los metodos de la clase String son inmutable, 
        Los metodos de la clase String no modifican de valor de la cadena original despues de realizar alguna operacion, algun cambio
        Los metodos de la clase String devuelven una nueva cadena
        Ningun metodo de la clase String modifica la cadena original
        
        String es inmutable, no cambia el valor original del objeto
        El lenguaje reutiliza las cadenas creadas en memoria, si alguien necesita una cadena en memoria, el lenguaje la reutiliza
        */
        
        String str = "asd";

        for (int i = 0; i < 100; i++) {
            str += i;
            // sub-cadenas: asd0 asd01 asd012 asd0123 asd01234 asd012345 asd0123456 asd01234567 ... asd012345678...99
            // se crean 100 sub-cadenas desde asd0 hasta asd0-99 en memoria
            // si alguien necesita una de estas cadena java reutiliza una de estas cadenas y no crea una nueva
        }
        
        System.out.println("str: " + str);
    }

}
