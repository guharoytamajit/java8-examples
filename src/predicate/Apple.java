package predicate;

import java.util.Arrays;
import java.util.List;

public class Apple {
	String color;
	int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public static List<Apple> getAppleList() {
		return Arrays.asList(new Apple("red", 50), new Apple("green", 80),
				new Apple("red", 45), new Apple("red", 100), new Apple("green",
						60));
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}
