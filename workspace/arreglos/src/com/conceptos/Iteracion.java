package com.conceptos;

public class Iteracion {
	public static void main(String[] args) {
		
		int values[] = new int[4];
		
		values[0] = 3;
		values[1] = values[0]++;
		values[2] = values[1]++;
		
		for (int i:values) {
			System.out.println(values[i]);
		}
		
	}
}
