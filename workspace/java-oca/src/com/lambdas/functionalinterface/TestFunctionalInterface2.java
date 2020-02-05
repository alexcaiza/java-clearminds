package com.lambdas.functionalinterface;

interface Secret {
    String magic(double d);
}

class MySecret implements Secret {
    public String magic(double d) {
        return "Prof";
    }

}

public class TestFunctionalInterface2 {

}
