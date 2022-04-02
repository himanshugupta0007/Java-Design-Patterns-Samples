package com.designpattern.behavirol.chainofresposibilty;

//A concrete handler

public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType() == LeaveApplication.Type.PTO) {
			application.approve(getApprovalRole());
			return true;
		}
		return false;
	}

}
