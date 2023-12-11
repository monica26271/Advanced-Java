package org.kodnest.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Bike1 b1=new Bike1();
    	Bike1 b2=new Bike1();
    	Bike1 b3=new Bike1();
    	
    	Student1 s1=new Student1(1,"Nandish",95,b2);
    	Student1 s2=new Student1(2,"Ajay",100,b1);
    	Student1 s3=new Student1(3,"Monica",100,b3);
    	
    	b1.setRegNumber(1);
    	b1.setModel("KTM");
    	b1.setPrice(1356465.2);
    	b1.setStudent(s2);
    	
    	b2.setRegNumber(2);
    	b2.setModel("RE");
    	b2.setPrice(1367265.2);
    	b2.setStudent(s1);
    	
    	b3.setRegNumber(3);
    	b3.setModel("Pulsar");
    	b3.setPrice(131325.2);
    	b3.setStudent(s3);
    	
    	Configuration con=new Configuration();
    	con.configure();
    	
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	txn.commit();
    	System.out.println();
    	System.out.println("----> "+s1+"data stored to db sucessfully");
    	System.out.println("----> "+s2+"data stored to db sucessfully");
    	System.out.println("----> "+s3+"data stored to db sucessfully");
    	
    	
    	
    	
    }
}
