package com.cert;

import java.util.ArrayList;

public class ArrayListMetodos1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Integer> values = new ArrayList<Integer>();
        
    	values.add(4);
    	values.add(5);
    	values.set(1,6);
    	values.remove(0);
        
        for (Integer v : values) {
        	System.out.println(v);
		}
        
        

    }

}
