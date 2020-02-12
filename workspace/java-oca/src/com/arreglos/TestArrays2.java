package com.arreglos;

public class TestArrays2 {
    
    public static void main(String[] args) {
    	
    	int n1 = 43;
    	int n2 = 053;
    	
    	if (n1 == n2) {
    		System.out.println("si iguales n1 n2");
    	} else {
    		System.out.println("no iguales n1 n2");
    	}
        
        int a[] = {1,2,053, 4};
        int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
        
        boolean r1 = a[3] == b[0][2];
        
        System.out.println(r1);
        
        boolean r2 = a[2] == b[2][1];
        
        System.out.println("" + (r2));
        
        
    }

}
