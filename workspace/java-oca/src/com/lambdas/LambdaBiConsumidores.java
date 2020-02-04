package com.lambdas;

public class LambdaBiConsumidores {
    
    public static void main(String[] args) {
        
        //Las expresiones BiConsumidoras, un caso especial de las expresiones consumidoras, 
        // son aquellas que toman dos valores como parámetro y no devuelven resultado.
        
        (String key, String value) -> System.out.println("Key: %s, value: %s%n", key, value);
        
    }
    
    

}
