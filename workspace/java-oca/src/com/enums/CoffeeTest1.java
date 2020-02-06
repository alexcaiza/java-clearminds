package com.enums;

enum CoffeeSize {BIG, HUGE, OVERWHENLMING}

class Coffee1 {
	CoffeeSize size;
}

class Coffee2 {
	enum CoffeeSize {BIG, HUGE, OVERWHENLMING}
	CoffeeSize size;
}

public class CoffeeTest1 {
	
	public static void main(String[] args) {
		
		Coffee1 coffee1 = new Coffee1();
		coffee1.size = CoffeeSize.BIG;
		System.out.println("CoffeeSize.BIG: " + CoffeeSize.BIG);
		System.out.println("coffee1.size: " + coffee1.size);
		
		Coffee2 coffee2 = new Coffee2();
		coffee2.size = Coffee2.CoffeeSize.BIG;
		System.out.println("Coffee2.CoffeeSize.BIG: " + Coffee2.CoffeeSize.BIG);
		System.out.println("coffee2.size: " + coffee2.size);
		
		if (CoffeeSize.BIG.equals(Coffee2.CoffeeSize.BIG)) {
			System.out.println("SI CoffeeSize.BIG.equals(Coffee2.CoffeeSize.BIG)");
		} else {
			System.out.println("NO CoffeeSize.BIG.equals(Coffee2.CoffeeSize.BIG)");
		}
	}
	

}
