package com.herencia;

public class TestGato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.- Analizar la compilacion, analizar los tipos de datos Padre Hijo		
		//2.- Si en esa clase esta esta el metodo compila
		
		//Tipo de Gato
		//Gato = Gato Mismo TIPO
		Gato g = new Gato();
		
		g.comer();
		g.maullar();
		
		g.toString();
		g.hashCode();
		
		
		//Animal = Gato PADRE = HIJO (asignacion valida) al revez no compila (Hijo vs Padre)
		Animal a = new Gato();
		
		a.comer();
		
		//a.maullar();
		//No compila
		//para analizar la compilacion, el analisis va en el tipo de datos
		//
		
		a.toString();
		
		// Padre  = Hijo
		Object obj = new Gato();
		//obj.comer();
		//obj.maullar();
		obj.toString();
		
		

	}
	
	/*
	 Sobrescritura va a partir de la herencia
	 
	  */

}
