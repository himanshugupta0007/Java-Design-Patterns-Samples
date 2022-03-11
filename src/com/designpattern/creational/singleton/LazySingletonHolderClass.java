/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * This class is to demonstrate the Lazy Initialization of Singleton Class
 * without worrying about the synchronization
 * 
 * @author Himanshu Gupta
 *
 */
public class LazySingletonHolderClass {

	/**
	 * Private constructor
	 */
	private LazySingletonHolderClass() {
		System.out.println("In Construtor of" + LazySingletonHolderClass.class.getName());
	}

	/**
	 * 
	 * This is an inner class where we are instantiating the instance of
	 * {@link LazySingletonHolderClass} as when we call the <b> getInstance() <b>
	 * method, it the method first instantiate the inner class then the instance of
	 * {@link LazySingletonHolderClass}
	 * 
	 * Hence, it is lazy loading the singleton class
	 */
	private static class SingletonClassHolder {
		static LazySingletonHolderClass INSTANCE = new LazySingletonHolderClass();
	}

	public static LazySingletonHolderClass getInstance() {
		return SingletonClassHolder.INSTANCE;
	}

}
