package com.conceptos;

public class Indice {
	public static void main(String[] args) {
		int x[] = new int[4];
		x[3] = 10;
		x[4] = 8;
		x[20] = 5;
		
		//No data error de compilacion, el compilador no sabe de las posiciones
		
		//Lanza un excepcion, no hay el indice 4, al ejectar, da error de ejecucion
		// da error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		// Celda4 no existe
		
		//Si no pone el tamaño  int[] error de compilacion
	}
}
