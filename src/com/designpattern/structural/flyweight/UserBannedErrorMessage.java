package com.designpattern.structural.flyweight;

import java.time.Duration;

/**
 * Unshared concrete flyweight.
 * 
 * @author Himanshu Gupta
 *
 */
public class UserBannedErrorMessage implements ErrorMessage {
	// All state is defined here
	private String caseId;

	private String remarks;

	private Duration banDuration;

	private String msg;

	public UserBannedErrorMessage(String caseId) {
		// Load case info from DB.
		this.caseId = caseId;
		remarks = "You violated terms of use.";
		banDuration = Duration.ofDays(2);
		msg = "You are BANNED. Sorry. \nMore information:\n";
		msg += caseId + "\n";
		msg += remarks + "\n";
		msg += "Banned For:" + banDuration.toHours() + " Hours";
	}

	public String getCaseNo() {
		return caseId;
	}

	@Override
	public String getErrorMessage(String errorCode) {
		return msg;
	}

}
