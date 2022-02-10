package com.designpattern.creational.builder;

import java.time.LocalDate;

/**
 * This class also act as a director class, which helps to instantiate the
 * object using builder
 * 
 * @author Himanshu Gupta
 *
 */
public class Client {

	public static void main(String[] args) {
		UserDTOBuilder builder = new UserWebDTOBuilder();
		System.out.println(getUserDTO(builder, createUser()));
		System.out.println(builder.getUserDTO());
	}

	/**
	 * This is acting as a director which calls the builder to get user DTO
	 * 
	 * @param builder
	 * @param user
	 * @return
	 */
	private static UserDTO getUserDTO(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
