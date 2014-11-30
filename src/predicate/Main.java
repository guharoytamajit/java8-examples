package predicate;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Apple> appleList = Apple.getAppleList();

		List<Apple> greenAppleList = AppleUtil.filterApple(appleList, a -> a
				.getColor().equals("green"));
		System.out.println(greenAppleList);
		List<Apple> heavyAppleList = AppleUtil.filterApple(appleList,
				a -> a.getWeight() > 55);
		System.out.println(heavyAppleList);
	}
}
