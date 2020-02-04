package com.lambdas;

public class LambdaPredicados {
    
    public static void main(String[] args) {
        
        /**
            Se trata de expresiones que aceptan un parámetro y devuelven un valor lógico.
         */
        
        String message -> message.length > 50
        
        /**
            Como en los casos anteriores, se pueden tener BiPredicados, predicados que en lugar de tener un parámetro, tienen dos.
         */
        (path, attr) -> String.valueOf(path).endsWith(".js") && attr.size() > 1024

        
    }
    
    

}
