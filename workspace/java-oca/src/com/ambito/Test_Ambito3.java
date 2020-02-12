package com.ambito;

public class Test_Ambito3 {
	
	private boolean b;
	
	public static void main(String[] args) {
		
	    String tree = "pine";
	    
	    int count = 0;
	    
	    if (tree.equals(count)) {
	        System.out.println("SI String.equals(int)");
	    } else {
	        System.out.println("NO String.equals(int)");
	    }
	    
	    if (tree.equals("pine")) {
            System.out.println("SI tree.equals(\"pine\")");
            
            int height = 55;
            count = count + 1;
            
        } else {
            System.out.println("NO tree.equals(\"pine\")");
        }
	    
	    System.out.println(height +  count);
        
	    
	}

}
