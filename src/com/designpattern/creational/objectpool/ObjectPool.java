/**
 * 
 */
package com.designpattern.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * This class creates the object pools This class pools any object which extends
 * the {@link Poolable} interface
 * 
 * <br>
 * This class is defined in generic fashion to make it more reusable
 * 
 * @author Himanshu Gupta
 *
 */
public class ObjectPool<T extends Poolable> {

	// this represents the cache pool
	private BlockingQueue<T> availablePool;

	/**
	 * 
	 * We are passing number of object counts we want to initialize and the supplier
	 * i.e. which type of object you want to create pool for
	 * 
	 * @param creator
	 * @param count
	 */
	ObjectPool(Supplier<T> creator, int count) {
		// initialize the instance of collection
		availablePool = new LinkedBlockingQueue<T>();
		// create object for number of count requested
		for (int i = 0; i < count; i++) {
			availablePool.offer(creator.get());
		}
	}

	/**
	 * This method allows to take object from available pool
	 * 
	 * @return
	 */
	public T get() {
		try {
			//check if pool is empty, throw the exception
			if (availablePool.isEmpty()) {
				throw new InterruptedException();
			}

			return availablePool.take();
		} catch (InterruptedException ex) {
			System.err.println("Available Pool is empty");
		}

		return null;
	}

	/**
	 * This method is used to release the object so that it went back to the
	 * available pool
	 * 
	 * @param obj
	 */
	public void release(T obj) {
		try {
			obj.reset();
			availablePool.put(obj);
		} catch (InterruptedException ex) {
			System.err.println("Release operation is interrupted");
		}

	}
}
