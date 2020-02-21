package com.strings;

public class CCMask {

	public static String maskCC(String card){
		String x="XXXX-XXXX-XXXX-";
		//A. 
		/*
		StringBuilder sb=new StringBuilder(card);
		sb.substring(15,19);
		return x+sb;
		//B.		
		return x+card.substring(15,19);
		*/
		
		//C. 
		StringBuilder sb=new StringBuilder(x);
		sb.append(card,15,19);
		return sb.toString();
		/*
		//D. 
		StringBuilder sb=new StringBuilder(card);
		StringBuilder s=sb.insert(0,x);
		return s.toString();
		*/
	} 
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-7241-5900"));
	}

}
