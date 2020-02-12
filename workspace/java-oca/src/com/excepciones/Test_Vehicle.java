package com.excepciones;

class Vehicle{
	String type = "4w";
	int maxSpeed = 100;
	public Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
} 



class Car extends Vehicle {
	String trans;
	Car(String trans){
		this.trans = trans;
	}
	Car(String type, int maxSpeed, String trans){
		super(type, maxSpeed);
		this(trans);
		//this.trans = trans;
	}
}


public class Test_Vehicle {
	
	public static void main(String[] args) {
		int a = 123;
		int b = 1;
		
		try {
			System.out.println(a/b);
			System.out.println("1");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally");
		}
	}

}
