package com.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        /*
         * En el siguiente código utilizamos una lambda para procesar valores, 
         * a través de un consumidor, que concatena los valores enteros que se obtienen del mapa.
         */
        
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("A", 1);
        map.put("B", 10);
        map.put("C", 20);
        map.put("D", 30);
        
        StringBuilder stringBuilder = new StringBuilder();
        
        map.forEach((letter, number) -> stringBuilder.append(letter.concat(String.valueOf(number))));
        
        System.out.println(stringBuilder.toString());
    }

}
