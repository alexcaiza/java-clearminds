package com.strings;

public class StringSubString {
    
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
        
        
        String str = new String("01234567890");
        
        System.out.println("Original String is ':" + str);
        
        System.out.println("Cadena después substring(3):" + str.substring(3));
        
        System.out.println("Cadena después substring(3, 9):" + str.substring(3, 9));
        
        try {
            System.out.println("Cadena después substring(3, "+(str.length()-1)+"):" + str.substring(3, (str.length()-1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, 9):" + str.substring(3, 12));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, "+str.length()+"):" + str.substring(3, str.length()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, 100):" + str.substring(3, 100));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(100, 5):" + str.substring(100));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(10, 5):" + str.substring(10, 7));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(-1):" + str.substring(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

}
