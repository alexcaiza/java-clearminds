package com.lambdas;

import java.util.function.Function;

public class FunctionOperatorTest {

	public static void main(String[] args) {
		
		//Function square = x -> x*x; //NO SE PUEDE
		
		Function<Integer, Integer> f1 = x -> x * x;
		
		int res = f1.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

