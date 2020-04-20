package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapTest {

	public static void main(String[] args) {
		
		// FlatMap: o	Este método permite combinar multiples colecciones de datos 
		// de tal forma que obtengamos como resultado final una única colección
		
		//Problematica: Obtener el cuadrado de todos los numetos en la lista
		List<Integer> numeros1 = Arrays.asList(1,2);
		List<Integer> numeros2 = Arrays.asList(3,4);
		List<Integer> numeros3 = Arrays.asList(5,6);
		
		
		List<Integer> result = Stream.of(numeros1, numeros2, numeros3)
			.flatMap(x->x.stream())
			.collect(Collectors.toList());
		
		System.out.println(result);
		// [1, 2, 3, 4, 5, 6]
	}
}
