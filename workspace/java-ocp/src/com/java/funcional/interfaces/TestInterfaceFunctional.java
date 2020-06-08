package com.java.funcional.interfaces;

public interface TestInterfaceFunctional {

	public void add();
	
	default String sayHi() {
		return "Hi";
	}
	
	static boolean isTrue() {
		return true;
	}
}
