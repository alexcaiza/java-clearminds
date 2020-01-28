package com.incremental;

public class TestIncremento {
	
	public static void main(String[] args) {
		int x = 10;
		int z = x++ + x;
		
		System.out.println("x: " + x); //10
		System.out.println("z: " + z);//11
		
		//x++ post incremental (Sigue valiendo)
		//x++ pre incremental
		
		int p = 10;
		int q = ++p;
		
		System.out.println("x: " + p); //11
		System.out.println("z: " + q); //11
	}

}
