package com.designpattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * Factory to get image objects.
 * 
 * @author Himanshu Gupta
 *
 */
public class ImageFactory {
	// We'll provide proxy to caller instead of real object
	public static Image getImageInstance(String name) {
		return new ImageProxy(name);
	}

	// for dynamic proxy
	public static Image getImage() {
		return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] { Image.class },
				new MyImageInvokationHandler());
	}

	// for dynamic proxy
	public static Image getImage(String fileName) {
		return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] { Image.class },
				new ImageInvocationHandler(fileName));
	}
}
