package com.designpattern.behavirol.interpreter;

/**
 * Abstract expression
 * 
 * @author Himanshu Gupta
 *
 */
public interface PermissionExpression {

	/**
	 * User object is a context which is required for interpretation
	 * 
	 * @param user
	 * @return User can read Report object or not
	 */
	boolean interpret(User user);
}
