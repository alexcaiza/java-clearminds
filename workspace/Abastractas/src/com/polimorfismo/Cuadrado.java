package com.polimorfismo;

public class Cuadrado extends Figura {
	
	//Error de compilacion constructor por defecto de Cuadrado llama a super de Fugura pero no tiene constrcutor vacio del papa
	
	
	public Cuadrado(int lado, String label) {
	    super(label);
		this.lado = lado;		
	}
	
	int lado;
	
	public int calcularArea() {
		return lado * lado;
	}

}
