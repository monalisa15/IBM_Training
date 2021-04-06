package com.ibm.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class testExample {
     private static Example maths;

	@BeforeAll
	public static void setup() {

		maths = new Example();

	}

	@Test
	public void testAdd() {

		assertEquals(10, maths.add(5, 5));

	}
	@Test
	public void testSubs() {

		assertEquals(10, maths.subs(20, 10));

	}
	@Test
	public void testDiv() {

		assertEquals(3, maths.div(9, 3));

	}

	@Test
	public void testZeroDiv() {

		assertThrows(ArithmeticException.class, () -> maths.div(2,0));

	}
	@Test
	public void testSquare() {

		assertEquals(25, maths.square(5));

	}
	@Test
	public void testIncorrectSquare() {

		assertNotEquals(10, maths.square(3));

	}

}
