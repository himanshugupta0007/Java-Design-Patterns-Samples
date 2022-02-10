package com.designpattern.creational.builder2;

import java.time.LocalDate;
import java.time.Period;

import com.designpattern.creational.builder.Address;

/**
 * User POJO Class in this class, we will declare our builder class and concrete
 * class
 * 
 * @author Himanshu Gupta
 *
 */
public class UserDTO {

	private String name;
	private String birthday;
	private String address;
	private static UserDTOBuilder userDTOBuilder;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	private void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "UserDTO [name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}

	// Get builder instance
	//create a snglton class
	public static UserDTOBuilder getBuilder() {
		if (userDTOBuilder == null) {
			userDTOBuilder = new UserDTOBuilder();
		}
		return userDTOBuilder;
	}

	// Builder and concrete Class declared as a inner static class
	public static class UserDTOBuilder {
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
			userDTO = new UserDTO();
			userDTO.setName(firstName + " " + lastName);
			userDTO.setAddress(address);
			userDTO.setBirthday(age);
			return userDTO;

		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}

}
