/**
 * 
 */
package com.designpattern.creational.simplefactory;

/**
 * @author himanshugupta
 *
 */
public class SimpleFactoryClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlogPost blog = BlogFactory.createBlog("TechnicalBlog");
		// this will print the technical Blog
		System.out.println(blog.getClass());
		blog = BlogFactory.createBlog("LifeStyleBlog");
		// this will print the lifestyle blog
		System.out.println(blog.getClass());

	}

}
