package com.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo4 {

    public static void main(String[] args) {
        
        List<Camisa> lista = Camisa.getListaCamisas();
        
        List<Camisa> sub;
        
        sub = lista.stream().filter(item -> item.talla.equals("m")).collect(Collectors.toList());
        
        System.out.println("Camisas talla m:");
        sub.stream().forEach(item -> System.out.println(item));
        
        
        sub = lista.stream().filter(item -> item.talla.equals("xs")).collect(Collectors.toList());
        
        System.out.println("Camisas talla xs:");
        sub.stream().forEach(System.out::println);
        
        sub = lista.stream().filter(item -> item.color.equals("NEGRO")).collect(Collectors.toList());
        
        System.out.println("Camisas color negro:");
        sub.stream().forEach(item -> {System.out.println(item);});
        
    }
    
    

}
