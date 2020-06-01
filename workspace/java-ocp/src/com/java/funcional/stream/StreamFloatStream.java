package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFloatStream {

	public static void main(String[] args) {
		/*
		 * Sumar los elementos de una coleccion con java 8
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		Long sumLong = calificaciones.stream()
				.mapToLong(x->x).sum();
		
		System.out.println("sumLong: " + sumLong);
		
	}
}
