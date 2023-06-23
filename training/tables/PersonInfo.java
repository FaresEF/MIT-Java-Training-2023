package com.mit.training.tables;

import java.util.ArrayList;

public class PersonInfo {

	protected String firstName;

	protected String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String args[]) {
		
		ArrayList <PersonInfo> Person = new ArrayList<PersonInfo>();
		ArrayList <PersonAddress> Persona = new ArrayList<PersonAddress>();
		PersonInfo pers1 = new PersonInfo();
		
		PersonAddress pers2 = new PersonAddress();

		pers1.setFirstName("Fares");
		pers1.setLastName("El Fakhoury");

		Person.add(pers1);

		pers2.setAddressLine1("Lebanon-Bekaa");
		pers2.setAddressLine2("Zahle");
		pers2.setCity("Mekkseh");
		pers2.setState("Koulala");
		pers2.setZip("llll");
		pers2.setAddressType("Nice");

		Persona.add(pers2);
        
		for(PersonInfo pers:Person) {
			System.out.println(pers.getFirstName());
			System.out.println(pers.getLastName());
		}
		for(PersonAddress persa:Persona) {
			System.out.println(persa.getAddressLine1());
			System.out.println(persa.getAddressLine2());
			System.out.println(persa.getAddressType());
			System.out.println(persa.getCity());
			System.out.println(persa.getState());
			System.out.println(persa.getZip());
		}
	}
}
