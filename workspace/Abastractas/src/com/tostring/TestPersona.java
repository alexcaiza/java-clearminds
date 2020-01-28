package com.tostring;

public class TestPersona {
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Alex");
		
		//Llama explicitamente p.toStrin() para poder imprimir un String
		// toString lo hereda de Object
		// full name de la clase + el hashCode
		
		System.out.println(p1); //p.toString(); sobrescrito
		
		Persona p2 = new Persona(null);
		
		System.out.println(p2); //p.toString(); sobrescrito pero con super
		
		
	}

}
