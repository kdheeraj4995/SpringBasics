package com.practice.SpringBasics;

public class Circle {
	private Point centre;
	private Float radius;

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public Point getcentre() {
		return centre;
	}

	public void setcentre(Point centre) {
		this.centre = centre;
	}

	public void draw() {
		System.out.println("Circle drawn");
		System.out.println("Centre : ("+centre.getX()+","+centre.getY()+ ")");
		System.out.println("Radius : "+ radius);
	}
}
