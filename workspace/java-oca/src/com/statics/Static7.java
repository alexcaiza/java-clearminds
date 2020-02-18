package com.statics;

public class Static7 {
	
	public Static7() {
	    System.out.println("No params");
	}
	
	public Static7(int j) {
        System.out.println("Param: " +  j);
    }
	
	public static void main(String[] args) {
	    Static7 t = new Static7(3);
    }
}
