package com.SpringBasics.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rectangle {
	
	@Autowired
	private Dimension dimension;

	public void draw(){
		System.out.println("Rectangle drawn with Annotations");
		System.out.println("Length : "+dimension.getLength());
		System.out.println("Bredth : "+dimension.getBredth());
	}
}
