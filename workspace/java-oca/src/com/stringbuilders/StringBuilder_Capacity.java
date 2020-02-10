package com.stringbuilders;

public class StringBuilder_Capacity {
    
    /**
    Se debe utilizar si se realiza muchas operaciones de cadenas
    No generan una nueva cadena, trabajan sobre la misma cadena
    Los metodos de StringBuilder y StringBuffer si modifican la cadena original
    
    StringBuilder y StringBuffer tienen los mismos metodos y los mismos conceptos
    
    La diferencias entre StringBuilder y StringBuffer es que StringBuffer es ThreadSafe 
    tiene la implementacion del modificador Synchronized para el acceso sincronizado uno a uno
    en un proceso multi-hilos
    
    StringBuilder y StringBuffer se instancian con new
    
    Solo String y Wrappers deja realizar asignacion directa
    
    StringBuilder tiene sobrescrito el metodo toString()
    
    */
	
    public static void main(String[] args) {
    	
    	StringBuilder sb =  new StringBuilder("Programacion");
    	
    	int len = sb.length();
    	int cap = sb.capacity();
    	
    	System.out.println("sb:"+sb);
    	System.out.println("length:"+len);
    	System.out.println("capacity:"+cap);

    }

}
