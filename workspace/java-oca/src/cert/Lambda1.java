package src.cert;

interface Secret {
	String magic(double d);
}

public class Lambda1 implements Secret {
	
	public String magic(double d) {
		return "Poof";
	}

    public static void main(String[] args) {
        
    	Lambda1 t = new Lambda1();
    	
    	System.out.println(t.magic(10));
    	
    	//String s = String e -> "Poof";
    }

}
