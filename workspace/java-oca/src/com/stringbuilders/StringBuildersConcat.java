package com.stringbuilders;

public class StringBuildersConcat {
    
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
    	
    	StringBuilder sb =  new StringBuilder("s1");
    	
    	sb.app

    }

}
