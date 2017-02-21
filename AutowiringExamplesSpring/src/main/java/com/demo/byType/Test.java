package com.demo.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc=new ClassPathXmlApplicationContext("Spring.xml");
		Categories c=(Categories) apc.getBean("category");
		c.show();

	}

}
