package com.lambdas;

public class IntefacesFuncionalesTest {

	public static void main(String[] args) {
		Adder adder1 = (x, y) -> x + y;
		Adder adder2 = (x, y) -> x - y;
		Adder adder3 = (double x, double y) -> x + y;
		Joiner joiner = (x, y) -> x + y;
		
		test(adder1);
		test(adder2);
		test(adder3);
		
		test(joiner);
		
		test((double x, double y)->x+y);
		test((double x, double y)->x-y);
		test((String x, String y)->x+y);
		test((Adder)(x, y)->x+y);
		test((Joiner)(x, y)->x+y);
	}
	
	public static void test(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public static void test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1,s2);
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");
		}
}

