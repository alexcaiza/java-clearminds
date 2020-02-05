package com.cert;

public class ForAmbitoVariables {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++)
			System.out.print(i + " ");
			//System.out.println(i);
		//Error de compilacion i es una variable del ambito del for
		
		System.out.println("");
		
		for (int i = 0; i < 20; i++)
			System.out.print(i + " ");
		int i = 15;
		System.out.print(i + " ");
	}

}
