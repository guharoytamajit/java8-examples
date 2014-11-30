package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800,
				Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish(
						"french fries", true, 530, Dish.Type.OTHER), new Dish(
						"rice", true, 350, Dish.Type.OTHER), new Dish(
						"season fruit", true, 120, Dish.Type.OTHER), new Dish(
						"pizza", true, 550, Dish.Type.OTHER), new Dish(
						"prawns", false, 300, Dish.Type.FISH), new Dish(
						"salmon", false, 450, Dish.Type.FISH));

		System.out.println("All high calorie foods:");
		List<String> highCalorieDishes = menu.stream()
				.filter(d -> d.getCalories() > 400).map(d -> d.getName())
				.peek(s -> System.out.println("##" + s)).distinct()
				.collect(Collectors.toList());
		System.out.println(highCalorieDishes);

		System.out.println("2nd and 3rd most highest calorie Dishes:");

		menu.stream().filter(d -> d.getCalories() > 400).distinct()
				.sorted((d1, d2) -> d2.getCalories() - d1.getCalories())
				.peek(s -> System.out.println("##" + s))
				// decending
				.map(d -> d.getName()).map(string -> string.toUpperCase())
				.skip(1).limit(2).forEach(s -> System.out.println(s));

		Stream<Dish> dishStream = menu.stream();
		Dish leastColorieDish = dishStream.min(
				Comparator.comparing(s -> s.getCalories())).get();
		System.out.println("least calorie dish: " + leastColorieDish);

		Dish maxColorieDish = menu.stream()
				.max(Comparator.comparing(s -> s.getCalories())).get();
		System.out.println("max calorie dish: " + maxColorieDish);
	}
}
