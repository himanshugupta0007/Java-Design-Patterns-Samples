/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * This is an example of Lazy Singleton Class where we are instantiate the Lazy
 * instance of class
 * 
 * This is to demonstrate the singleton pattern using Double Checked Locking
 * 
 * @author Himanshu Gupta
 *
 */
public class LazySingletonDoubleCheckLockClass {

	/**
	 * Private Constructor
	 */
	private LazySingletonDoubleCheckLockClass() {
	}

	// adding volatile make sures any class will get the latest instance with
	// updated values of instance
	private static volatile LazySingletonDoubleCheckLockClass INSTANCE;

	public static LazySingletonDoubleCheckLockClass getInstance() {
		if (INSTANCE == null) {
			/*
			 * This is take a lock on instantiation so that in multi-threading environment
			 * it saves of creating multiple objects
			 */
			synchronized (LazySingletonDoubleCheckLockClass.class) {
				// another instance null check saves creating multiple objects in
				// multi-threading environment
				if (INSTANCE == null) {
					INSTANCE = new LazySingletonDoubleCheckLockClass();
				}

			}
		}
		return INSTANCE;
	}
}
