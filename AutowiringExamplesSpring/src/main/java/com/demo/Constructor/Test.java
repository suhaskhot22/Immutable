package com.demo.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext apc=new ClassPathXmlApplicationContext("Spring.xml");
Categories ct=(Categories) apc.getBean("category");
ct.show();
	}

}
