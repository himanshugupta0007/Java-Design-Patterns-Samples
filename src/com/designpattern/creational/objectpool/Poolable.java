/**
 * 
 */
package com.designpattern.creational.objectpool;

/**
 * 
 * This interface is allow to create pool objects
 * 
 * @author Himanshu Gupta
 *
 */
public interface Poolable {

	// this method make sures that state of objects is resetted to default when
	// object state needs to be reset after use
	public void reset();

}
