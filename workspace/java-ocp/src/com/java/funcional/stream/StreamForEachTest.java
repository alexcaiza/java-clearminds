package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEachTest {

	public static void main(String[] args) {
		
		// FlatMap: o	Este método permite combinar multiples colecciones de datos 
		// de tal forma que obtengamos como resultado final una única colección
		
		//Problematica: Obtener el cuadrado de todos los numetos en la lista
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		numeros.stream()
			.map(x->x*x)
			.forEach(x-> System.out.print(" " + x));
			
	}
}
