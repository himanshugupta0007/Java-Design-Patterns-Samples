/**
 * 
 */
package com.designpattern.structural.flyweight;

/**
 * Interface that will be implemented by flyweight
 * 
 * @author Himanshu Gupta
 *
 */
public interface ErrorMessage {

	/**
	 * This method returns the error messages for provided error code
	 * 
	 * @param errorCode
	 * @return errorMessage
	 */
	public String getErrorMessage(String errorCode);
}
