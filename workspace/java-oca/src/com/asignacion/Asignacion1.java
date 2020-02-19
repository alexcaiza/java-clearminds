package com.asignacion;

public class Asignacion1 {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int res1 = x = y = 20;
		int res2 = x+= y-4;
		
		System.out.println("res1:" + res1 + " res2:" + res2 + " y:"+y);
	}

}
