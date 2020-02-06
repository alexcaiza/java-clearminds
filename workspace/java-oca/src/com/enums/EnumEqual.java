package com.enums;

public class EnumEqual {

	enum Color {
		RED, BLUE
	} // ; is optional

	public static void main(String[] args) {

		Color c1 = Color.RED;
		Color c2 = Color.RED;
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		
		if (c1 == c2) {
			System.out.println("==");
		}
		if (c1.equals(c2)) {
			System.out.println("dot equals");
		}

	}

}
