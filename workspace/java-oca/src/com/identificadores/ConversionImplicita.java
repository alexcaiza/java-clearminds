package com.identificadores;

public class ConversionImplicita {
	
	
	
	public static void main(String[] args) {
		int a = 10;
		char c1 = (char)a;
		char c2 = 10;
		
		float r = 3.4f;
		double d = r;
		
		long l = (long)r;
		
		int i = c2;
		
		c2 = (char)i;
		
		byte b = (byte)1000;
		System.out.println("b" + b);
	}

}
