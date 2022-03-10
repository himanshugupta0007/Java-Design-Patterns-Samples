/**
 * 
 */
package com.designpattern.creational.simplefactory;

/**
 * Class for Technical Blog
 * 
 * @author Himanshu Gupta
 *
 */
public class TechnicalBlog extends BlogPost {

	private String blogTechTitle;
	private String blogTechTag;

	public final static String TECHNICAL_BLOG_NAME = "TechnicalBlog";

	/**
	 * @return the blogTechTitle
	 */
	public String getBlogTechTitle() {
		return blogTechTitle;
	}

	/**
	 * @param blogTechTitle the blogTechTitle to set
	 */
	public void setBlogTechTitle(String blogTechTitle) {
		this.blogTechTitle = blogTechTitle;
	}

	/**
	 * @return the blogTechTag
	 */
	public String getBlogTechTag() {
		return blogTechTag;
	}

	/**
	 * @param blogTechTag the blogTechTag to set
	 */
	public void setBlogTechTag(String blogTechTag) {
		this.blogTechTag = blogTechTag;
	}

}
