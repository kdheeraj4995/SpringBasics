package com.practice.SpringBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.practice.SpringBasics")
public class App {
	public static void main(String[] args) {

		/*ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		((ClassPathXmlApplicationContext) context).close();*/

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Rectangle rectangle = context.getBean(Rectangle.class);
		rectangle.draw();
		((ConfigurableApplicationContext) context).close();
		
	}
}
