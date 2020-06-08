package com.java.funcional.interfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class ConsumerExample {
	
	static Consumer<Person> c1 = (p) -> System.out.println(p);
	
	static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());
	
	static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
	
	static void printNameAndHobbies() {
		
		List<Person>  personList = PersonRepository.getAllPersons();
		
		personList.forEach(c1.andThen(c2).andThen(c3));
	}
	
	static void printWithConditions() {
		
		List<Person>  personList = PersonRepository.getAllPersons();
		
		personList.forEach(x->{
			if (x.getGender().equals("Male") && x.getSalary() >= 144) {
			c1.andThen(c2).andThen(c3).accept(x);
			}
		});
	}

	public static void main(String[] args) {
		
		List<Person>  personList = PersonRepository.getAllPersons();
		
		//c1.accept(PersonRepository.getPerson());
		//c2.accept(PersonRepository.getPerson());
		//;c3.accept(PersonRepository.getPerson());
		
		//c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
		
		//printNameAndHobbies();
		
		printWithConditions();
		
	}
	
}
