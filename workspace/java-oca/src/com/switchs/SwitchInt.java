package com.switchs;

public class SwitchInt {
	
	public static void main(String[] args) {
	
		final int j=20;// = 2;
		
		final int a = 10;
		
		//j=2;
		
		int x = 0;
		
		switch (x) {
			case 0:
				System.out.println("A");
			case 1:
				System.out.println("B"); break;
			case j:
				System.out.println("C"); break;
			case a:
				System.out.println("C"); break;
			
		}
		
	}

}
