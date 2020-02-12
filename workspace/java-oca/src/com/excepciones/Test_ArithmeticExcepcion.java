package com.excepciones;

public class Test_ArithmeticExcepcion {
	
	public static void main(String[] args) {
		int a = 123;
		int b = 0;
		
		try {
			System.out.println(a/b);
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
		} catch (ArithmeticException e) {
			System.out.println("2");
		} 
		finally {
			System.out.println("4");
		}
	}

}
