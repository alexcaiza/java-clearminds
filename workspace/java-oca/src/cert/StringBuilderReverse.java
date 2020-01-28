package src.cert;



public class StringBuilderReverse {
	
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	
    	StringBuilder puzzle1 = new StringBuilder("Java");
    	
    	System.out.println("puzzle1: " + puzzle1);
    	
    	puzzle1.reverse();
    	
    	System.out.println("puzzle1.reverse(): " + puzzle1);
    	
    	//StringBuilder puzzle2 = new StringBuilder("Java");
    	//System.out.println("puzzle: " + puzzle2.append("vaJ$").delete(0, 3).deleteCharAt(puzzle2.length()));
    	
    	StringBuilder puzzle3 = new StringBuilder("Java");
    	System.out.println("puzzle3: " + puzzle3.append("vaJ$").substring(0, 4));
    	
    	StringBuilder puzzle4 = new StringBuilder("Java");
    	System.out.println("puzzle4: " + puzzle4.append("vaJ$").delete(0, 3).deleteCharAt(puzzle4.length()-1));
    	
    	StringBuilder puzzle5 = new StringBuilder("123456789");
    	System.out.println("puzzle5: " + puzzle5.delete(0, 3));
    	
    	StringBuilder puzzle6 = new StringBuilder("0123456789");
    	System.out.println("puzzle6: " + puzzle6.substring(0, 4));
    	
    	
        

    }

}
