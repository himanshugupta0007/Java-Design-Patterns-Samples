/**
 * 
 */
package com.designpattern.structural.adapter;

/**
 * 
 * The adaptee class required for client class to perform some action
 * 
 * @author Himanshu Gupta
 *
 */
public class Employee {

	private String employeeName;
	private String jobTitle;
	private String officeLocation;

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the officeLocation
	 */
	public String getOfficeLocation() {
		return officeLocation;
	}

	/**
	 * @param officeLocation the officeLocation to set
	 */
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

}
