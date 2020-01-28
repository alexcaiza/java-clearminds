package com.herencia;

public class Gato extends Animal {
	
	/*
	 Hereda los metodos de Animal y de Object 
	 Hereda el metodo comer de animal
	 
	 */
	
	/*
	 Sobrescritura va a partir de la herencia
	 Si el metodo padre no funciona, de puede sobrescribir, va con el mismo nombre y los mismos parametros
	 Se necesita que haga diferente al padre, se puede sebrescribir	 
	  */
	@Override
	public void comer() {		
		//super.comer();
		System.out.println("GATO COMIENDO");
	}
	
	public void maullar() {
		System.out.println("Gato maullando");
	}

}
