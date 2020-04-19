package com.java.funcional.lambdas;

import java.util.function.Function;

public class FunctionOperatorTest {

	public static void main(String[] args) {
		
		//Function square = x -> x*x; //NO SE PUEDE
		
		Function<Integer, Double> f1 = x -> (double) x * x;
		
		Double res = f1.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

