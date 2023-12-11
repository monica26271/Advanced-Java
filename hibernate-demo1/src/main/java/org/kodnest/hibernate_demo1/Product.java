package org.kodnest.hibernate_demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int product_Id;
	String product_Name;
	int cost;
	
	@ManyToOne
	Customer customer;
	
	
	public Product(int product_Id, String product_Name, int cost) {
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.cost = cost;
	}

	public Product() {
		super();
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", cost=" + cost + ", customer="
				+ customer + "]";
	}
	
	
	

}
