package com.strings;

public class StringReplace {
    
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
        
        
        String str = new String("el zorro zorro rápido saltó");
        
        System.out.println("Original String is ':" + str);
        
        System.out.println("Cadena después de reemplazar 'zorro' por 'perro':" + str.replace("zorro", "perro"));
        
        System.out.println("Cadena después de reemplazar todo 't' por 'a':" + str.replace('t', 'a'));
        
    }

}
