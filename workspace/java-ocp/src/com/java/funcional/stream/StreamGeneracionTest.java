package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamGeneracionTest {

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
		
		//Formas de generar nuevos Streams: 
		
		//Coleccion que implemente la abstraccion List
		Stream<User> stream1 = users.stream();
		
		// Stream
		Stream<User> stream2 = stream1.filter(x -> x.age > 18);
		
		// Arreglo
		Integer[] numbers = {1,2,3,4,5};		
		Stream<Integer> stream3 = Stream.of(numbers);
		
		// Secuencia de datos
		Stream<String> stream4 = Stream.of("Juan","Pablo","Daniel");
		
	}
}
