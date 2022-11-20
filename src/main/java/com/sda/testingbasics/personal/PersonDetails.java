package com.sda.testingbasics.personal;

public class PersonDetails {

	private final String firstName;
	private final String familyName;
	private final int age;

	public PersonDetails(String firstName, String familyName, int age) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
	}

	public boolean isChild() {
		return age >= 0 && age <= 10;
	}

	public boolean isTeenager() {
		return false;
	}
}
