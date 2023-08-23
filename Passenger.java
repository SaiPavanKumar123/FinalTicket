package com.ticket;

public class Passenger {
	private String name;
	private String gender;
	private String age;

	public Passenger(String name, String gender, String age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	// You might want to override toString() for debugging purposes
	@Override
	public String toString() {
		return "Passenger{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", age='" + age + '\'' + '}';
	}
}
