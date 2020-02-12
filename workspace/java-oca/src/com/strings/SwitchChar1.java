package com.strings;

public class SwitchChar1 {

	public static void main(String[] args) {
		
		final char a = 'A', d= 'D';
		
		char grade = 'B';
		
		switch (grade) {
            case a: System.out.println("great A");
            case 'B': System.out.println("great B");
            case 'C': System.out.println("good C"); break;
            case d:
            case 'F': System.out.println("good F");
        }
	}

}
