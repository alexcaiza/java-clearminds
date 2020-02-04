package com.interfaces.defaults;

public interface SaludoTardeInterface {
    default void saludo(){ 
        System.out.println("Buenas tardes");
    }
}
