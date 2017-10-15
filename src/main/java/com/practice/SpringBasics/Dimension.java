package com.practice.SpringBasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dimension {
	
	private Float length;
	private Float bredth;
	
	public Float getLength() {
		return length;
	}
	@Value(value="15")
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getBredth() {
		return bredth;
	}
	@Value(value="12")
	public void setBredth(Float bredth) {
		this.bredth = bredth;
	}
}
