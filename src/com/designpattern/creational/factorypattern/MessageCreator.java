/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * This is a creator Class in which createMethod() implemented by subclass
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class MessageCreator {

	/**
	 * This method returns the message object according to the type of message
	 * received
	 * 
	 * @return A {@link Message}
	 */
	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeader();
		msg.encryptMessage();
		return msg;
	}

	/**
	 * This method will be implemented by sub-classes
	 * 
	 * @return
	 */
	public abstract Message createMessage();
}
