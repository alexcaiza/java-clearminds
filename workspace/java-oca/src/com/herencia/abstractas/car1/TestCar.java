package com.herencia.abstractas.car1;

abstract class Car{
	protected void run(){} //line 1
	abstract Object stop(); //line 2
} 
class MyCar extends Car{
	public void run(){} //line 3
	protected String stop(){return null;} //line 4
}

public class TestCar {

}
