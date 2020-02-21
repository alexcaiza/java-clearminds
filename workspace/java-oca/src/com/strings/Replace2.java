package com.strings;

public class Replace2 {

	public static void main(String[] args) {
		String str="A ";
		str=str.concat("B ");
		String str2="C ";
		str=str.concat(str2);
		str.replace('C','D');
		str=str.concat(str2);
		System.out.println(str);
	}

}
