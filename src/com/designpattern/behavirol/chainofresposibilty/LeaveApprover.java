package com.designpattern.behavirol.chainofresposibilty;

/**
 * This is handler class which defines the method which processess the request
 * 
 * This defines the method, and its implmentation provides the logic
 * 
 * @author Himanshu Gupta
 *
 */
public interface LeaveApprover {

	/**
	 * Process the leave application
	 * 
	 * @param leaveApplication
	 */
	public void processLeaveApplication(LeaveApplication leaveApplication);

	/**
	 * 
	 * @return Who approves the leave request
	 */
	String getApprovalRole();
}
