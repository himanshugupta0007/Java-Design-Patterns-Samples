package com.designpattern.behavirol.command;

/**
 * A Concrete implementation of Command.
 * 
 * @author Himanshu Gupta
 *
 */
public class AddMemberCommand implements Command {
	private String emailAddress;
	private String distributionList;
	private EWSService receiver;

	public AddMemberCommand(String emailAddress, String distributionList, EWSService receiver) {
		this.emailAddress = emailAddress;
		this.distributionList = distributionList;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.addMember(emailAddress, distributionList);
	}

}
