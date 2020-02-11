package com.ambito;

public class Test1 {
    
    static int x = 11;
    private int y = 33;
    
    public void method1(int x) {
        Test1 t = new Test1();
        
        this.x = 22;
        y = 44;
        
        System.out.println("Test1.x: " + Test1.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }
    
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method1(5);
    }

}
