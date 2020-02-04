package com.contructores;

public class PrivateContructor {
    int a = 0;
    private PrivateContructor() {}
    
    public static void main(String[] args) {
        PrivateContructor obj = new PrivateContructor();
        obj.a = 100;
        System.out.println(obj);
    }
}

class TestPrivateContructor {
    public static void main(String args[]) {
        PrivateContructor obj = new PrivateContructor();
        obj.a = 100;
        System.out.println(obj);
    }
}
