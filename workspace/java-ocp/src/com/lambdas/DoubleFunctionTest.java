package com.lambdas;

import java.util.function.DoubleFunction;

public class DoubleFunctionTest {

	public static void main(String[] args) {
		
		DoubleFunction<Double> square3 = x -> x*x;
		
		Double res = square3.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

