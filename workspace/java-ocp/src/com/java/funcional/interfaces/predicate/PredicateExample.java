package com.java.funcional.interfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> lessThan = a -> a <= 50;
		Predicate<Integer> greaterThan = a -> a >= 100;		
		Predicate<Integer> equalTo = a -> a == 0;
		 
		System.out.println("Less Than: " + lessThan.test(150));
		System.out.println("Greater Than: " + greaterThan.test(150));
		System.out.println("Equal To: " + equalTo.test(0));
		
		boolean band1 = lessThan.and(greaterThan).and(equalTo).test(150);
		
		System.out.println("band1: " + band1);
		
		boolean band2 = lessThan.and(equalTo).test(0);
		
		System.out.println("band2: " + band2);
		
		boolean band3 = lessThan.or(greaterThan).test(150);
		
		System.out.println("band3: " + band3);
		
		boolean band4 = lessThan.or(greaterThan).negate().test(150);
		
		System.out.println("band4: " + band4);
		
		boolean band5 = lessThan.negate().test(150);
		
		System.out.println("band5: " + band5);
		
	}

}
