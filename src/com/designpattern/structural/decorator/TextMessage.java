/**
 * 
 */
package com.designpattern.structural.decorator;

/**
 * Concrete Class. Class's object to be decorated
 * 
 * @author Himanshu Gupta
 *
 */
public class TextMessage implements Message {

	String message;

	public TextMessage(String message) {
		this.message = message;
	}

	@Override
	public String getContent() {
		return message;
	}

}
