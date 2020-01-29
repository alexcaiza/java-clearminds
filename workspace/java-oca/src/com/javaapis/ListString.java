package com.javaapis;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ListString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<String> one = new ArrayList<String>();
        
        one.add("abc");
        
        List<String> two = new ArrayList<String>();
        
        two.add("abc");
        
        if (one == two) {
            System.out.println("A");
        }
        else if (one.equals("abc")) {
            System.out.println("B1");
        }
        else if (one.equals(two)) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
        

    }

}
