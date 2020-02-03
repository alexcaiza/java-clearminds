class ValueTest {
	public static void main (String [] args) {
	int a = 10; // Assign a value to a
	System.out.println("a = " + a);
	int b = a;
	b = 30; //Aunque modifiqué b, a no cambia
	System.out.println("a = " + a + " after change to b");
	}
	
}