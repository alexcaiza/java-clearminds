package com.herencia;

public class TestSobrescritura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//COMPILACION ==> Se analiza el TIPO DE DATOS
		//EJECUCION ==> Se analiza los APUNTADORES
		
		// en ejecution importa a donde llevan los apuntadores
		// A que objeto lleva el apuntador, para ver que codigo ejecuta
		Gato g = new Gato();
		
		g.comer();
		
		Animal a = new Gato();
		a.comer();
		
		Animal a1 = new Animal();
		a1.comer(); // animal comiendo
		
		a1 = a;
		a1.comer(); // gatos comiendo
		
		// La misma sentencia de codigo hace polimorfismo, puede ejecutar diferente forma,
		// ejecuta diferente codigo
		

	}
	
	/*
	 Sobrescritura va a partir de la herencia
	 
	  */

}
