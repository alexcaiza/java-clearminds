package com.stringbuilders;

public class StringBuildersDelete {
	
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	StringBuilder sb =  new StringBuilder();
    	
    	sb.append("0123456").append("7890");
    	
    	System.out.println("sb:" + sb);
    	
    	try {
        	sb.delete(3, 100);    	
        	System.out.println("sb.delete(3, 100): " + sb);
    	} catch (Exception e) {
            e.printStackTrace();
        }
    	
    	try {
    	    sb.delete(0, 200);      
            System.out.println("sb.delete(0, 200): " + sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    	sb.append("0123456").append("7890");
    	
    	try {
            sb.delete(3, 1);      
            System.out.println("sb.delete(3, 1): " + sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        
        try {
            sb.delete(3, 3);      
            System.out.println("sb.delete(3, 3): " + sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
           
    	
    	
    }

}
