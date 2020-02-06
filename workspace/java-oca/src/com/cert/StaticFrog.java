package com.cert;

public class StaticFrog {

	static int frogCount = 0; // Declare and initialize
	// static variable

	public StaticFrog() {
		frogCount += 1; // Modify the value in the constructor
	}

	public static void main(String[] args) {
		new StaticFrog();
		new StaticFrog();
		new StaticFrog();
		System.out.println("Frog count is now " + frogCount);
	}
}
