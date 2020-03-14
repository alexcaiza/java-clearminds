package com.stringbuilders;

public class StringBuilder_Replace {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("0123456789");
		
		int posIni = 1;
		int posFin = 100;
		
		String sub = "java";
		
		try {			
			sb.replace(posIni, posFin, sub);
			
			System.out.println("sb: " + sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
