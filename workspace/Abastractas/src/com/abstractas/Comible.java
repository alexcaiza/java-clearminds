package com.abstractas;

public abstract class Comible {
	
	//En una clase se pone abstract para metodos abstractos
	//Va en el metodo y en la clase 
	//Si hay una metodo Abs, la clase debe ser Abs
	//En una interface no es necesario
	//NO compila si no se pone Abs
	//En una clse se puede tener metodos abastractos y implementados
	//Una clase puede ser Abs asi no tenga metodos Abs
	
	public abstract void comer();
	
	public void terminar() {	
	}

}
