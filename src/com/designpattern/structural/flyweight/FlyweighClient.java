/**
 * 
 */
package com.designpattern.structural.flyweight;

import com.designpattern.structural.flyweight.ErrorMessageFactory.ErrorType;

/**
 * Flyweight Client
 * 
 * @author Himanshu Gupta
 *
 */
public class FlyweighClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SystemErrorMessage errorMessage1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(errorMessage1.getErrorMessage("1111"));

		UserBannedErrorMessage errorMessage2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1231");
		
	}

}
