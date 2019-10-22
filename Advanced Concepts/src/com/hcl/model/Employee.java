package com.hcl.model;

public class Employee {

	private String empId;
	private String empName;
	private int salary;

	
	
	public Employee() {
	}

	public Employee(String empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
