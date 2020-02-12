package com.excepciones;

abstract class Planet{
	protected void resolve(){}
	abstract void rotate();
} 

class Earth extends Planet {
	protected void resolve(){}
	protected void rotate(){}
}


public class Test_Planet {
	
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
