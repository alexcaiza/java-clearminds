package com.predicados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicados {
	
	public static void main(String[] args) {
		
		
		List<Persona> personas = new ArrayList<>();
		
		personas.add(new Persona(35, "Alex"));
		personas.add(new Persona(34, "Cris"));
		personas.add(new Persona(1, "Julian"));
		personas.add(new Persona(15, "Jose"));
		
		Persona p;
		
		p = busquedaPredicate(personas, new Predicate<Persona>() {
			@Override
			public boolean test(Persona t) {
				return t.edad < 18;
			}
		});
		
		System.out.println(p);
		
		p = busquedaPredicate(personas, new Predicate<Persona>() {
				@Override
				public boolean test(Persona t) {
					return t.edad < 18;
				}
		});
		
		System.out.println(p);
		
		p = busquedaPredicate(personas, (Persona op) -> op.edad<18);
		
		System.out.println(p);
		
		p = busquedaPredicate(personas, (op) -> op.edad<18);
		
		System.out.println(p);
		
		p = busquedaPredicate(personas, op -> op.edad<35);
		
		System.out.println(p);
	}
	
	public static Persona busquedaPredicate(List<Persona> personas, Predicate<Persona> predicate) {
		
		for (Persona persona: personas) {
			if (predicate.test(persona)) {
				return persona;
			}
		}
		return null;
	}
	
	

}
