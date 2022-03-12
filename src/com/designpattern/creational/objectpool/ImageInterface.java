/**
 * 
 */
package com.designpattern.creational.objectpool;

/**
 * @author Himanshu Gupta
 *
 */
public interface ImageInterface extends Poolable {

	public void draw();

	String getLocation();

	public void setLocation(String location);

}
