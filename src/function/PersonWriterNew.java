package function;

import java.util.List;
import java.util.function.Function;

public class PersonWriterNew {
	public void printLambdaList(List<Person> pl, Function<Person, String> f,
			String description) {
		System.out.println(description);
		for (Person p : pl) {
			System.out.println(f.apply(p));
		}
	}

}
