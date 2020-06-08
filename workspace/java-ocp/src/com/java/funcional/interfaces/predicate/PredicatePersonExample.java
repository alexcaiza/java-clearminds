package com.java.funcional.interfaces.predicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class PredicatePersonExample {
	
	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	static Predicate<Person> p2 = per -> per.getGender().equals("Male");
	static Predicate<Person> p3 = per -> per.getGender().equals("Female");
	
	static Consumer<Person> c1 = p->System.out.println(p.toString());
	
	static BiPredicate<Integer, String> biPredicate = (x, s) -> x>=140 && s.equals("Male");

	public static void main(String[] args) {
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		System.out.println("Example1: ");
		personList.stream().filter(p1.and(p2)).forEach(c1);
		
		System.out.println("Example2: ");		
		personList.stream().filter(p2.or(p3)).forEach(c1);
		
		System.out.println("Example3: ");
		personList.stream()
			.filter(p->biPredicate.test(p.getHeight(), p.getGender()))
			.forEach(c1);
		
	}

}
