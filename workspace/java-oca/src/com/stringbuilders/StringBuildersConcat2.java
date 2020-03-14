package com.stringbuilders;

public class StringBuildersConcat2 {
    
    public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("aaa ");
		StringBuilder sb2 = new StringBuilder("bbb ");
		
		String s = sb1.toString() + sb2;
		
		System.out.println(s);
				
	}

}
