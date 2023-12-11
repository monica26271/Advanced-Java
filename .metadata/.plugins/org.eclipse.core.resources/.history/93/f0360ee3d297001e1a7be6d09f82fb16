package org.kodnest.hibernate_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike1 {
	@Id
	int regNumber;
	String model;
	double price;
	
	@OneToOne
	Student1 student;
	
	public Bike1() {
		super();
	}

	public Bike1(int regNumber, String model, double price, Student1 student) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.price = price;
		this.student = student;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Student1 getStudent() {
		return student;
	}

	public void setStudent(Student1 student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Bike1 [regNumber=" + regNumber + ", model=" + model + ", price=" + price + ", student=" + student + "]";
	}


}
