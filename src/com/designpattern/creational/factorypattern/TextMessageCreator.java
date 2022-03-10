/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * This class provides the implementation for Text Messages
 * 
 * @author Himanshu Gupta
 *
 */
public class TextMessageCreator extends MessageCreator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
