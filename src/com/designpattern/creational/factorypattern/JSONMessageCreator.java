/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * 
 * This class provides the implementation for JSON Messages
 * 
 * @author Himanshu Gupta
 *
 */
public class JSONMessageCreator extends MessageCreator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
