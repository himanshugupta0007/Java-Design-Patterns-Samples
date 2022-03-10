/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * This is class is to demonstrate the Factory Pattern
 * 
 * @author Himanshu Gupta
 *
 */
public class Client {

	/**
	 * This method prints the message of called creator
	 * 
	 * @param creator {@link MessageCreator}
	 */
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg.getContent());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());

	}

}
