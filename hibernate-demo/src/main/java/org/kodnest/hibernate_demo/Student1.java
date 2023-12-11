package org.kodnest.hibernate_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student1 {
	@Id
	int id;
	String name;
	int marks;
	@OneToOne
	Bike1 bike;
	
	public Student1() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Bike1 getBike() {
		return bike;
	}

	public void setBike(Bike1 bike) {
		this.bike = bike;
	}

	public Student1(int id, String name, int marks, Bike1 bike) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + ", bike=" + bike + "]";
	}
	
	
	



}
