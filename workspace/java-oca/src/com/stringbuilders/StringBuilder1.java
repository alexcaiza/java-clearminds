package com.stringbuilders;

public class StringBuilder1 {
	
	public static void main(String[] args) {
	    
		StringBuffer sb = new StringBuffer(5);
		
		System.out.println("sb:" + sb);
		
		String  str = "";
		
		if (sb.equals(str)) {
			System.out.println("Match 1");
		} else if (str.toString().equals(str)) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
	}

}
