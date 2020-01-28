package com.polimorfismo;

public class AdminFigura {
	
	

	public static void main(String[] args) {
		
		Cuadrado c = new Cuadrado(5, "Cuadrado");
		Triangulo t = new Triangulo(4, 5, "Triangulo");
		
		mostrar(c);
		mostrar(t);
		
		//Figura f = new Figura();
		//No se puede instanciar new de clase abstractas o interfaces, error de compilacion
		//Error de compilacion
		
	}
	
	//Los objetivos son: Mostar el label y el area de la fugura
		
	//Esta abstraido
	public static void mostrar(Figura figura) {
		//label de la figura
		System.out.println(figura.getLabel());
		
		//getCalcularArea debe est
		System.out.println(figura.calcularArea());
	}

}

