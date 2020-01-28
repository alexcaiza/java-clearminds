package com.conceptos;

public class CrearArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo1;
		
		int arreglo2[];
		
		//Error de compilacion no debe poner el tamaño
		//int arreglo2[10];
		//Arreglo es un objeto se crea con new
		//Cuando instancio el arreglo se pone el tamaño, es obligatorio no compila si no se pone
		//Un arreglo se crea con new, o con asignacion de valores
		
		arreglo1 = new int[3];
		
		for (int i= 0; i<arreglo1.length; i++) {
			System.out.println("arreglo1["+i+"]: " + arreglo1[i]);
		}

		String cadenas[] = new String[3];
		
		for (int i= 0; i<cadenas.length; i++) {
			System.out.println("cadenas["+i+"]: " + cadenas[i]);
		}
		
		//No compila porque no tiene el tamaño despues de new
		//arreglo2 = new int[];
		
		// Inicializacion por defecto
		// 0 (int)
		// null string
		// 0.0 long
		
		//NO se puede hacer crecer los arreglos
		// Se puede cambiar los apuntadores a objetos de tipo arreglo del mismo tipo
		
	int arreglo5[] = {6,7,8};
	//Tamaña es el numero de elementos (length)
	System.out.println("Tamaño:" + arreglo5.length);

	}

}
