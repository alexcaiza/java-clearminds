package com.lambdas;

import java.io.File;

public class LambdaReferenciaMetodos {
    
    public static void main(String[] args) {
        
        /**
            Las referencias a los métodos nos permiten reutilizar un método como expresión lambda. 
            Para hacer uso de las referencias a métodos basta con utilizar la siguiente sintáxis: 
            referenciaObjetivo::nombreDelMetodo.
         */
        
        File::canRead // en lugar de File f -> f.canRead();
        
        /**
            Con las referencias a los métodos se ofrece una anotación más rápida para expresiones lambda simples y existen 3 tipos diferentes:

            Métodos estáticos.
            Métodos de instancia de un tipo.
            Métodos de instancia de un objeto existente.
         */
        
        /*
         * Ejemplo de uso con método estático:
         */
        (String info) -> System.out.println(info) // Expresión lambda sin referencias.
        System.out::println // Expresión lambda con referencia a método estático.
        
        /*
         * Ejemplo de uso con método de un tipo:
         */
        (Student student, int registryIndex) -> student.getRegistry(registryIndex) // Expresión lambda sin referencias.
        Student::getRegistry // Expresión lambda con referencia a método de un tipo.
        
        /*
         * Ejemplo de uso con método de un objeto existente:
         */
        Student student -> getMarks(student) // Expresión lambda sin referencias.
        this::getMarks // Expresión lambda con referencia a método de un objeto existente.
        

        
    }
    
    

}
