/**
 * 
 */
package com.designpattern.structural.decorator;

/**
 * Decorator Client
 * 
 * @author Himanshu Gupta
 *
 */
public class DecoraterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message message = new TextMessage("Text Message");
		System.out.println(message.getContent());

		Message base64Message = new Base64EncodedMessage(message);
		System.out.println(base64Message.getContent());
	}

}
