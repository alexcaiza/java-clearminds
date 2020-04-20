package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFindAnyTest {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		/*
		 * Problematica:
		 * Obtener el nombre de un usuario que tenga una edad igual a 25.
		 * 
		 */
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		users.add(new User("Daniela", 35));
		users.add(new User("Marlene", 38));
		users.add(new User("Sandra", 25));
		
		User userDefault = new User("Sin nombre", 0);
		
		//Declarativa
		User user = users.stream()
				.filter(x->x.age==30)
				.findAny()
				//.get()
				.orElse(userDefault)
				;
		if (user != null) {
			System.out.println("contador declarativo: " + user.getUsername());
		}
		
	}
}
