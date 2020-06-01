package com.java.funcional.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
		/*
		 * Sumar los elementos de una coleccion con reduce
		 * */
		//Problematica: 
		List<Integer> numeros = Arrays.asList(1,10,6,5,2,4,3,9,8,7);
		
		numeros.stream().sorted().forEach(x->System.out.print(" " + x));
		
		System.out.println("\n");
		
		numeros.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(" " + x));
		
		System.out.println("\n");
		
	}
}
