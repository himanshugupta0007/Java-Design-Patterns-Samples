/**
 * 
 */
package com.designpattern.creational.prototype;

/**
 * This is a class to demonstrate the Prototype Design Pattern <br>
 * This class will implement the cloneable interface to allow concrete class to
 * clone the objects
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class Department implements Cloneable {

	protected String departmentID = "001";
	protected String departmentName = "TBD";

	public Department(String departmentId, String departmentName) {
		this.departmentID = departmentId;
		this.departmentName = departmentName;
	}

	// overriding cloning method to provide clone objects
	@Override
	protected Department clone() throws CloneNotSupportedException {

		Department dept = (Department) super.clone();
		// initiliaze this object with default or values you want to set
		dept.initialize();
		return dept;
	}

	protected void setDepartmentID(String departID) {
		this.departmentID = departID;
	}

	// this method is to initialize the objects we want to provide in cloning
	private void initialize() {
		this.departmentID = "001";
		this.departmentName = "Unknown";
		resetMethod();
	}

	// abstract method to allow subclass to provide their custom setting to the
	// objects
	public abstract void resetMethod();

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

}
