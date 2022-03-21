package com.designpattern.structural.facade;

import com.designpattern.structural.facade.Template.TemplateType;

/**
 * Facade Design pattern basically provides the bridge to use legacy code. it is
 * responsible for communicating with legacy code or code from multiple packages
 * and exposes simple methods for clients to use
 * 
 * @author Himanshu Gupta
 *
 */
public class EmailFacade {

	/**
	 * This method is exposed to send order email but internally this method will
	 * communicate with different classes and methods to get the job done
	 * 
	 * @param order
	 * @return
	 */
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(this).build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}

}
