package com.java.funcional.interfaces.function;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class BinaryExample {
	
	static BinaryOperator<String> bo1 = (x,y) -> x +" " + y;
	
	static BinaryOperator<Integer> bo2 = (x,y) -> x+y;
	
	
	public static void main(String[] args) {
		
		System.out.println(bo1.apply("Alex", "Caiza"));
		System.out.println(bo2.apply(2, 3));
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		
		
		
		
	}
}
