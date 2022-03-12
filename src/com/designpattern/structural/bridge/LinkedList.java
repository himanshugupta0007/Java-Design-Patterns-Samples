/**
 * 
 */
package com.designpattern.structural.bridge;

/**
 * This is an implanter interface which basically used by our abstract class
 * which is {@link FifoCollection}
 * 
 * @author Himanshu Gupta
 *
 */
public interface LinkedList<T> {

	void addFirst(T element);

	T removeFirst();

	void addLast(T element);

	T removeLast();

	int getSize();

}
