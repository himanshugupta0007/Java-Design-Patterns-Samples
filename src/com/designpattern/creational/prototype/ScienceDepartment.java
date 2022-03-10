/**
 * 
 */
package com.designpattern.creational.prototype;

/**
 * 
 * This is asubclass for Department.
 * 
 * This supports the cloning
 * 
 * @author Himanshu Gupta
 *
 */
public class ScienceDepartment extends Department {

	private String subjects = "Unknown";

	ScienceDepartment(String subject) {
		super("001", "ScienceDepartment");
		this.subjects = subject;
	}

	@Override
	public String toString() {
		return "ScienceDepartment [subjects=" + subjects + ", departmentID=" + departmentID + ", departmentName="
				+ departmentName + "]";
	}

	@Override
	public void resetMethod() {
		this.subjects = "Unknown";
	}

}
