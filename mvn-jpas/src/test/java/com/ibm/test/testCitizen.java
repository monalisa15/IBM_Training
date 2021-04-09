package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CitizenDao;
import com.ibm.entity.Citizen;

public class testCitizen {
	
private static CitizenDao cdao;
	
	@BeforeAll
	public static void setup()
	{
		cdao = new CitizenDao();
	}
	
	@Test
	public void testCitizenAdd()
	{
		Citizen c = new Citizen();
		c.setName("Mona");
        assertNotEquals(0,cdao.addCitizen(c));
	}
	

}
