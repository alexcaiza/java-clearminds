package com.herencia.abstractas;

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
	
	public void m1() {
		System.out.println("m1 Writer");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
	public static void read() {
		System.out.println("Reading book");
	}
	public void m1() {
		System.out.println("m1 Author");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}
	public static void read() {
		System.out.println("Reading code");
	}
	public void m1() {
		System.out.println("m1 Programmer");
	}
}
	

public class TestWriter {
	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
		w.m1();
		
		Author a = new Programmer();
		
	}
}
