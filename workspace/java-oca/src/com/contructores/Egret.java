package com.contructores;

public class Egret {
<<<<<<< HEAD
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
=======
    private String color;
    
    public Egret() {
        Egret("White");
    }
    
    public Egret(String color) {
        color = color;
    }
    
    public void Egret() {
        
    }
    public void Egret(String color) {
        color = color;
    }
    
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println(e.color);
>>>>>>> e5f395e829830c913c335a0a76bf66b89031e1d5
    }
}
