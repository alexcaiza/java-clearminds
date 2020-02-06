package com.strings.stringbuilders;

public class StringBuilder1 {
	
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer(5);
		
		System.out.println("b:" + b);
		
		String  s = "";
		
		if (b.equals(s)) {
			System.out.println("Match 1");
		} else if (s.toString().equals(s)) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
	}

}
