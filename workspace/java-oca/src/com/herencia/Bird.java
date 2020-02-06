package com.herencia;

public abstract class Bird {
	
	private void fly() {
		System.out.println("Bird is flying");		
	}
	
	public static void main(String[] args) {
		
		Bird bird  = new Pelican();
		bird.fly();
		
		Pelican pelican  = new Pelican();
		pelican.fly();
	}
}

class Pelican extends Bird {
	protected void fly() {
		System.out.println("Pelican is flying");
	}
}

class TestBird {
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		//Bird bird  = new Pelican();
		//bird.fly();
=======
		Bird bird  = new Pelican();
		bird.fly();
>>>>>>> branch 'master' of git@github.com:alexcaiza/java-clearminds.git
		
		//Pelican pelican  = new Pelican();
		//pelican.fly();
	}
}


