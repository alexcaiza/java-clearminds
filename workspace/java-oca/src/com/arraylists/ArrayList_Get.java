package com.arraylists;

import java.util.ArrayList;

public class ArrayList_Get {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<String> list = new ArrayList<>();
    	
    	list.add("Alex");
    	list.add("Raul");
    	list.add("Julian");
    	list.add("Cristina");
    	
    	int pos = list.size();
    	
    	String str = list.get(pos);
        
        System.out.println("list: " + list);
        System.out.println("item: " + str);

    }

}
