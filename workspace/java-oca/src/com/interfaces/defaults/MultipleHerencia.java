package com.interfaces.defaults;

public class MultipleHerencia implements  SaludoMañanaInterface, SaludoTardeInterface {

    @Override
    public void saludo() {
        // TODO Auto-generated method stub
        SaludoMañanaInterface.super.saludo();
    }

}
