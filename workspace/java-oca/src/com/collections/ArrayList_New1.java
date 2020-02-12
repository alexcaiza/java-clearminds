package com.collections;

import java.util.ArrayList;

public class ArrayList_New1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Integer> list = new ArrayList<>(1);
    	
    	list.add(1001);
    	list.add(1002);
    	list.add(1003);
    	list.add(1004);
    	list.add(1005);
    	
    	System.out.println(list.get(list.size()));

    }

}
