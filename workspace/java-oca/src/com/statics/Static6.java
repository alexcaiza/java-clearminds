package com.statics;

public class Static6 {
	
	int a;
	static int b;
	static {
	    b++;
	}
	Static6() {
	    while (a < 5) {
	        b++;
	        a++;
	    }
	}
	public static void main(String[] args) {
	    Static6 t1 = new Static6();
	    Static6 t2 = new Static6();
	    
	    System.out.println(t1.a + ":" + t2.b);
    }
}
