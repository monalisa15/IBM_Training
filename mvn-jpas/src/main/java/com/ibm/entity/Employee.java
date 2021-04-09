package com.ibm.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name ="employee")

public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	
	@Column(length = 30)
	private String empname;
	private double salary;
	
	@ManyToOne
	@JoinColumn(name ="deptId")
	private Department dept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	

}
