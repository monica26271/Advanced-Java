package org.kodnest.spring01;

import org.kodnest.bean.Laptop;
import org.kodnest.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
//    	Student s=(Student) context.getBean("s1");
//    	System.out.println("----> object created by spring = "+s);
    	Laptop l1=(Laptop) context.getBean("l1");
    	Laptop l2=(Laptop) context.getBean("l2");

    	System.out.println("----> object created by spring = "+l1);
    	System.out.println("----> object created by spring = "+l2);
    	
    }
}
