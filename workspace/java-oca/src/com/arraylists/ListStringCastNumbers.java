package com.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ListStringCastNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<String> list = new ArrayList<>();
        
        list.add("one");
        list.add("two");
        list.add(7);
        list.add(null);
        
        for (String item: list) {
        	System.out.println("" + item);
        }
        

    }

}
