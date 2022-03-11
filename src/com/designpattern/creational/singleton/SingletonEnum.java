/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * This is demonstrate how enum can be used to create a single instance of
 * class.
 * 
 * it handles the serialization and deserialization problem which usually
 * happens in other ways of creating the singleton objects
 * 
 * @author Himanshu Gupta
 *
 */
public enum SingletonEnum {

	INSTANCE;

	public void getConfiguration() {
	};
}
