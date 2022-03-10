/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * JSON Message Class
 * 
 * @author Himanshu Gupta
 *
 */
public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "JSON Object";
	}

}
