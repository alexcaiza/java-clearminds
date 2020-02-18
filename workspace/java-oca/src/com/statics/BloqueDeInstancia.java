package com.statics;

public class BloqueDeInstancia {
	int a;
	int b=10;
	static int c;
	
	static {
	    System.out.println("bloque static");
	}
	
    {
        System.out.println("bloque instancia 1");
        a = 10;
       // System.out.println("a: " + a);
    }
    {
        System.out.println("bloque instancia 2");
        b += 10;
        //System.out.println("b: " + b);
    }
    
    public BloqueDeInstancia() {
        System.out.println("Constructor");
        a=5;
        //System.out.println("a:"+a+" b:"+b);
    }
    
    @Override
    public String toString() {
        return "a:"+a+" b:"+b;
    }
    
    public static void main(String[] args) {
        
        BloqueDeInstancia b = new BloqueDeInstancia();
        
        System.out.println(b);
    }
    
}
