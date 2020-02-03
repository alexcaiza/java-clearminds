package com.semana1;

public class Casting2 {

	public static void main(String[] args) {
		long l = 130L;
		byte b = (byte)l;
		System.out.println("The byte is " + b);
		
		byte b1 = 127;
		int i1 = b1; 
		
		b1 = (byte) i1;
	}
}
