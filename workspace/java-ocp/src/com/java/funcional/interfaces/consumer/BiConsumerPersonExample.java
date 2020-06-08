package com.java.funcional.interfaces.consumer;

import java.util.function.BiConsumer;

public class BiConsumerPersonExample {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> c1 = (a, b) -> System.out.println("Add: " + (a+b));
		BiConsumer<Integer, Integer> c2 = (a, b) -> System.out.println("Sub: " + (a-b));
		BiConsumer<Integer, Integer> c3 = (a, b) -> System.out.println("Mul: " + (a*b));
		
		
		c1.accept(2, 3);
		
		c1.andThen(c2).andThen(c3).accept(10, 20);
		
	}
	
}
