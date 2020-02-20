package com.interfaces.defaults;

public interface Inter1 {
	int a = 100;
	public static int b = 200;
	default void m() {
		System.out.println("implementación por defecto 1");
	}
}
