package com.designpattern.structural.facade;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
