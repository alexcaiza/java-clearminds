package com.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String[] names = {"Tom", "Dick", "Harry"};
        
    	List<String> list = Arrays.asList(names);
    	
    	list.set(0, "Sue");
        
        System.out.println("names[0]: " + names[0]);
        
        System.out.println("names: " + names);
        
        System.out.println("list: " + list);
        
        names[0] = "Alex";
        
        System.out.println("names[0]: " + names[0]);
        
        System.out.println("names: " + names);
        
        System.out.println("list: " + list);
        
        

    }

}
