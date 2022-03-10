/**
 * 
 */
package com.designpattern.creational.prototype;

/**
 * 
 * Subclass for Department which did not supports cloning
 * 
 * @author Himanshu Gupta
 *
 */
public class CommerceDepartment extends Department {

	private String professorName = "Himanshu";

	/**
	 * 
	 */
	public CommerceDepartment(String professorName) {
		super("002", "Commerce");
		this.professorName = professorName;
	}

	@Override
	public void resetMethod() {
		throw new UnsupportedOperationException("Not applicable for this object");

	}

	@Override
	protected Department clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("Commerce Department Are unique");
	}

	@Override
	public String toString() {
		return "CommerceDepartment [professorName=" + professorName + ", departmentID=" + departmentID
				+ ", departmentName=" + departmentName + "]";
	}

}
