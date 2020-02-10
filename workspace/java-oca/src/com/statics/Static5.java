package com.statics;

public class Static5 {
	
	String seq = "c";
	
	//static{seq += "g";}
	
	{seq += "z";}

	public static void main(String[] x) {
		Static5 c1 = new Static5();
		Static5 c2 = new Static5();
		System.out.println(c1.seq);
	}
	

}
