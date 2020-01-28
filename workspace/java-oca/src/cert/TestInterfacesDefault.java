package cert;

interface Aquatic{
	 public default int getNumberOfGills(int input) {return 2;}
}

public class TestInterfacesDefault implements Aquatic {
	
	public String getNumberOfGills() {return "4";}
	
	//public String gerNumberOfGills(int input) {return "6";}

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	System.out.println(new TestInterfacesDefault().getNumberOfGills(-1));
    	System.out.println(new TestInterfacesDefault().getNumberOfGills());

    }

}
