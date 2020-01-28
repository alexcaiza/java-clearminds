package com.casting;

import com.herencia.Animal;
import com.herencia.Perro;

public class TestCasting {
	
	public static void main(String[] args) {
		Animal a = new Animal();
		
		//PERRO = ANIMAL
		//HIJO = PADRE
		//Error de compilacion
		//En asignacion en la compilacion, mismo tipos o padre  = hijo si funciona
		//Primero el casting luego la asignacion
		
		//Perro p = a;
		//no compole p=a
		
		//Analizar el casting en compilacion y en ejecucion
		//Analizar la asignacion en compilacion y en ejecucion
		
		//Si el casting funciona, se procede con la asignacion
		
		//Da error de classCastException
		
				//(Perro) Animal COMPILACION OK
		Perro p2 = (Perro) a;
		
		//En compilacion basta la relacion de herencia: Padre Hijo || Hijo Padre
		//En ejecucion el casting solo vale la relacion: Padre -> Hijo
		
	}

}
