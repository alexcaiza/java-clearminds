package com.herencia.sobrecarga;

public class Metodos2 {

	static int sum(Integer a, int b) {
		System.out.println("Opcion1");
		return a + b;
	}

	static long sum(Long x, int y) {
		System.out.println("Opcion2");
		return x + y + 10;
	}

	static double sum(int n, double r) {
		System.out.println("Opcion3");
		return n + r;
	}
	
	static double sum(int n, float r) {
		System.out.println("Opcion4");
		return n + r + 4;
	}

	public static void main(String[] args) {
		System.out.println(sum(3, 2));
	}

}
