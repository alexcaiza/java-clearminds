package com.ambito;

public class Test_Tolls_Static {
	
    private static int yesterday = 1;
    
    int tomorrow = 10;
	
	public static void main(String[] args) {
		
	    Test_Tolls_Static tolls = new Test_Tolls_Static();
	    
	    int today=20, tomorrow = 40;
	    
	    System.out.print(today + tolls.tomorrow + tolls.yesterday);
        
	    
	}

}
