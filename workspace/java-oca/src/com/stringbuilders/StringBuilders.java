package com.stringbuilders;

public class StringBuilders {
    
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
    
    */
	
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	StringBuilder s1 =  new StringBuilder("s1");
    	StringBuilder s2 =  new StringBuilder("s2");
    	
    	StringBuilder s3 =  work(s1, s2);
    	
    	System.out.println("s1: " + s1);
    	System.out.println("s2: " + s2);
    	System.out.println("s3: " + s3);

    }

}
