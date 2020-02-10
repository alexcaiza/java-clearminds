package com.stringbuilders;

public class StringBuilder_Substring {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Programacion");
		
		int posIni = 0;
		int posFin = 300;
		
		String sub;
		
		
		try {			
			sub = sb.substring(posIni, posFin);
			
			System.out.println("sb: " + sb);
			System.out.println("sub: " + sub);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
