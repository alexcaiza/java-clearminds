package com.interfaces.defaults;

public interface SaludoMañanaInterface {
    default void saludo() { 
        System.out.println("Buenos días");
    }
}
