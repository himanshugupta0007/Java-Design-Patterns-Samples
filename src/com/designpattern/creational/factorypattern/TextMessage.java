/**
 * 
 */
package com.designpattern.creational.factorypattern;

/**
 * Text Message Class
 * 
 * @author Himanshu Gupta
 *
 */
public class TextMessage extends Message {

	@Override
	public String getContent() {
		return "Text Message";
	}

}
