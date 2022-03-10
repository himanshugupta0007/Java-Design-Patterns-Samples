/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * This is an abstract Message class to demonstrate the Factory Pattern
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class Message {

	/**
	 * Abstract method to getContent of message
	 * 
	 * @return
	 */
	public abstract String getContent();

	/**
	 * Adding headers to the message
	 */
	public void addDefaultHeader() {
		System.out.println("Adding Headers");
	}

	/**
	 * Encrypt Message
	 */
	public void encryptMessage() {
		System.out.println("Encrypt");
	}

}
