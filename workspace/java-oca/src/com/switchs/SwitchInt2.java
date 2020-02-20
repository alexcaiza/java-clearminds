package com.switchs;

public class SwitchInt2 {
	
	public static void main(String[] args) {
	
		final int j = 3;
		
		//j=2;
		
		int x = 0;
		
		switch (x) {
			case 0:
				System.out.println("0");
			case 1:
				System.out.println("1"); break;
			case 2:
				System.out.println("2"); break;
			case j:
				System.out.println("j"); break;
			
		}
		
	}

}
