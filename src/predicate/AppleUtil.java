package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleUtil {
	public static List<Apple> filterApple(List<Apple> appleList,
			Predicate<Apple> predicate) {

		List<Apple> selectedApples = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (predicate.test(apple)) {
				selectedApples.add(apple);
			}
		}
		return selectedApples;
	}
}
