package com.strings;

public class StringIsEmpty {
    
    public static void main(String[] args) {
        /**
        Los metodos de la clase String son inmutable, 
        Los metodos de la clase String no modifican de valor de la cadena original despues de realizar alguna operacion, algun cambio
        Los metodos de la clase String devuelven una nueva cadena
        Ningun metodo de la clase String modifica la cadena original
        
        String es inmutable, no cambia el valor original del objeto
        El lenguaje reutiliza las cadenas creadas en memoria, si alguien necesita una cadena en memoria, el lenguaje la reutiliza
        */
        
        //isEmpty(): Devuelve true o false, si la longuitud de la cadena es cero (0)
        //           No confundir con null, no se puede hacer null.isEmpty()             
        
        
        String cadena1 = " Programacion ";
        String cadena2 = "";
        
        boolean band1 = cadena1.isEmpty();
        boolean band2 = cadena2.isEmpty();
    
        System.out.println("cadena1.isEmpty():" + band1);
        System.out.println("cadena2.isEmpty()::"+band2);
    }

}
