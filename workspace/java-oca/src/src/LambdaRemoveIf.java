package src;

import java.util.ArrayList;
import java.util.List;

public class LambdaRemoveIf {

    public static void main(String[] args) {
        
    	List<Integer> numbers = new ArrayList<Integer>();
    	
    	numbers.add(100);    	
    	numbers.add(200);
    	numbers.add(300);
    	numbers.add(151);
    	numbers.add(250);
    	numbers.add(53);
    	
    	numbers.removeIf(n -> (n%2==0));
    	
        for (Integer i : numbers) {
        	System.out.println(i);
        }
        
        for (int i : numbers) {
        	System.out.println(i);
        }
        
        List<String> list = new ArrayList<String>();
        
        //list.removeIf(s -> {s.isEmpty();});
        
        list.removeIf((String s) -> s.isEmpty());
        
        list.removeIf(s -> s.isEmpty());
        

    }

}
