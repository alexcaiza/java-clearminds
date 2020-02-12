package com.excepciones;

public class Test_Try {
	
	public static void main(String[] args) {
		int a = 123;
		int b = 1;
		
		try {
			System.out.println(a/b);
			System.out.println("1");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally");
		}
	}

}
