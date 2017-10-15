package com.practice.SpringBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rectangle {
	
	@Autowired
	private Dimension dimension;

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public void draw(){
		System.out.println("Rectangle drawn with Annotations");
		System.out.println("Length : "+dimension.getLength());
		System.out.println("Bredth : "+dimension.getBredth());
	}
}
