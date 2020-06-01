package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReferenciaInstancia {

	public static void main(String[] args) {
		//Problematica:
		/*
		 * Imprimir en consola el cubo de los elementos en la lista
		 * */
		 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		calificaciones.stream().forEach(x->System.out.print(" " + x));
		
		System.out.println("\n");
		
		Calculadora calculadora = new Calculadora();
		
		calificaciones.stream().
			map(calculadora::toCube)
			.forEach(System.out::println);
			;

	}
	
}
