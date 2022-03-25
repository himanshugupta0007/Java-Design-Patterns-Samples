package com.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Error Message Factory class to provide the instance of Error Message
 * according to the key provided
 * 
 * @author Himanshu Gupta
 *
 */
public class ErrorMessageFactory {

	// This serves as key for getting flyweight instance
	public enum ErrorType {
		GenericSystemError, PageNotFoundError, ServerError
	}

	// to cache the objects created
	private Map<ErrorType, SystemErrorMessage> errorMessage = new HashMap<>();

	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}

	private ErrorMessageFactory() {
		errorMessage.put(ErrorType.GenericSystemError, new SystemErrorMessage(
				"An Generic Error code $errorCode occurrred. Please refer to", "http://helpurl.com"));

		errorMessage.put(ErrorType.PageNotFoundError, new SystemErrorMessage(
				"An Page Not Found Error code $errorCode occurrred. Please refer to", "http://helpurl.com"));
	}

	public SystemErrorMessage getError(ErrorType errorType) {
		return errorMessage.get(errorType);
	}

	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
