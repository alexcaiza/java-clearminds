package com.java.funcional.interfaces.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java.funcional.repo.Person;
import com.java.funcional.repo.PersonRepository;

public class BiFunctionExample {
	
	static BiFunction<String, String, String> biFunction1 = (x, y) -> x.concat(" ").concat(y);
	
	static BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> biFunction2 = (personList, predicate) -> {
		
		Map<String, Double> map = new HashMap<>();
		
		personList.stream().filter(predicate).forEach(x->{
			map.put(x.getName(), x.getSalary());
		});
		
		return map;
	};
	
	public static void main(String[] args) {
		
		Predicate<Person> p1 = per -> per.getHeight() >= 140;
		Predicate<Person> p2 = per -> per.getGender().equals("Male");
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		System.out.println("Example1: ");
		
		System.out.println(biFunction1.apply("Alex ","Caiza"));
				
		System.out.println("Example2: ");
		
		Map<String, Double> map = biFunction2.apply(personList, p1);
		
		System.out.println("Result: " + map);
		
		System.out.println("Example3: ");
		
		Map<String, Double> map2 = biFunction2.apply(personList, p1.and(p2));
		
		System.out.println("Result: " + map2);
		
	}
}
