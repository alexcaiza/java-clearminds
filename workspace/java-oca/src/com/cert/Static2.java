package com.cert;

class Order {
    static String result = "";
    { result += "c"; }
    static 
    { result += "u"; }
    { result += "r"; }    
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