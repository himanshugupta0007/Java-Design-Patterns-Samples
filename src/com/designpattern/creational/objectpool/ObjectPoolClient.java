/**
 * 
 */
package com.designpattern.creational.objectpool;

/**
 * Test client for Object Pool Pattern
 * 
 * @author Himanshu Gupta
 *
 */
public class ObjectPoolClient {

	// this will create object pool of 5 objects for types bitmap
	public static final ObjectPool<BitmapImageImpl> bitmapPool = new ObjectPool<>(() -> new BitmapImageImpl("JPG"), 3);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// request object from the pool and perform your required actions on the object
		BitmapImageImpl b1 = bitmapPool.get();
		b1.setLocation("Folder X");

		BitmapImageImpl b2 = bitmapPool.get();
		b2.setLocation("Folder Y");

		b1.draw();
		b2.draw();

		// once object work is completed, release the object back to the pool
		bitmapPool.release(b1);
		bitmapPool.release(b2);
	}

}
