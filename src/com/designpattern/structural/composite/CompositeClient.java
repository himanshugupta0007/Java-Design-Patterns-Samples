/**
 * 
 */
package com.designpattern.structural.composite;

/**
 * Composite Client
 * 
 * @author Himanshu Gupta
 *
 */
public class CompositeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File root = createTreeOne();
		root.ls();

		System.out.println("****************");

		File root2 = createTreeTwo();
		root2.ls();

	}

	/**
	 * Creates the tree of documents
	 * 
	 * @return
	 */
	private static File createTreeOne() {
		File file1 = new BinaryFile("Test 1", 1000);
		Directory dir1 = new Directory("First leaf");
		dir1.addFile(file1);
		File file2 = new BinaryFile("Test 2", 2000);
		File file3 = new BinaryFile("Test 3", 3000);
		Directory dir2 = new Directory("Second leaf");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}

	private static File createTreeTwo() {
		return new BinaryFile("Another File", 4000);
	}
}
