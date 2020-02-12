package com.ambito;

public class Test_Ambito_Corchetes1 {
    
    public static void main(String[] args) {

        {
            // La variable x tiene alcance dentro
            // los corchetes
            int x = 10;
            System.out.println(x);
        }
         
        // La línea de código comentada debajo produciría
        // error ya que la variable x está fuera del alcance.
 
        System.out.println(x); 
    }

}
