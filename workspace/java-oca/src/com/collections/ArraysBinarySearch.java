package com.collections;

import java.util.Arrays;

public class ArraysBinarySearch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	//int[] randon = {-4, -3, 0, 12, 100, 200, 300, 400, 500, 600, 700, 800}; 
    	int[] randon = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10, 11, 12, 13};
    	
    	int x = 5;
    	int y = Arrays.binarySearch(randon, x);
    	
    	System.out.println(y);

    }

}
