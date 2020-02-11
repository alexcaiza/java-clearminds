package com.interfaces;

public interface InterfacePublicAbstract {
	
	public int a = 0;
	public static int b = 0;
	public final int c = 0;
	public static final int f = 0;
	

	public int calcularNumero();
	public abstract int calcularNumero(int a);
	
	public  int calcularNumero2(int a);
	
	public static int metodo1() {
		return 0;
	}
	
	default int metodo2() {
        return 0;
    }
}

class C1{
	
}

abstract class C2 {
	
}

class C3 {
	
}

