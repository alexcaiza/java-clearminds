package com.stringbuilders;

public class StringBuilder_Insert {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Programacion");
		
		int posIni = sb.length();
		
		try {			
			sb.insert(posIni, " Java");
			
			System.out.println("sb: " + sb);
			
			posIni = sb.length();
			sb.insert(posIni, " 8");
			
			System.out.println("sb: " + sb);
			
			posIni = sb.length();
			sb.insert(posIni, 9);
			System.out.println("sb: " + sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
