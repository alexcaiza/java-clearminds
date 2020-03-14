package com.arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInstanceOf {
    
    
    public static void main(String[] args) {
        
        Integer[] arreglo = {4, 5, 6};
        
        System.out.println(arreglo instanceof Object);
        System.out.println(arreglo instanceof Integer[]);
        System.out.println(arreglo instanceof Object[]);
    }
    

}
