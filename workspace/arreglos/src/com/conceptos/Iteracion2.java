package com.conceptos;

public class Iteracion2 {
	public static void main(String[] args) {
		
		int arreglo[] = {4,5,6,7};
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		for (int val:arreglo) {
			System.out.println(val);
		}
	}
}
