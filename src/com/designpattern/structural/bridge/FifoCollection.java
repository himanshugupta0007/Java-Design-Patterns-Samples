/**
 * 
 */
package com.designpattern.structural.bridge;

/**
 * This is an interface which provides the abstraction
 * 
 * @author Himanshu Gupta
 *
 */
public interface FifoCollection<T> {

	/**
	 * Inserts the element in the collection
	 * 
	 * @param element
	 */
	public void offer(T element);

	/**
	 * Remove and returns first element from collection
	 * 
	 * @return
	 */
	public T poll();
}
