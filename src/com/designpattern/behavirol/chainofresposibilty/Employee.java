package com.designpattern.behavirol.chainofresposibilty;

/**
 * Provides the leave application
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class Employee implements LeaveApprover {

	private String role;

	private LeaveApprover nextApproval;

	public Employee(String role, LeaveApprover nextApproval) {
		this.role = role;
		this.nextApproval = nextApproval;
	}

	/**
	 * This method process the leave application, if current implementation employee
	 * class did not process the leave application, it will pass the request to next
	 * approval
	 */
	@Override
	public void processLeaveApplication(LeaveApplication leaveApplication) {
		if (!processRequest(leaveApplication) && nextApproval != null)
			nextApproval.processLeaveApplication(leaveApplication);
	}

	@Override
	public String getApprovalRole() {
		return role;
	}

	protected abstract boolean processRequest(LeaveApplication request);

}