package com.stringbuilders;

public class StringBuilders3 {
	
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String a1 = "AlexRaulCaizaMorillo";
        String a2 = "AlexRaulCaizaMorillo";
        
        String a3 = "AlexRaul";
        String a4 = "CaizaMorillo";
        
        String a5 = a3 + a4;
        
        String a6 = a5;
        
    	if (a1 == a2) {
    	    System.out.println("SI a1 == a2");
    	} else {
    	    System.err.println("NO a1 == a2");
    	}
    	
    	if (a1.equals(a2)) {
            System.out.println("SI a1.equals(a2)");
        } else {
            System.err.println("NO a1.equals(a2)");
        }
    	
    	if (a5 == a1) {
            System.out.println("SI a5 == a1");
        } else {
            System.err.println("NO a5 == a1");
        }
        
        if (a5.equals(a1)) {
            System.out.println("SI a5.equals(a1)");
        } else {
            System.err.println("NO a5.equals(a1)");
        }
        
        if (a5.equals(a1)) {
            System.out.println("SI a5.equals(a1)");
        } else {
            System.err.println("NO a5.equals(a1)");
        }
        
        if (a6 == a5) {
            System.out.println("SI a6 == a5");
        } else {
            System.err.println("NO a6 == a5");
        }
    	
    }

}
