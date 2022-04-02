package com.designpattern.behavirol.interpreter;

public class InterpreterClient {

	public static void main(String[] args) {
		Report report = new Report("Financing", "FINANCE_ADMIN OR DOC");
		ExpressionBuilder builder = new ExpressionBuilder();

		PermissionExpression permission = builder.build(report);
		System.out.println(permission);

		User user1 = new User("Himanshu", "USER", "ADMIN");
		System.out.println("User Access Report: " + permission.interpret(user1));

	}

}
