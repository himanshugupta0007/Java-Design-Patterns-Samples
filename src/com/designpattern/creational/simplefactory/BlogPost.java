/**
 * 
 */
package com.designpattern.creational.simplefactory;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * This is abstract class for Blog Post
 * 
 * @author Himanshu Gupta
 *
 */
public abstract class BlogPost {

	private Integer id;
	private String blogTitle;
	private String blogAuthor;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the blogTitle
	 */
	public String getBlogTitle() {
		return blogTitle;
	}

	/**
	 * @param blogTitle the blogTitle to set
	 */
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	/**
	 * @return the blogAuthor
	 */
	public String getBlogAuthor() {
		return blogAuthor;
	}

	/**
	 * @param blogAuthor the blogAuthor to set
	 */
	public void setBlogAuthor(String blogAuthor) {
		this.blogAuthor = blogAuthor;
	}

	/**
	 * @return the createdOn
	 */
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedOn
	 */
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
}
