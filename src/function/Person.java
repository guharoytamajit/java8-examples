package function;

import java.util.Arrays;
import java.util.List;

public class Person {
	String surName;
	String givenName;
	String email;
	String phone;
	String address;
	int age;
	String gender;

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String guvenName) {
		this.givenName = guvenName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static List<Person> createShortList() {
		List<Person> asList = Arrays.asList(new Person("johnson", "alex",
				"alex@gmail.com", "123453", "abc", 33, "M"), new Person(
				"brown", "rod", "brown@gmail.com", "133453", "xyz", 39, "M"));
		return asList;
	}

	public Person(String surName, String givenName, String email, String phone,
			String address, int age, String gender) {
		super();
		this.surName = surName;
		this.givenName = givenName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}

}
