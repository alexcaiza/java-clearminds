package com.java.funcional.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamFilter01Test {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(18,6,4,15,55,78,12,9,8);
		
		//Imperativo
		int cont1 = 0;
		for (int num : numeros) {
			if (num > 10) {
				cont1++;
			}
		}
		
		System.out.println("cont1: " + cont1);
		
		//Declarativo
		Long cont2 = numeros.stream().filter((n)->n>10).count();
		
		System.out.println("cont2: " + cont2);
	}
	
	
}

