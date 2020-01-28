package com.casting;

import com.herencia.Animal;
import com.herencia.Perro;

public class Test {
	
	public static void main(String[] args) {
	
		Animal a = AdminAnimal.buscar(6);
		//En compilacion no hay ladrar en Animal
		//En compilacion solo intereza los tipos de datos
		//a.ladrar();
		
		//PERRO = ANIMAL
		//HIJO = PADRE  (Si funciona la revez o si son del mismo tipo)
		//No compila
		//Perro p = AdminAnimal.buscar(6);
		
		//Compilacion
		//(Perro) Animal OK		
		//(Animal) Perro OK
		//Para que funcione el cast las clases de estar en relacion de herencia

		//Si los dos tipos deben tener realicion de herencia
		
		//En compilacion funciona  el esquema (Padre - Hijo tambien Hijo - Padre) 
		//Basta con relacion de herencia
		
		//En ejecucion funciona  el esquema (Padre - Hijo)
		
		Perro p2 = (Perro) AdminAnimal.buscar(1);
		p2.ladrar();
		
		//Error de ejecucion no me interesa los tipos de datos
		//Error de ejecucion si me interesa los apuntadores 
		
		
	}

}
