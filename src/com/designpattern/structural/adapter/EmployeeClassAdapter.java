/**
 * 
 */
package com.designpattern.structural.adapter;

/**
 * 
 * This is a class adapter which extends the {@link Employee} class and target
 * {@link Customer} interface
 * 
 * @author Himanshu Gupta
 *
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		// from employee class
		return this.getEmployeeName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}
