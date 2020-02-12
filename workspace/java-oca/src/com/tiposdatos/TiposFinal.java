package com.tiposdatos;

public class TiposFinal {
	
	public static void main(String[] args) {
	
		String tiger = "Tiger";
		String lion = "Lion";
		
		final String statement = 200>300 ? lion : tiger = "is bigger";
		
		System.out.println("statement: " + statement);
		
	}

}
