package com.contructores;

public class Egret {
    int a = 0;
    private Egret() {}
    
    public static void main(String[] args) {
        Egret obj = new Egret();
        obj.a = 100;
        System.out.println(obj);
    }
}

class TestPrivateContructor {
    public static void main(String args[]) {
        Egret obj = new Egret();
        obj.a = 100;
        System.out.println(obj);
    }
}
