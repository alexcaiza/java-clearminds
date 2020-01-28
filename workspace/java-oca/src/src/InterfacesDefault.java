package src;

interface Aquatic{
	 public default int getNumberOfGills(int input) {return 2;}
}

public class InterfacesDefault implements Aquatic {
	
	public String getNumberOfGills() {return "4";}
	
	//public String gerNumberOfGills(int input) {return "6";}

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	System.out.println(new InterfacesDefault().getNumberOfGills(-1));
    	System.out.println(new InterfacesDefault().getNumberOfGills());

    }

}
