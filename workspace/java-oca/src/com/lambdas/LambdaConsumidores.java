package com.lambdas;

public class LambdaConsumidores {
    
    public static void main(String[] args) {
        
        //Se trata de aquellas expresiones lambda que aceptan un solo valor y no devuelven valor alguno.
        
        (String message) -> System.out.println(message);
        
        //Las expresiones BiConsumidoras, un caso especial de las expresiones consumidoras, 
        // son aquellas que toman dos valores como parámetro y no devuelven resultado.
        
        (String key, String value) -> System.out.println("Key: %s, value: %s%n", key, value);
        
    }
    
    

}
