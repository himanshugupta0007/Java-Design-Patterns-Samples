/**
 * 
 */
package com.designpattern.structural.flyweight;

/**
 * The concrete class for Flyweight which has intrinsic state where instances
 * are shared but cannot be changed
 * 
 * @author Himanshu Gupta
 *
 */
public class SystemErrorMessage implements ErrorMessage {

	// these variables are intrinsic state which usually never changes
	// message according to $errorCode
	private String messageTemplate;

	// respective help URL
	private String helpUrlBase;

	public SystemErrorMessage(String messageTempString, String helpURL) {
		this.messageTemplate = messageTempString;
		this.helpUrlBase = helpURL;
	}

	/**
	 * The argument is an extrinsic state which changes as per the argument value
	 * provided
	 */
	@Override
	public String getErrorMessage(String errorCode) {
		return messageTemplate.replace("$errorCode", errorCode) + helpUrlBase + errorCode;
	}

}
