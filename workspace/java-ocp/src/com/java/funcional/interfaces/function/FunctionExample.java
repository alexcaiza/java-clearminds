package com.java.funcional.interfaces.function;

import java.util.List;
import java.util.function.Function;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class FunctionExample {
	
	static Function<Integer, String> funHeight = (x) -> "Height:" + x;
	
	static Function<String, String> f1 = x->x.toUpperCase();
	
	static Function<String, String> f2 = x->x.concat(" features");
	
	public static void main(String[] args) {
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		System.out.println("Example1: ");
				
		personList.forEach(p -> System.out.println(funHeight.apply(p.getHeight())));
		
		System.out.println("Example2: ");
		
		String result2 = f1.andThen(f2).apply("java");
		
		System.out.println("Result: " + result2);
		
		
		System.out.println("Example3: ");
		
		String result4 = f1.compose(f2).apply("java");
		
		System.out.println("Result: " + result4);
		
	}
}
