package com.herencia;

import java.util.ArrayList;
import java.util.List;

class Book {
	String name;
	public Book() {
		this("Java");
	}
	public Book(String name) {
		this.name = name;
	}
}

class CookBook extends Book {
	String title;
	CookBook(){
		super("Certi");
	}
	CookBook(String title){
		super(title);
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.name+":"+this.title;
	}
}


public class TestBook {
	
	public static void main(String[] args) {
		
		Book b = new CookBook("React");
		
		System.out.println(b);
		
	}
	
}