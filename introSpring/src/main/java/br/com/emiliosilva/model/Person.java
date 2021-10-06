package br.com.emiliosilva.model;

import java.time.LocalDate;

public class Person {
	private String name;
	private String lastName;
	private LocalDate birthDay;
	private String email;
	
	public Person(String name, String lastName, LocalDate birthDay, String email) {
		this.name = name;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
