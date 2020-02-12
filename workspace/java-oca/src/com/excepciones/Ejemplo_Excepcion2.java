package com.excepciones;

public class Ejemplo_Excepcion2 {
    static int x = 1;
    public static void main(String[] args) throws Throwable {
        try {
           if (x == 1)
        	   throw new Throwable();
           System.out.println("try ");
        } catch (Exception e) {
        	System.out.println("exc ");
        } finally {
        	System.out.println("fin ");
		}
    }

}
