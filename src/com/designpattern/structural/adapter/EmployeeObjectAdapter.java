/**
 * 
 */
package com.designpattern.structural.adapter;

/**
 * This is Object adapter using composition to translate the interface
 * 
 * @author Himanshu Gupta
 *
 */
public class EmployeeObjectAdapter implements Customer {

	/*
	 * Here declaring object for Employee class added a relationship of Adapter has
	 * Employee. Hence, using the composition for adapter
	 * 
	 */
	private Employee employee;

	/**
	 * Best way to inject the employee object here
	 * 
	 * @param employee
	 */
	public EmployeeObjectAdapter(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String getName() {
		return employee.getEmployeeName();
	}

	@Override
	public String getDesignation() {
		return employee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return employee.getOfficeLocation();
	}

}
