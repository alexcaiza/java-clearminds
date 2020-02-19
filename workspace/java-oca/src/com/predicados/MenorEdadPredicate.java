package com.predicados;

import java.util.function.Predicate;

public class MenorEdadPredicate implements Predicate<Persona> {	
	@Override
	public boolean test(Persona t) {
		return t.edad < 18;
	}
}
