package com.arreglos;

public class VarArgs {
    
    /**
     var-args hacia a dentro es un arreglo
     ventajas: 
       se le puede pasar un arreglo o se le puede pasar los elementos separados por coma, y metodo construye el arreglo
       no se necesita crear el arreglo
     */
    
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3};
        
        int suma1 = sumar(numeros);
        
        System.out.println("suma1: " + suma1);
        
        int suma2 = sumar(1, 1, 3);
        
        System.out.println("suma2: " + suma2);
    }
    
    public static int sumar(int ... arreglo) {
        int suma = 0;
        
        for (int a: arreglo) {
            suma += a;
        }
        
        return suma;
    }

}
