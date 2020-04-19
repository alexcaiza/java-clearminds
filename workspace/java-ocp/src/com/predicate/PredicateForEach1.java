package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateForEach1 {
	
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red","green","yellow");
		Predicate<String> test = n -> {
			System.out.println("Matching..." + n);
			return n.contains("red");
		};
		colors.stream()
			.filter(c -> {
				System.out.println("Filtering..." + c);
				return c.length() >= 3;
				})
			.allMatch(test)
			;
	}

}
