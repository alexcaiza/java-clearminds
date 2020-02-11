package com.ambito;

public class Test_Ambito_Corchetes2 {
    
    public int x1;
    public int x2;
    public int x3;
    
    public static void main(String[] args) {
        
        // La variable x1 tiene alcance dentro los corchetes
        int x1 = 3;

        {
            // La variable x2 tiene alcance dentro los corchetes
            int x2 = 7;
            
            System.out.println("x1:" + x1);
            System.out.println("x2:" + x2);
            
            {
             
                // La variable x3 tiene alcance dentro los corchetes
                int x3 = x1 + x2;
                
                System.out.println("x3:" + x3);
            }
        }
         
         
    }

}
