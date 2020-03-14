package com.lambdas;

public class StringToIntMapperTest {
	public static void main(String[] args) {
		
		StringToIntMapper mapper = (String str) -> str.length();
		
		StringToIntMapper mapper2 = (str) -> {return str.length();};
		
		int length = mapper.map("Alex");
		int length2 = mapper2.map("Caiza");
		
		System.out.println("length1: " + length);
		System.out.println("length2: " + length2);

	}
}
