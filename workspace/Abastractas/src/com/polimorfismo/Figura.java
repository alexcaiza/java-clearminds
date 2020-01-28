package com.polimorfismo;

public abstract class Figura {
	
	public Figura(String label) {
		this.label = label;
	}
	
	private String label;
	
	public String getLabel() {
		return label;
	}
	
	public abstract int calcularArea();
	
	//implemetacion incorrecta , no tiene una implementacion general para todas las figuras
	
	// Todos los hijos deben implementar
	// Si no implementa de error de compilacion o la clase debe ser abstracta

	// Polimorfismo ejecuta codigo diferencte
	// El puntero lleva a un codigo o otro codigo dependiendo del apuntador del objeto
	
	/*
	 public int calcularArea() {
	 	return 0;
	 } 
	 */

}
