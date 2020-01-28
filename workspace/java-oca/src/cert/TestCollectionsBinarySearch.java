package cert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollectionsBinarySearch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	//int[] randon = {-4, -3, 0, 12, 100, 200, 300, 400, 500, 600, 700, 800}; 
    	List<String> hex = Arrays.asList("30","8", "3A", "FF", "GG", "HH");
    	
    	Collections.sort(hex);
    	
    	int x = Collections.binarySearch(hex, "8");
    	int y = Collections.binarySearch(hex, "3A");
    	int z = Collections.binarySearch(hex, "4F");
    	
    	System.out.println(x + " " + y + " " + z);
    	
    	
    	List<Integer> numbers = Arrays.asList(30, 8, 3, 9);
    	
    	Collections.sort(numbers);
    	
    	x = Collections.binarySearch(numbers, 8);
    	y = Collections.binarySearch(numbers, 3);
    	z = Collections.binarySearch(numbers, 4);
    	
    	System.out.println(x + " " + y + " " + z);
    	
    	char c = '0';
    	
    	System.out.println("");
    	for (int i=0; i< 100; i++) {
    		System.out.println(c++);
    	}
    	
    	


    }

}
