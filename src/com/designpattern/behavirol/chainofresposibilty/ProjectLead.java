package com.designpattern.behavirol.chainofresposibilty;

/**
 * Handler for Employee class
 * 
 * @author Himanshu Gupta
 *
 */
public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover nextApproval) {
		super("Project Lead", nextApproval);
	}

	@Override
	protected boolean processRequest(LeaveApplication request) {

		// can approve sick leave and duration is less than or equal 2 days
		if (request.getType() == LeaveApplication.Type.Sick) {
			if (request.getNoOfDays() <= 2) {
				request.approve(getApprovalRole());
				return true;
			}
		}
		return false;
	}

}
