package com.designpattern.behavirol.command;

public class CommandClient {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command c1 = new AddMemberCommand("test@tes.com", "Test", service);
		Command c2 = new AddMemberCommand("test123@tes.com", "Spam", service);

		MailTasksRunner.getInstance().addCommand(c1);
		MailTasksRunner.getInstance().addCommand(c2);

		Thread.sleep(4000);

		MailTasksRunner.getInstance().shutdown();
	}

}
