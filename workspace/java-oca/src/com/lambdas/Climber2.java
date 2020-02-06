package com.lambdas;

import com.lambdas.functionalinterface.Climb;

interface Climb {
	boolean isTooHigh(int height, int limit);
}

public class Climber2 {
	
	public static void main(String[] args) {
        
    	check((h, l) -> h.append(l).isEmpty(), 5);
		
		// Da error en h.append(l)
    	
    }
    
    public static void check(Climb climb, int height) {
        
    	if (climb.isTooHigh(height, 10))
    		System.out.println("too high");
    	else 
    		System.out.println("Ok");
    }

}
