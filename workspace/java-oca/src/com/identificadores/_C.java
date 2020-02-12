package com.identificadores;

public class _C {
	
	private static int $;
	
	private static int A$B;
	
	//private static int 1980_; no compila
	
	private static String s;
	
	private static String _helloWorld;

	public static void main(String[] main) {
		
		String a_b = null;
		System.out.println(a_b);
		
		System.out.print($);
		
		int $a_ = 100;
		System.out.println($a_);
		
		int _ = 200;
		System.out.println(_);
		
		
		
		//Error de compilacion		
		//The local variable a_b may not have been initialized
		//Es posible que la variable local a_b no se haya inicializado
		
		System.out.print(s);
	}
	
}
