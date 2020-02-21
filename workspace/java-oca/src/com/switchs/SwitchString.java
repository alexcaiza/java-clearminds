package com.switchs;

public class SwitchString {
	
	public static void main(String[] args) {
	
		final String a = "a";
		final String b = "b";
		final String c = "c";
		final String d = "d";
		
		String op = "";
		
		switch (op) {
			case a:
				System.out.println("A");
			case b:
				System.out.println("B");
			case c:
				System.out.println("C"); break;
			case d:
				System.out.println("D"); break;
			case "1":
				System.out.println("1"); break;
		}
		
	}

}
