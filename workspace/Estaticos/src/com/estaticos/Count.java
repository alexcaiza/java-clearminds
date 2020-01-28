package com.estaticos;

public class Count {
	
	int valor; //cada objeto
	static int valorStatic; //en la clase
	

	public void add() {
		valorStatic++;
		valor++;
		this.valorStatic++;
		this.valor++;
	}
	
	public static void agregar() {
		valorStatic++;
		//valor++;
		
		Count c = new Count();
		c.valor++;
	}

}
