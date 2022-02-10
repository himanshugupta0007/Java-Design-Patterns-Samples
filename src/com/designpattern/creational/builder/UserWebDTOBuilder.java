package com.designpattern.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * This is a concrete builder class which provides the implementation of builder
 * 
 * @author Himanshu Gupta
 *
 */
public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserDTO userDTO;

	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		// returning this in return helps in creating the method chaining
		return this;
	}

	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInyears = Period.between(date, LocalDate.now());
		age = String.valueOf(ageInyears.getYears());
		return this;
	}

	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + " ," + address.getStreet() + " ," + address.getCity() + " ,"
				+ address.getState() + " ," + address.getZipcode();
		return this;
	}

	public UserDTO build() {
		userDTO = new UserWebDTO(firstName + " " + lastName, address, age);
		return userDTO;

	}

	public UserDTO getUserDTO() {

		return userDTO;
	}

}
