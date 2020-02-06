package com.equals;



public class Intanceof1 {
	
	public static void main(String[] args) {
		
		Intanceof1 a1 = new Intanceof1();
		Intanceof1 a2 = new Intanceof1();
		
		if (a1.equals(a2)) {
			System.out.println("SI a1.equals(a2)");
		} else {
			System.out.println("NO a1.equals(a2)");
		}
		
		if (a1 instanceof Object) {
			System.out.println("a1 is an Object");
		}
		
	}

}
