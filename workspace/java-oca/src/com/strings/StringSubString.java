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
    	
    	int ini=0;
    	int fin=0;
        
    	String nueva;
    	
        String cadena = new String("0123456789");
        
        System.out.println("Original String is ':" + cadena + " length():" + cadena.length());
        
        try {
        	ini=10;
        	nueva = cadena.substring(ini);
        	System.out.println("Cadena después substring("+ini+"):" + nueva);
		} catch (Exception e) {
			System.err.println("ERROR: Cadena después substring("+ini+"):" + cadena);
			e.printStackTrace();
		}
        
        try {
        	ini=10;
        	fin=11;
        	System.out.println("Cadena después substring("+ini+", "+fin+"):" + cadena.substring(ini, fin));
        } catch (Exception e) {
			System.err.println("ERROR: Cadena después substring("+ini+", "+fin+"):" + cadena);
			e.printStackTrace();
		}
        	
        try {
            System.out.println("Cadena después substring(3, "+(cadena.length())+"):" + cadena.substring(3, (cadena.length())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, 12):" + cadena.substring(3, 12));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, "+cadena.length()+"):" + cadena.substring(3, cadena.length()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(3, 100):" + cadena.substring(3, 100));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(100, 5):" + cadena.substring(100));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(10, 5):" + cadena.substring(10, 7));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Cadena después substring(-1):" + cadena.substring(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

}
