package com.estaticos;

public class TestEstaticos {
	int x;
	public static void main(String[] args) {
		//System.out.println(x);
		//x no es estatico , error de compilacion 
		
		//metodo2();
		//no compila , no es estatico
		
		metodo3();
	}
	
	void metodo2() {
		
	}
	
	static void metodo3() {
		
	}
}
