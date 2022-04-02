package com.designpattern.behavirol.command;

/**
 * This is receiver command which receives the command from client
 * 
 * @author Himanshu Gupta
 *
 */
public class EWSService {

	// Add a new member to mailing list
	public void addMember(String contact, String contactGroup) {
		// contact exchange
		System.out.println("Added " + contact + " to " + contactGroup);
	}

	// Remove member from mailing list
	public void removeMember(String contact, String contactGroup) {
		// contact exchange
		System.out.println("Removed " + contact + " from " + contactGroup);
	}
}
