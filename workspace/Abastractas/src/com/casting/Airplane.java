package com.casting;

public class Airplane extends Vehicle {
	void move() {
		System.out.println("Airplane moving"); 
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Auto();
		Vehicle v2 = new Airplane();
		
		v2 = (Vehicle) v1;
		Auto a = (Auto) v2;
		
		Vehicle v3 = a;
		
		v3.move();
	}
}

class Auto extends Vehicle {
	void move() {
		System.out.println("Auto moving"); 
	}
}


class Vehicle {
	void move() {
		System.out.println("Vehicle moving"); 
	}
}