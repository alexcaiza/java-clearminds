package com.interfaces.defaults;

public class InterTest implements Inter1, Inter2 {
	
	@Override
	public void m() {
		Inter2.super.m();
	}

	public static void main(String[] args) {
		InterTest inter = new InterTest();
		inter.m();
		
		System.out.println("a:" + inter.a);
		System.out.println("b:" + inter.b);
	}

	
}
