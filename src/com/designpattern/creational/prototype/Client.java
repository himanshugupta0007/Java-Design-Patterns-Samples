/**
 * 
 */
package com.designpattern.creational.prototype;

/**
 * @author himanshugupta
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		ScienceDepartment sDepartment = new ScienceDepartment("Physics");
		sDepartment.setDepartmentID("004");

		System.out.println(sDepartment);

		ScienceDepartment newSDepartment = (ScienceDepartment) sDepartment.clone();

		System.out.println(newSDepartment);

		CommerceDepartment cDepartment = new CommerceDepartment("deepanshu");

		System.out.println(cDepartment);
		// this will throw an exception as clone is not allowed for CommerceDepartment
		// Object
		CommerceDepartment cNewDepartment = (CommerceDepartment) cDepartment.clone();

	}

}
