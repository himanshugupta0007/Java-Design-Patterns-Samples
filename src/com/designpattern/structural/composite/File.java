/**
 * 
 */
package com.designpattern.structural.composite;

/**
 * This is an component or base class which includes operations applicable for
 * leafs and composite class
 * 
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class File {

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// abstract methods which will be implemented by composite childs or itself only

	public abstract void ls();

	public abstract void addFile(File file);

	public abstract File[] getFiles();

	public abstract void removeFile(File file);

}
