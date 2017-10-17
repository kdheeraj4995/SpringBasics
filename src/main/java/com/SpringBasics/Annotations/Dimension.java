package com.SpringBasics.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dimension {
	
	@Value(value="15")
	private Float length;
	
	@Value(value="12")
	private Float bredth;
	
	public Float getLength() {
		return length;
	}
	
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getBredth() {
		return bredth;
	}
	
	public void setBredth(Float bredth) {
		this.bredth = bredth;
	}
}
