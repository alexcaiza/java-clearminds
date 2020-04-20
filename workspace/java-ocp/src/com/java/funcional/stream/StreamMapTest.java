package com.java.funcional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {

	public static void main(String[] args) {
		
		//Problematica: Obtener el cuadrado de todos los numetos en la lista
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		List<Integer> result = numeros.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(result);		
	}
}
