package com.herencia.abstractas;

public abstract class Car {
	
	private double price;
	private String model;
	private int year;
	
	public String marca;
	
	public abstract void goFast();
	public abstract void goUpHill();
	
	public double getPrice() {
		return price;
	}

	
	public Car(String marca){
		this.marca = marca;
	}

}
