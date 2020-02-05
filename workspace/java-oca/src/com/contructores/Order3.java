package com.contructores;

public class Order3 {
    
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    
    {
        value3 = "f";
        // value1 = "d"; //The final field Order3.value1 cannot be assigned
        value2 = "e"; 
    }
    
    static {
        //value3 = "i"; //Cannot make a static reference to the non-static field value3
        value2 = "h";
        //value1 = "g"; //Cannot make a static reference to the non-static field value1
    }
    
    public static void main(String[] args) {
        Order3 obj = new Order3();
    }
}
