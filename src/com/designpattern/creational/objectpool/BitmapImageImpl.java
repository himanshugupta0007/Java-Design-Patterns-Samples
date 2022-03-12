/**
 * 
 */
package com.designpattern.creational.objectpool;

/**
 * 
 * This is an implementation of ImageInterface and we want to create a pool of
 * objects for this class for that we need {@link ImageInterface} extends
 * {@link Poolable} iterface
 * 
 * @author Himanshu Gupta
 *
 */
public class BitmapImageImpl implements ImageInterface {

	private String name;

	private String location;

	BitmapImageImpl(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("Draw " + name + " Location " + location);

	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;

	}

	/**
	 * This method resets the locations
	 */
	@Override
	public void reset() {
		location = null;
		System.out.println("Bitmap Image is reset");
	}

}
