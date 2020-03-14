package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;

public class AppleStream {

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

		// Sequential processing:
		List<Apple> heavyApples1 = inventory.stream().filter((Apple a) -> a.getWeight() > 150).collect(toList());

		System.out.println(heavyApples1);

		// Parallel processing:

		List<Apple> heavyApples2 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150)
				.collect(toList());

		System.out.println(heavyApples2);

	}

}
