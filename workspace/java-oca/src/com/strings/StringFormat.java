package com.strings;

public class StringFormat {
    
    private static final String TEMPLATE = "{a1: \"%s\", a2: \"%s\"}";
    
    public static void main(String[] args) {
        String a1 = "Alex";
        String a2 = "Julian";
        System.out.println(String.format(TEMPLATE, a1, a2));
    }

}
