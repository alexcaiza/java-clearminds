package com.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaRemoveIf {

    public static void main(String[] args) {
        
    	List<Integer> numbers = new ArrayList<Integer>();
    	
    	numbers.add(100);    	
    	numbers.add(200);
    	numbers.add(300);
    	numbers.add(151);
    	numbers.add(250);
    	numbers.add(53);
    	
    	System.out.println("Antes de removeIf");
    	for (Integer i : numbers) {
            System.out.println(i);
        }
    	
    	numbers.removeIf(n -> (n%2==0));
    	
    	System.out.println("Despues de removeIf");
        for (Integer i : numbers) {
        	System.out.println(i);
        }
        
        System.out.println("");
        
        for (int i : numbers) {
        	System.out.println(i);
        }
    }

}
