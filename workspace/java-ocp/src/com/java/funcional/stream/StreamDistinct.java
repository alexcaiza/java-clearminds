package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {

	public static void main(String[] args) {
		/*
		 * Sumar los elementos de una coleccion con reduce
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,4);
		
		calificaciones.stream().forEach(x->System.out.print(" " + x));
		
		System.out.println("\n");
		
		calificaciones.stream().distinct().forEach(x->System.out.print(" " + x));
		
		System.out.println("\n");
		
		List<String> names = Arrays.asList("Codi 1","Codi 2","Codi 1","Codi 3");
		
		names.stream().distinct().forEach(x->System.out.print(" " + x));
		

	}
}
