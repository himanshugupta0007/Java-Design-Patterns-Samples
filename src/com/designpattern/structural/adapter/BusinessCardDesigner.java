/**
 * 
 */
package com.designpattern.structural.adapter;

/**
 * 
 * This is a client class which needs both
 * <li>
 * <ul>
 * {@link Customer} interface as an argument
 * <ul>
 * {@link Employee} class information</li>
 * 
 * To accomodate both features required, we are creating the adapter class which
 * will have both features available for client class
 * 
 * @author Himanshu Gupta
 *
 */
public class BusinessCardDesigner {

	/**
	 * Design the customer card
	 * @param customer
	 * @return
	 */
	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}

}
