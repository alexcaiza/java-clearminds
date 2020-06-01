package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		/*
		 * Conocer si un alumno posee por lo menos una calificacion no aprobatoria
		 * La calificacion minima aprobatoria es 6
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Long count = calificaciones.stream()
			.count();
		System.out.println("count: " + count);
		
		count = calificaciones.stream()
				.filter(x->x>5)
				.count();
			System.out.println("count: " + count);
		
	}
}
