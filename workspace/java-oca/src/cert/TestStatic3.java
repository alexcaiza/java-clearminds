package cert;

class Order31 {
    
	String value = "t"; 
	
	public Order31() {
		value += "b";
	}
	
	{value += "a";}
	{value += "c";}
	
	public Order31(String s) {
		value += s;
	}
    
    public static void main(String[] args) {
    	Order31 order = new Order31("f");
    	order = new Order31();
    	System.out.println(order.value);
    }
}


public class TestStatic3 {
	
	

}
