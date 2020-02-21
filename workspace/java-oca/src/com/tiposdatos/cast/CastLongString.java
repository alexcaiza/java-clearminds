package com.tiposdatos.cast;

public class CastLongString {

	public static void main(String[] args){
		Short a=100;
		Integer b=300;
		Long c=(long)a+b; //line 1
		String d=(String)(c*b); //line 2
		System.out.println("Result: "+d);
	}

}
