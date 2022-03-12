/**
 * 
 */
package com.designpattern.structural.bridge;

/**
 * This is bridge client
 * 
 * @author Himanshu Gupta
 *
 */
public class BridgeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<Integer>());

		collection.offer(1);
		collection.offer(2);
		collection.offer(3);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
	}

}
