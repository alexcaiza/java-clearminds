package com.flujo;

public class ArregloCampoNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numbers [];				
		numbers = new String[3];		
		System.err.println(" " + numbers[1]);
		
		System.err.println(" ");
		System.err.println(" ");
		
		
		int numbers2 [][] = {{5,4},{3,2}};
		
		for (int i = numbers2.length-1; i>=0; i--) {
			for (int z: numbers2[i]) {
				if (z == 3) {
					continue;
				}
				System.out.println(z);
			}
			
		}
		
		
	}

}
