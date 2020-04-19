package com.java.funcional.lambdas;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class LongFunctionTest {

	public static void main(String[] args) {
		
		LongFunction<Long> square3 = x -> x*x;
		
		Long res = square3.apply(3);
		
		System.out.println("res:" + res);
	}
	
	
}

