package com.interfaces;

interface HasTail {
	int getTailLength();
}

abstract class Puma implements HasTail {
	/*
	public int getTailLength() {
		return 4;
	}
	*/
}

public class Cougar extends Puma {

	public static void main(String[] args) {
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}

	private int getTailLength(int length) {
		return 2;
	}
	
	private int getTailLength() {
		return 2;
	}

}
