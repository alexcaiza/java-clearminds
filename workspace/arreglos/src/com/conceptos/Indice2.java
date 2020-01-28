package com.conceptos;

public class Indice2 {
	public static void main(String[] args) {
		int numbers[] = new int[4];
		numbers[0] = 3;
		numbers[1] = 2;
		numbers[2] = 6;
		
		int x[] = numbers;
		
		numbers[3] = 4;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[numbers[i]]);
		}
		
		
	}
}
