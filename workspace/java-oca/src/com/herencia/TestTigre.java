package com.herencia;

import java.util.ArrayList;

interface DomesticableT {}

class Tigre implements DomesticableT {}

class Tigrillo extends Tigre{}


public class TestTigre {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add("hola");
		a.add(new Tigre());
		
		ArrayList b = new ArrayList<>();
		b.add("hola");
		b.add(new DomesticableT());
		
		ArrayList<DomesticableT> c = new ArrayList<>();
		c.add(new Tigre());
		c.add(new Tigrillo());
		
		ArrayList<Tigrillo> d = new ArrayList<>();
		d.add(new Tigre());
		d.add(new Tigrillo());
		
	}
	
}