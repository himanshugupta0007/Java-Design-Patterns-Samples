package com.designpattern.behavirol.chainofresposibilty;

import java.time.LocalDate;

import com.designpattern.behavirol.chainofresposibilty.LeaveApplication.Builder;

public class ChainOfResponsibikltClient {

	public static void main(String[] args) {

		LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
				.from(LocalDate.now()).to(LocalDate.of(2022, 05, 01)).build();

		LeaveApprover approver = createChainEmployee();

		approver.processLeaveApplication(application);

		System.out.println(application);

	}

	private static LeaveApprover createChainEmployee() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}

}
