/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * This is an example of Eager Singleton Class where singleton instance will be
 * created as soon as the program is loaded
 * 
 * @author Himanshu Gupta
 *
 */
public class EagerSingletonClass {

	/**
	 * Make the constructor to disable inheritance and don't let any class to
	 * instantiate the class
	 */
	private EagerSingletonClass() {
	}

	/**
	 * This will create the single instance of class {@link EagerSingletonClass} at
	 * program loading
	 */
	private static final EagerSingletonClass INSTANCE = new EagerSingletonClass();

	/**
	 * Returns the singleton instance of class
	 * 
	 * @return {@link EagerSingletonClass}
	 */
	public static EagerSingletonClass getInstance() {
		return INSTANCE;
	}

}
