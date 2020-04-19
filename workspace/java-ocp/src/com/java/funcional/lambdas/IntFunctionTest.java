package com.java.funcional.lambdas;

import java.util.function.Function;
import java.util.function.IntFunction;

public class IntFunctionTest {

	public static void main(String[] args) {
		
		IntFunction<Integer> square3 = x -> x*x;
		
		Integer res = square3.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

