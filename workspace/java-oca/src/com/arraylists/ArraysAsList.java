package com.arraylists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAsList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	List<Integer> list = Arrays.asList(10, 4, -1, 5);
        
        Collections.sort(list);
        
        Integer array[] = list.toArray(new Integer[0]);
        
        System.out.println(array[0]);
        
        System.out.println("list: " + list);

    }

}
