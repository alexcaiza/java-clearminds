package com.strings;

public class StringLength {
    
    private static final String TEMPLATE = "{a1: \"%s\", a2: \"%s\"}";
    
    public static void main(String[] args) {
        
        String a1 = "Alex";
        
        System.out.println(String.format(TEMPLATE, a1, a1.length()));
    }

}
