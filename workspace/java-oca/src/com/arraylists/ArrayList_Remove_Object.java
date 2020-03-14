package com.arraylists;

import java.util.ArrayList;

public class ArrayList_Remove_Object {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	list.add(0);
    	list.add(3);
    	list.add(9);
    	list.add(10);
    	list.add(20);
    	list.add(3);
    	list.add(30);
    	list.add(40);
    	list.add(50);
        
    	System.out.println("list: " + list);
                
        boolean bool_remove_object = list.remove(Integer.valueOf("3"));
        
        System.out.println("list: " + list);
        System.out.println("bool_remove_object: " + bool_remove_object);

    }

}
