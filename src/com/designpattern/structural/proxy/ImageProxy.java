package com.designpattern.structural.proxy;

import javafx.geometry.Point2D;

/**
 * This is the Proxy class for Image interface We are going to create a virtual
 * proxy here that means we will provide the feature for image from this class
 * and we will create real object only when it is real necessary
 * 
 * @author Himanshu Gupta
 *
 */
public class ImageProxy implements Image {

	private BitmapImage image;
	private String imageFileName;
	private Point2D location;

	public ImageProxy(String imageName) {
		this.imageFileName = imageName;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if (image != null) {
			image.setLocation(point2d);
		} else {
			this.location = point2d;
		}

	}

	@Override
	public Point2D getLocation() {
		if (image != null) {
			return image.getLocation();
		}
		return location;
	}

	@Override
	public void render() {
		if (image == null) {
			image = new BitmapImage(imageFileName);
			if (location != null)
				image.setLocation(location);
		}
		image.render();
	}

}
