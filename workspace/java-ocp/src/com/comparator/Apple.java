package com.comparator;

public class Apple {
	
	Integer weight;
	String color;
	
	public Apple(String color) {
		this.color = color;
	}
	
	public Apple(Integer weight) {
		this.weight = weight;
	}
	
	public Apple(Integer weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return ""+this.color+"-"+this.weight.toString(); 
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	
}
