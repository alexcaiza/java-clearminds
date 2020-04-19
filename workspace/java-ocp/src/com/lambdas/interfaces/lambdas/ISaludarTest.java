package com.lambdas.interfaces.lambdas;

public class ISaludarTest {
	
	
	public static void main(String[] args) {
		// Funcion anonima almacena en una variable
		ISaludar iSaludar1 = (String user) -> {System.out.println("Hola mundo " + user);};
		iSaludar1.saludar("Alex");
		
		ISaludar iSaludar2 = (nombre) -> {System.out.println("Hola mundo " + nombre);};
		iSaludar2.saludar("Julian");
		
		ISaludar iSaludar3 = nombre -> {System.out.println("Hola mundo " + nombre);};
		iSaludar3.saludar("Cristina");
	}
}
