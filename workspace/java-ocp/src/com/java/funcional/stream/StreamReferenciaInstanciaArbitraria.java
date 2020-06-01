package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamReferenciaInstanciaArbitraria {

	public static void main(String[] args) {
		//Problematica:
		/*
		 * Imprimir en consola el nombre de todos los usuarios
		 * */
		 
		List<User> users = new ArrayList<User>();
		
		users.add(new User("Rafael", 29));
		users.add(new User("Eduardo", 25));
		users.add(new User("uriel", 20));
		users.add(new User("Luis", 15));
		users.add(new User("Marines", 10));
		
		
		users.stream()
			.map(x->x.getUsername())
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		users.stream()
			.map(User::getUsername)
			.forEach(System.out::println);
	
		System.out.println("\n");

	}
	
}
