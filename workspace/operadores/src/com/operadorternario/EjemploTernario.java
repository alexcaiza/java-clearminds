package com.operadorternario;

public class EjemploTernario {
	
	public static void main(String[] args) {
		int x = 0;
		int val;
		
		if (x > 10) {
			val  =1;
		} else {
			val = 0;
		}
		
		System.out.println("val:" + val);
		
		val = (x>10) ? 1 : 0;
		
		System.out.println("val:" + val);
		
		//Si edad es mayor a 50, tipoes adulto mayor
		//Si edades menor a 18, tipo es menor de edad
		//Si edad esta entre 18 y 50 incluidos es adulto
		
		int edad = 30;
		String tipo;
		
		tipo = (edad > 50) ? "adulto mayor" : (edad < 18) ? "menor de edad"  : "adulto";
		
		System.out.println("tipo: " + tipo);
	}

}
