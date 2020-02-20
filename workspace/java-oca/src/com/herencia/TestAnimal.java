package com.herencia;

import java.util.ArrayList;
import java.util.List;

class Animal {	}

abstract class PerroAbstract extends Animal {}

class Perro extends PerroAbstract {}

interface Domesticable {}

class Gato extends Animal implements Domesticable {}

public class TestAnimal {
	
	public static void main(String[] args) {
		List<Animal> list1 = new ArrayList<>();
		list1.add(new Animal());
		list1.add(new Gato());
		list1.add(new Perro());
		
		List<Domesticable> list2 = new ArrayList<>();
		list2.add(new Animal());
		list2.add(new Gato());
		list2.add(new Perro());
		
		List<PerroAbstract> list3 = new ArrayList<>();
		list3.add(new Animal());
		list3.add(new Gato());
		list3.add(new Perro());
	}
	
}