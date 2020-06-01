package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamIntStream {

	public static void main(String[] args) {
		/*
		 * Sumar los elementos de una coleccion con java 8
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer sumInt = calificaciones.stream()
				.mapToInt(x->x).sum();
		
		System.out.println("sumInt: " + sumInt);
		
		double average = calificaciones.stream()
				.mapToInt(x->x).average().orElse(0);
		
		System.out.println("average: " + average);
		
		Integer min = calificaciones.stream()
				.mapToInt(x->x).min().orElse(0);
		
		System.out.println("min: " + min);
		
		Integer max = calificaciones.stream()
				.mapToInt(x->x).max().orElse(0);
		
		System.out.println("max: " + max);
	}
}
