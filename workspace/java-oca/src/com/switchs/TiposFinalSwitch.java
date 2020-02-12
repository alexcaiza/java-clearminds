package com.switchs;

public class TiposFinalSwitch {
	
	public static void main(String[] args) {
	
		final int j;// = 2;
		
		int a = 0;
		
		j=2;
		
		int x = 0;
		
		switch (x) {
		case 0:
			System.out.println("A");
		case 1:
			System.out.println("B"); break;
		case j:
			System.out.println("C"); break;
		}
		
	}

}
