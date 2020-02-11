package com.contructores;

public class Egret {
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
    }
}
