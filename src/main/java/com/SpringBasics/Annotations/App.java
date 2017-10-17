package com.SpringBasics.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.SpringBasics.Annotations")
public class App {
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Rectangle rectangle = context.getBean(Rectangle.class);
		rectangle.draw();
		((ConfigurableApplicationContext) context).close();
		
	}
}
