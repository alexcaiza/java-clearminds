package com.java.funcional.lambdas;

public class IntefacesFuncionales {

}

@FunctionalInterface
interface Adder {
	double add(double n1, double n2);
}

@FunctionalInterface
interface Joiner {
	String join(String s1, String s2);
}
