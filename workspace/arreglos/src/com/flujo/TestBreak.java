package com.flujo;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers [] = {4,5,6,7};
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				break;
			}
			System.err.println(numbers[i]);
		}
		
		System.err.println(" ");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				continue;
			}
			System.err.println(numbers[i]);
		}
		
		/**
		  break bota del for mas interno;
		  continue no bota del for; salta a la siguente iteracion no hace lo que este adebajo
		  se ejecuta donde esta el continue
		 */
		

	}

}
