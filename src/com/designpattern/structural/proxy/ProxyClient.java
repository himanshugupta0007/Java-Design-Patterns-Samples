package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

/**
 * Proxy Client
 * 
 * @author Himanshu Gupta
 *
 */
public class ProxyClient {

	public static void main(String[] args) {
		Image img = ImageFactory.getImageInstance("123.jps");
		img.setLocation(Point2D.ZERO);
		System.out.println(img.getLocation());
		img.render();
		System.out.println("Dynamic Proxy");
		Image dynamicProxyImg = ImageFactory.getImage();
		dynamicProxyImg.setLocation(new Point2D(11, 11));

		System.out.println("Dynamic Proxy second example");
		Image dynamicProxyImg1 = ImageFactory.getImage("Test.jpg");
		dynamicProxyImg1.setLocation(Point2D.ZERO);
		System.out.println(dynamicProxyImg1.getLocation());
		dynamicProxyImg1.render();
	}

}
