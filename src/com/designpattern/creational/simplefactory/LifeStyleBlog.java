/**
 * 
 */
package com.designpattern.creational.simplefactory;

/**
 * This is lifeStyle Blog
 * 
 * @author Himanshu Gupta
 *
 */
public class LifeStyleBlog extends BlogPost {

	private String blogSubAuthor;
	private String blogPlace;

	public final static String LIFESTYLE_BLOG_NAME = "LifeStyleBlog";

	/**
	 * @return the blogSubAuthor
	 */
	public String getBlogSubAuthor() {
		return blogSubAuthor;
	}

	/**
	 * @param blogSubAuthor the blogSubAuthor to set
	 */
	public void setBlogSubAuthor(String blogSubAuthor) {
		this.blogSubAuthor = blogSubAuthor;
	}

	/**
	 * @return the blogPlace
	 */
	public String getBlogPlace() {
		return blogPlace;
	}

	/**
	 * @param blogPlace the blogPlace to set
	 */
	public void setBlogPlace(String blogPlace) {
		this.blogPlace = blogPlace;
	}

}
