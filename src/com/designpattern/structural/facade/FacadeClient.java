/**
 * 
 */
package com.designpattern.structural.facade;

/**
 * Facade Client
 * 
 * @author Himanshu Gupta
 *
 */
public class FacadeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmailFacade email = new EmailFacade();
		Order order = new Order("1", 100.00);
		// facade class sends the mail, reducing the complexities and tight coupling in
		// a single class
		email.sendOrderEmail(order);
	}

}
