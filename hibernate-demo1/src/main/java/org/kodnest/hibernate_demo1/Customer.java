package org.kodnest.hibernate_demo1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int customer_Id;
	String customer_Name;
	int age;
	
	@OneToMany
	List<Product> product;

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	
	public Customer() {
		super();
	}


	public Customer(int customer_Id, String customer_Name, int age) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", age=" + age
				+ ", product=" + product + "]";
	}
	
	

}
