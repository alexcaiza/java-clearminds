package com.arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InicializacionArrayList {
    
    /**
     var-args hacia a dentro es un arreglo
     ventajas: 
       se le puede pasar un arreglo o se le puede pasar los elementos separados por coma, y metodo construye el arreglo
       no se necesita crear el arreglo
     */
    
    public static void main(String[] args) {
        
        Integer[] arreglo = {4, 5, 6};
        
        List<Integer>  enteros = new ArrayList<>(Arrays.asList(arreglo));
        
        enteros.add(3);
        
        System.out.println("Enteros: " + enteros);
        
        enteros.removeIf(p -> p>4);
        
        System.out.println("Enteros: " + enteros);
        
        System.out.println(enteros.size());
    }
    

}
