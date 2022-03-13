/**
 * 
 */
package com.designpattern.structural.decorator;

import java.util.Base64;

/**
 * 
 * Decorator class which adds extra features on {@link Message} objects
 * 
 * @author Himanshu Gupta
 *
 */
public class Base64EncodedMessage implements Message {

	Message message;

	public Base64EncodedMessage(Message message) {
		this.message = message;
	}

	@Override
	public String getContent() {

		return Base64.getEncoder().encodeToString(message.getContent().getBytes());
	}

}
