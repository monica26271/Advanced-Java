package com.kn.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	List<String> technologies;
	Set<String> projects;
	Map<String,String> organization;
	
	public Employee(List<String> technologies, Set<String> projects, Map<String, String> organization) {
		super();
		this.technologies =technologies;
		this.projects = projects;
		this.organization = organization;
	}
	public Employee() {
		super();
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getOrganization() {
		return organization;
	}
	public void setOrganization(Map<String, String> organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", organization=" + organization
				+ "]";
	}
	

}
