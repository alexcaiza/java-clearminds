package com.java.funcional.interfaces.function;

import java.util.List;
import java.util.function.UnaryOperator;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class UnaryExample {
	
	static UnaryOperator<String> uo1 = (x) -> x.toUpperCase();
	
	static UnaryOperator<Integer> uo2 = (x) -> x+10;
	
	
	public static void main(String[] args) {
		
		System.out.println(uo1.apply("java"));
		System.out.println(uo2.apply(20));
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		
		
		
		
	}
}
