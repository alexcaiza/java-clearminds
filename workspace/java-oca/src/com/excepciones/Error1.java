package com.excepciones;

public class Error1 {
    
    public static void main(String[] args) {
    	int a = 0;
    	try {
    		while(true) {
            	a++;
            }
		} catch (Exception e) {
			System.out.println("Excepcion");
		} catch (Error e) {
			System.out.println("Error");
		} catch (Throwable e) {
			System.out.println("Error");
		}
    }

}
