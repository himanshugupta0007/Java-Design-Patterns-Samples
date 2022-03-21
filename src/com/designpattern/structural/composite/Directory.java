package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a composite class provides the implementation on base operations
 * 
 * @author Himanshu Gupta
 *
 */
public class Directory extends File {

	List<File> children = new ArrayList<File>();

	public Directory(String fileName) {
		super(fileName);
	}

	@Override
	public void ls() {

		System.out.println("Directory Name: " + getFileName());
		children.forEach(File::ls);
	}

	@Override
	public void addFile(File file) {
		children.add(file);

	}

	@Override
	public File[] getFiles() {

		return children.toArray(new File[children.size()]);
	}

	@Override
	public void removeFile(File file) {
		children.remove(file);
	}

}
