package com.java.funcional.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSortObjects {

	public static void main(String[] args) {
		
		//Problematica: 
		/*
		 * Mostrar en consola los tres titulos mas vendidos en
		 * Ordenar por copias
		 * 
		 * */
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("El señor de los anillos", 150));
		books.add(new Book("Don quijote de la mancha", 500));
		books.add(new Book("Historia de dos ciudades", 200));
		books.add(new Book("El hobbit", 100));
		books.add(new Book("El principito", 140));
		
		Comparator<Book> comparatorCopies = Comparator.comparing(book -> book.getCopies());	
		Comparator<Book> comparatorTitles = Comparator.comparing(book -> book.getTitle());
		
		books.stream()
			.sorted(comparatorCopies.reversed())
			.limit(3)
			.forEach(x->System.out.println(" " + x));
		
		System.out.println("\n");
		
	}
}
