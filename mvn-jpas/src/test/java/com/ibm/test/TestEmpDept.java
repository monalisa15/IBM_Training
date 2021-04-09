package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {

	private static EmpDeptDao edao;
	
	@BeforeAll
	public static void setup()
	{
		edao = new EmpDeptDao();
	}
	
	@Test
	public void testEmpAdd()
	{
		Employee e = new Employee();
		e.setEmpname("Mona");
		e.setSalary(30000);
		assertNotEquals(0,edao.addEmp(e,10));
		System.out.println(e);
	}
	
	@Test
	public void testDeptAdd()
	{
		Department d = new Department();
		d.setDeptName("HR");
	    d.setDeptId(18);
	    assertEquals(18,edao.addDept(d));
	    System.out.println(d);
	}
	
	@Test
	public void testFindDept()
	{
		Department d = edao.findDept(18);
		assertNotNull(d);
		System.out.println(d);
		d.getEmps().forEach(System.out::println);
	}
	
	@Test
	public void testRemoveDept()
	{
		assertTrue(edao.removeDept(15));
	}
	
	
	
	
	
	
	
	
	
	
}
