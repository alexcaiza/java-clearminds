package com.java.funcional.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest2 {

	public static void main(String[] args) {
		
		UnaryOperator<Double> uol = s -> s*2;
		
		List<Double> loanDoubles = Arrays.asList(1000.0, 2000.0);
		
		loanDoubles.stream()
			.filter(lv -> lv >= 1500 )
			.map(lv -> uol.apply(lv))
			.forEach(s -> System.out.println(s))
			;
		
	}
	
	
}

