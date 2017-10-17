package com.SpringBasics.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		((ClassPathXmlApplicationContext) context).close();
	}
}
