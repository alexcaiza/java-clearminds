package com.stringbuilders;

public class StringBuilder_Replace {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Programacion");
		
		int posIni = 0;
		int posFin = 3;
		
		String sub = "CIONES";
		
		
		try {			
			sb.replace(posIni, posFin, sub);
			
			System.out.println("sb: " + sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
