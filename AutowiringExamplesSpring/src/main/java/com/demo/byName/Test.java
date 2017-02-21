package com.demo.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("Spring.xml");
		Customer customer=(Customer) apc.getBean("customer");
		System.out.println(customer);

	}

}
