package com.designpattern.creational.builder2;

import java.time.LocalDate;

import com.designpattern.creational.builder.Address;
import com.designpattern.creational.builder.User;
import com.designpattern.creational.builder2.UserDTO.UserDTOBuilder;

/**
 * This class also act as a director class, which helps to instantiate the
 * object using builder
 * 
 * @author Himanshu Gupta
 *
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(getUserDTO(UserDTO.getBuilder(), createUser()));
		System.out.println(UserDTO.getBuilder().getUserDTO());
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
