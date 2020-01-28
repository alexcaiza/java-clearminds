package cert;

interface Secret {
	String magic(double d);
}

public class TestLambda1 implements Secret {
	
	public String magic(double d) {
		return "Poof";
	}

    public static void main(String[] args) {
        
    	TestLambda1 t = new TestLambda1();
    	
    	System.out.println(t.magic(10));
    	
    	//String s = String e -> "Poof";
    }

}
