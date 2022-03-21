/**
 * 
 */
package com.designpattern.structural.composite;

/**
 * This is a leaf file for the abstract class {@link File} we defined. Here we
 * are taking only one leaf class, in actually there could n number of leaf
 * classes
 * 
 * @author Himanshu Gupta
 *
 */
public class BinaryFile extends File {

	private long size;

	public BinaryFile(String fileName, long fileSize) {
		super(fileName);
		this.size = fileSize;
	}

	@Override
	public void ls() {
		System.out.println(getFileName() + "\t " + this.size);
	}

	/**
	 * this operation has no meaning for this Binary file
	 */
	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("Leaf node did not support this operation");
	}

	/**
	 * this operation has no meaning for this Binary file
	 */
	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("Leaf node did not support this operation");
	}

	/**
	 * this operation has no meaning for this Binary file
	 */
	@Override
	public void removeFile(File file) {
		throw new UnsupportedOperationException("Leaf node did not support this operation");
	}

}
