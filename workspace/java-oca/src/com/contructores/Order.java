package com.contructores;

public class Order {
    
    String value = "t";
    
    {
        value += "a";
    }
    
    {
        value += "c";
    }
    
    private Order() {
        value += "b";
    }
    
    private Order(String s) {
        value += s;
    }
    
    public static void main(String[] args) {
        Order obj = new Order("f");
        obj = new Order();
        System.out.println(obj.value);
    }
}
