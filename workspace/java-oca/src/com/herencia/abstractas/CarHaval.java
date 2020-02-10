package com.herencia.abstractas;

public abstract class CarHaval extends Car {
	
	public abstract void goFast();
	public abstract void goUpHill();
	
	public CarHaval(String marca) {
		super(marca);
	}
}
