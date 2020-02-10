package com.stringbuilders;

public class StringBuilder_Delete {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Programacion");
		
		int posIni = 5;
		int posFin = 4;
		
		
		try {			
			sb.delete(posIni, posFin);
			
			System.out.println("sb: " + sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
