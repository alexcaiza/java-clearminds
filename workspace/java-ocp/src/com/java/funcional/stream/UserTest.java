package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		//Obtener la cantidad de usuarios con una edad mayor a 18.
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		users.add(new User("Daniela", 15));
		users.add(new User("Marlene", 18));
		users.add(new User("Sandra", 16));
		
		//Imperativa
		int contador = 0;
		for (User user: users) {
			if (user.age > 18) {
				contador++;
			}
		}
		System.out.println("contador imperativo: " + contador);
		
		//Declarativa
		contador = (int) users.stream().filter(x->x.age>18).count();
		
		System.out.println("contador declarativo: " + contador);
		
	}
}
