package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	List<String> hex = Arrays.asList("30","8", "3A", "FF");
    	
    	Collections.sort(hex);
    	
    	int x = Collections.binarySearch(hex, "8");
    	int y = Collections.binarySearch(hex, "3A");
    	int z = Collections.binarySearch(hex, "4F");
    	
    	System.out.println(x + " " + y + " " + z);
    	
    	
    	List<Integer> numbers = Arrays.asList(30, 8, 3, 9);
    	
    	Collections.sort(numbers);
    	
    	x = Collections.binarySearch(numbers, 8);
    	y = Collections.binarySearch(numbers, 3);
    	z = Collections.binarySearch(numbers, 4);
    	
    	System.out.println(x + " " + y + " " + z);
    	
    }

}
