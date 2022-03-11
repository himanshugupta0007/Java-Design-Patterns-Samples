/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * This class is to test the singleton
 * 
 * @author Himanshu Gupta
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * You cannot instantiate object as below since constructor is private
		 * EagerSingletonClass eagerSingletonInstance = new EagerSingletonClass();
		 * 
		 * You can only get instance from this class through getInstance method
		 */

		EagerSingletonClass eagerSingletonInstance = EagerSingletonClass.getInstance();
		EagerSingletonClass eagerSingletonInstance2 = EagerSingletonClass.getInstance();
		System.out.println(eagerSingletonInstance == eagerSingletonInstance2);

		LazySingletonDoubleCheckLockClass lazySingleton = LazySingletonDoubleCheckLockClass.getInstance();
		LazySingletonDoubleCheckLockClass lazySingleton2 = LazySingletonDoubleCheckLockClass.getInstance();

		System.out.println(lazySingleton == lazySingleton2);
		
		LazySingletonHolderClass lazySingletonHolder = LazySingletonHolderClass.getInstance();
	}

}
