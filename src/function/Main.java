package function;

import java.util.List;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Function<Person, String> shortGangnam = p -> "\nName: "
				+ p.getSurName() + " " + p.getGivenName() + "\n" + "EMail: "
				+ p.getEmail() + "\n" + "Phone: " + p.getPhone();

		Function<Person, String> fullWestern = p -> {
			return "\nName: " + p.getGivenName() + " " + p.getSurName() + "\n"
					+ "Age: " + p.getAge() + "  " + "Gender: " + p.getGender()
					+ "\n" + "EMail: " + p.getEmail() + "\n" + "Phone: "
					+ p.getPhone() + "\n" + "Address: " + p.getAddress();
		};
		List<Person> list1 = Person.createShortList();
		PersonWriterNew pw = new PersonWriterNew();

		pw.printLambdaList(list1, shortGangnam,
				"\n==== Short Western Style ====");
		pw.printLambdaList(list1, fullWestern, "\n==== Full Gangnam Style ====");
	}
}
