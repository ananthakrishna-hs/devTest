package com.devOps.CalculatorTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.devOps.Calculator.CalculatorApp;

public class CalculatorAppTest {
	CalculatorApp app;

	@Before
	public void init() {
		app = new CalculatorApp();
	}

	@Test
	public void addTrue() {
		assertEquals(65, app.sum(40, 25));
	}

	@Test
	public void addTrue1() {
		assertEquals(100, app.sum(40, 60));
	}

	@Test
	public void addTrue2() {
		assertEquals(1000, app.sum(450, 550));
	}

	@Test
	public void addFail() {
		assertNotEquals(35, app.sum(37, 13));

	}

	@Test
	public void addZero() {
		assertEquals(0, app.sum(0, 0));
	}

	@Test
	public void subTrue() {
		assertEquals(3, app.subtract(16, 13));
	}

	@Test
	public void subFail() {
		assertNotEquals(2, app.subtract(16, 13));
	}

	@Test
	public void subNegativeTrue() {
		assertEquals(-13, app.subtract(0, 13));
	}

	@Test
	public void mulTrue() {
		assertEquals(25, app.multiply(5, 5));
	}

	@Test
	public void mulZeroTrue() {
		assertEquals(0, app.multiply(10000, 0));
	}

	@Test
	public void mulFail() {
		assertNotEquals(0, app.multiply(5, 6));
	}
	
	@Test
	public void mulFail2() {
		assertNotEquals(9090, app.multiply(5, 6));
	}

	@Test
	public void divTrue() {
		assertEquals(1, app.divide(12, 12));
	}

	@Test
	public void divFail() {
		assertNotEquals(1, app.divide(24, 12));
	}

	@Test
	public void divFail1() {
		assertNotEquals(64, app.divide(24, 12));
	}

	@Test
	public void divFail2() {
		assertNotEquals(979, app.divide(24, 12));
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
           app.divide(10, 0);
    }

}
