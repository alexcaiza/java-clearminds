package com.arraylists;

import java.util.ArrayList;

public class ArrayList_Remove_Posicion {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	list.add(0);
    	list.add(9);
    	list.add(10);
    	list.add(20);
    	list.add(30);
    	list.add(40);
    	list.add(50);
        
    	System.out.println("list: " + list);
                
        int remove_object = list.remove(1);
        
        System.out.println("list: " + list);
        System.out.println("bool_remove_object: " + remove_object);

    }

}
