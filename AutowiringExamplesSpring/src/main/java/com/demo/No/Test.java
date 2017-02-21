package com.demo.No;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext apc=new ClassPathXmlApplicationContext("Spring.xml");
		Student student=(Student) apc.getBean("student");
		System.out.println("RollNo="+student.getRollNo()+"\nName="+student.getName()+"\nAge="+student.getAge()+"\nCityName="+student.getAddress().getCityName()+"\nAreaName"+student.getAddress().getAreaName());
		
	}

}
