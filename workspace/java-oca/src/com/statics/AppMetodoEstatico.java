package com.statics;

public class AppMetodoEstatico {
	
	int count;
	
	public static void displayMsg(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		AppMetodoEstatico.displayMsg();
		AppMetodoEstatico.displayMsg();
    }
}
