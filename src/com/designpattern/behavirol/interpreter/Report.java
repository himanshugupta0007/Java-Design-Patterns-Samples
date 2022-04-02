package com.designpattern.behavirol.interpreter;

/**
 * Report Class - We are giving access to these reports on the basis of
 * permissions
 * 
 * @author Himanshu Gupta
 *
 */
public class Report {

	private String name;
	// "NOT ADMIN", "FINANCE_USER AND ADMIN" - These access have permission to
	// reports
	private String permission;

	public Report(String name, String permissions) {
		this.name = name;
		this.permission = permissions;
	}

	public String getName() {
		return name;
	}

	public String getPermission() {
		return permission;
	}

}
