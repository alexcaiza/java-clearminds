package com.arrays.listas;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<Integer> ages = new ArrayList<>();
        
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        
        for (int age: ages) {
        	System.out.println("" + age);
        }
        

    }

}
