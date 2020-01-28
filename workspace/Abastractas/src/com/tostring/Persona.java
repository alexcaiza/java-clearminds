package com.tostring;

public class Persona {
	private String nombre;
	 
	// Cuando se crea un constructor con parametros se pierde el contructor vacio
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		if (nombre == null ) {
		return super.toString();
		}
		else {
			return "Persona [nombre = "+this.nombre+"]";
		}
		
	}
}
