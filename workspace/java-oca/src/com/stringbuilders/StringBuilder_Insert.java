package com.stringbuilders;

public class StringBuilder_Insert {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Programacion");
		
		int posIni = 0;
		
		
		
		try {			
			sb.insert(posIni, " Java");
			
			System.out.println("sb: " + sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
