package com.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> square2 = x -> x*x;
		
		int res = square2.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

