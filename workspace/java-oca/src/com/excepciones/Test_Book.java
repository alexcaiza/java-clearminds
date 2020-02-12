package com.excepciones;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{
	public void readBook(){}
} 

//abstract 
class EBook extends Book {
	public void readBook(){}
	public void setBookMark(){}
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


public class Test_Book {
	
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
