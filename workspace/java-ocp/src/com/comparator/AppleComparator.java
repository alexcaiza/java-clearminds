package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AppleComparator {

	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<>();

		inventory.add(new Apple(14, "red"));
		inventory.add(new Apple(13, "red"));
		inventory.add(new Apple(12, "red"));
		inventory.add(new Apple(11, "green"));
		inventory.add(new Apple(10, "green"));
		inventory.add(new Apple(15, "green"));
		inventory.add(new Apple(151, "red"));

		System.out.println(inventory);

		Collections.sort(inventory, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.weight.compareTo(o2.weight);
			}
		});

		Collections.sort(inventory, new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.weight.compareTo(o2.weight);
			}
		});

		System.out.println(inventory);

		// inventory.sort(comparing(Apple::getWeight)); #A

		// From passing methods to lambdas

		List<Apple> greenApples = filterApples(inventory, Apple::isGreenApple);
		List<Apple> heavyApples = filterApples(inventory, Apple::isHeavyApple);

		System.out.println("greens: " + greenApples);
		System.out.println("heavys: " + heavyApples);

		// anonymous functions, or lambdas
		List<Apple> list1 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		List<Apple> list2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		List<Apple> list3 = filterApples(inventory, (Apple a) -> a.getWeight() < 150 || "green".equals(a.getColor()));

	}

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>(); // #A
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) { // #B
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > 150) { // #A
				result.add(apple);
			}
		}
		return result;
	}

	static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) { // #B
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) { // #C
				result.add(apple);
			}
		}
		return result;
	}
}
