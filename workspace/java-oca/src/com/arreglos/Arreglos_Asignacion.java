package com.arreglos;

public class Arreglos_Asignacion {
    
    public static void main(String[] args) {
        
        int[] arrayInt;
        int[] multiDimArr[];
        arrayInt = new int[5]; //valid
        arrayInt = new int[2*5]; //valid
        arrayInt = new int[2.67]; //invalid
        multiDimArr = new int[5][6]; //valid
        multiDimArr = new int[5][]; //valid
        mutliDimArr = new int[][5]; //compilation fails
        multiDimArr = new int[7]; //invalid
        
        arrayInt = new int[] {};
    }

}
