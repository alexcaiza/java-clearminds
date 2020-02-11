package com.ambito;

public class Test_Ambito_Corchetes3 {
    
    public int x1;
    public int x2;
    public int x3;
    
    public static final void main(String[] args) {
        {
            int x = 5;
            {
                int x1 = 10;
                System.out.println(x);
            }
        }
    }

}
