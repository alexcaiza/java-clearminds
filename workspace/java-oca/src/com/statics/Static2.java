package com.statics;

class Order {
    static String result = "";
    {
        System.out.println("bloque 1 {}");
        result += "c"; 
    }
    static 
    { 
        System.out.println("bloque 2 {} static");
        result += "u"; 
    }
    { 
        System.out.println("bloque 3 {}");
        result += "r"; 
    }    
}


public class Static2 {

    public static void main(String[] args) {
        
        System.out.print(Order.result + " ");
        System.out.print(Order.result + " ");
        
        new Order();
        new Order();
        
        System.out.print(Order.result + " ");

    }

}
