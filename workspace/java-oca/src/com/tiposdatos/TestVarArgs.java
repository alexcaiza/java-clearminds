package com.tiposdatos;

public class TestVarArgs {
	
	public static void main1(String[] args) {
		 System.out.println("String[]: " + args);
		 System.out.println("String[].length: " + args.length);
	}
	
	public static void main(String... args) {
        System.out.println("String[]: " + args);
        System.out.println("String[].length: " + args.length);
   }

}
