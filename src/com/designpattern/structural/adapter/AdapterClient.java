/**
 * 
 */
package com.designpattern.structural.adapter;

/**
 * This is Adapter Client Class
 * 
 * @author Himanshu Gupta
 *
 */
public class AdapterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		/*
		 * Using Class Adapter
		 */
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		// since our adapter extends the Employee class, we can pass adapter where
		// adaptee class is expected
		populateEmployee(employeeClassAdapter);
		String card = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println("Employee Class Adapter: \n" + card);
		System.out.println();
		Employee emp = new Employee();
		populateEmployee(emp);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(emp);
		businessCardDesigner.designCard(employeeObjectAdapter);
		System.out.println("Employee Object Adapter: \n" + card);

	}

	/**
	 * This populates the {@link Employee} object
	 * 
	 * @param emp
	 */
	public static void populateEmployee(Employee emp) {
		emp.setEmployeeName("Himanshu");
		emp.setJobTitle("Tech Lead");
		emp.setOfficeLocation("Noida");
	}
}
