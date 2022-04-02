package com.designpattern.behavirol.interpreter;

/**
 * Terminal expression - show the single rule
 * 
 * @author Himanshu Gupta
 *
 */
public class Permission implements PermissionExpression {

	private String permission;

	public Permission(String permission) {
		this.permission = permission.toLowerCase();
	}

	@Override
	public boolean interpret(User user) {
		// check if user have permission
		return user.getPermissions().contains(permission);
	}

	@Override
	public String toString() {
		return "Permission [permission=" + permission + "]";
	}

}
