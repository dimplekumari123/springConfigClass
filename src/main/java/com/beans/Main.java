package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StuConfig.class);
     StudentDao d=(StudentDao)context.getBean("studentDaoImpl");
     Student s=d.getStuById(2);
     System.out.println(s.toString());
	}

}
