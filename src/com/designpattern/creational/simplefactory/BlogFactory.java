/**
 * 
 */
package com.designpattern.creational.simplefactory;

/**
 * Simple Factory Class to demonstrate the Simple Factory Pattern
 * 
 * @author Himanshu Gupta
 *
 */
public class BlogFactory {

	/**
	 * 
	 * Create the blog object according to the type of object requested
	 * 
	 * @param type
	 * @return
	 */
	public static BlogPost createBlog(String type) {
		BlogPost blog = null;
		switch (type) {
		case TechnicalBlog.TECHNICAL_BLOG_NAME:
			blog = new TechnicalBlog();
			break;
		case LifeStyleBlog.LIFESTYLE_BLOG_NAME:
			blog = new LifeStyleBlog();
			break;
		default:
			throw new IllegalArgumentException();
		}

		return blog;
	}
}
