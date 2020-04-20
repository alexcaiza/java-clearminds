package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorListTest {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		users.add(new User("Daniela", 15));
		users.add(new User("Marlene", 18));
		users.add(new User("Sandra", 16));
		
		// Lista de un Stream
		List<User> result = users.stream().filter(x->x.age>18).collect(Collectors.toList());
		
		System.out.println(result);
		
		// Iteracion interna
		
		
	}
}
