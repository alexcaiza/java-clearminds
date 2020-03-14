package com.arraylists;

import java.util.ArrayList;

public class ArrayList1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList list = new ArrayList(1);
    	
    	list.add(5);
    	list.add("A");
    	list.add(new Integer(5));
    	
        System.out.println("list: " + list);

    }

}
