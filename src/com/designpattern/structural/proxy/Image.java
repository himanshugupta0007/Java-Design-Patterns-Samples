package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

/**
 * Image interface which will be implemented by proxy class and concrete objects
 * 
 * @author Himanshu Gupta
 *
 */
public interface Image {

	void setLocation(Point2D point2d);

	Point2D getLocation();

	void render();

}
