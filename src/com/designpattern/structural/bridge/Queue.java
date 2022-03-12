/**
 * 
 */
package com.designpattern.structural.bridge;

/**
 * 
 * This is a refine abstraction which implements the abstraction class
 * {@link FifoCollection}
 * 
 * @author Himanshu Gupta
 *
 */
public class Queue<T> implements FifoCollection<T> {

	private LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}

}
