package com.ibm.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name ="dept")
public class Department {
	@Id
	private int deptId;
	@Column(length =15)
	private String deptName;
	
	@OneToMany(mappedBy = "dept" ,fetch = FetchType.EAGER , cascade = CascadeType.REMOVE )
	private List<Employee> emps;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	

}
