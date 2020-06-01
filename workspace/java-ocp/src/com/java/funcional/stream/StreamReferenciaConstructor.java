package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamReferenciaConstructor {

	public static void main(String[] args) {
		
		//Referencia a un constructor
		
		//Problematica:
		/*
		 * Generar nuevos usuarios e imprimir sus nombres en consola
		 * */
		 
		List<User> users = new ArrayList<User>();
		
		IUser iUser = User::new;
		
		User user1 = iUser.create("Codi 1", 1);
		User user2 = iUser.create("Codi 2", 2);
		User user3 = iUser.create("Codi 3", 3);
		User user4 = iUser.create("Codi 4", 4);
		User user5 = iUser.create("Codi 5", 5);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.stream()
			.map(User::getUsername)
			.forEach(System.out::println);
	
		System.out.println("\n");

	}
	
}
