package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		/*
		 * Sumar los elementos de una coleccion con reduce
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer resultReduce = calificaciones.stream()
				.reduce(0, (acumulador,elemento)->acumulador+elemento);
		
		System.out.println("resultReduce: " + resultReduce);
		
		String strReduce = Stream.of("Java","C","Python","Ruby")
				.reduce("", (acumulador, elemento) -> {
					if (acumulador == "") {
						return elemento;
					} else {
						return acumulador + " | " + elemento;
					}
				});
		
		System.out.println("strReduce: " + strReduce);
	}
}
