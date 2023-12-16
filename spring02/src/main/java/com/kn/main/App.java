package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Employee;

public class App {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
        Employee e1=(Employee) context.getBean("e1");
        System.out.println(e1);
	}

}
