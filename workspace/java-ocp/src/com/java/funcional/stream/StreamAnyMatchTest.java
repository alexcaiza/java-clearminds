package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatchTest {

	public static void main(String[] args) {
		/*
		 * Conocer si un alumno posee por lo menos una calificacion no aprobatoria
		 * La calificacion minima aprobatoria es 6
		 * */
		//Problematica: 
		List<Integer> calificaciones = Arrays.asList(10,10,9,5,6,6,7,8,9,10);
		boolean band1 = calificaciones.stream()
			.filter(x->x<6)
			.count() > 0;
		System.out.println("existe with > filter > count: " + band1);
		
		boolean band2 = calificaciones.stream().anyMatch(x->x<6);
		System.out.println("existe with > anyMatch: " + band2);
			
	}
}
