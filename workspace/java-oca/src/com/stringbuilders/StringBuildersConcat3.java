package com.stringbuilders;

public class StringBuildersConcat3 {
    
    public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("alex ");
		
		String s = "julian";
		
		sb1.append(s, 0, s.length());
		
		System.out.println(sb1);
		
		sb1.substring(sb1.length()-1, sb1.length());
		
		System.out.println("sb1.capacity: " + sb1.capacity());
		
				
	}

}
