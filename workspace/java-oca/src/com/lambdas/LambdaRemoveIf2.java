package com.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaRemoveIf2 {

    public static void main(String[] args) {
        
    	List<String> list = new ArrayList<String>();
        
        //list.removeIf(s -> {s.isEmpty();});
    	
    	//list.removeIf(String s -> s.isEmpty()); // No compila Declaracion String s
        
        list.removeIf((String s) -> s.isEmpty());
        
        list.removeIf(s -> s.isEmpty());
        
        list.removeIf(s -> {return s.isEmpty();});
        
        

    }

}
