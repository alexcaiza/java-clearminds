package com.java.funcional.stream;

import java.util.stream.IntStream;

public class StreamIntStreamRangeClosed {

	public static void main(String[] args) {
		
		//Problematica: 
		/*
		 * Sumar los elementos de una coleccion con java 8
		 * */
		
		//Before
		int total = 0;
		
		for (int i = 0; i < 50; i++) {
			total += i; 
		}
		
		System.out.println("total: " + total);
		
		//After with java 8
		
		total = IntStream.rangeClosed(0, 50).reduce(0, (acumulador, item) -> acumulador += item);
		
		System.out.println("total: " + total);
		
		total = IntStream.rangeClosed(0, 50)
				.map(Integer::new)
				.sum()
				;
		
		System.out.println("total: " + total);
	}
}
