package com.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {

    public static void main(String[] args) {
        
    	List<String> lista = new ArrayList<String>();
    	
    	lista.add("Alex");    	
    	lista.add("Julian");
    	lista.add("Cristina");
    	lista.add("Maria");
    	lista.add("Martha");
    	
    	System.out.println("Antes de removeIf");
    	for (String i : lista) {
            System.out.println(i);
        }
    	
    	lista.removeIf((n) -> (n.equals("Martha") || n.equals("Maria")));
    	
    	System.out.println("");
    	System.out.println("Despues de removeIf");
    	
        for (String i : lista) {
        	System.out.println(i);
        }
        
        lista.stream().findFirst(element -> element == "Julian")
        .ifPresent(System.out::println);
    }

}
