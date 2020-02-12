package com.strings;

public class StringConcat2 {
    
    public static void main(String[] args) {
        
        
        String s = "a";
        
        s += 1;
        
        s.concat(s);
        s.concat(".");
        
        System.out.println(s);
    }

}
