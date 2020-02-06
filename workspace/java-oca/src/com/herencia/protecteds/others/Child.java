package com.herencia.protecteds.others;

import com.herencia.protecteds.Parent;

public class Child extends Parent {

	public void testIt() {
		System.out.println("x is " + this.x);
		
		Parent p = new Parent();
		p.x = 0;
				
	}
}
