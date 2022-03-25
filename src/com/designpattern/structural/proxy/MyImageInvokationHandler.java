/**
 * 
 */
package com.designpattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javafx.geometry.Point2D;

/**
 * This is to demonstrate the Dynamic proxy implementation where proxy class are
 * created at runtime
 * 
 * @author Himanshu Gupta
 *
 */
public class MyImageInvokationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Method setLocationMethod = Image.class.getDeclaredMethod("setLocation", new Class[] { Point2D.class });
		if (setLocationMethod.equals(method)) {
			Point2D point2D = (Point2D) args[0];
			System.out.println("From Invocation Handler" + point2D);
		}
		return null;
	}

}
