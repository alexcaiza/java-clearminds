package com.arreglos;

import java.util.Arrays;
import java.util.List;

public class ArregloAsList {
    
    public static void main(String[] args) {
        
        String[] names = {"Tom", "Dick", "Harry"};
        
        List<String> list = names.asList(); //ERROR: compilacion un arreglo no tiene el metodo asList();
        
        list.set(0, "Sue");
        
        System.out.println("arreglo: " + names[0]);
        
        
    }

}
