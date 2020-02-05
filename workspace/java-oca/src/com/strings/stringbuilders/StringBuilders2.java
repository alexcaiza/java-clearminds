package com.strings.stringbuilders;

public class StringBuilders2 {
	
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String s1 = "Java";
        String s2 = "Java";
        
    	StringBuilder sb =  new StringBuilder();
    	
    	sb.append("Ja").append("va");
    	
    	if (s1 == s2) {
    	    System.out.println("SI s1 == s2");
    	}
    	
    	if (s1.equals(s2)) {
            System.out.println("SI s1.equals(s2)");
        }
    	
    	if (sb.toString() == s1) {
            System.out.println("SI s1.toString() == s1");
        }
    	
    	if (sb.toString().equals(s1)) {
            System.out.println("SI sb.toString().equals(s1)");
        }
    }

}
