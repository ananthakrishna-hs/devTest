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
		assertEquals(65, app.add(40, 25));
	}

	@Test
	public void addFail() {
		assertNotEquals(35, app.add(37, 13));

	}
	
	@Test
	public void addZero() {
		assertEquals(0, app.add(0, 0));
	}

	@Test
	public void subTrue() {
		assertEquals(3, app.sub(16, 13));
	}

	@Test
	public void subFail() {
		assertNotEquals(2, app.sub(16, 13));
	}
	
	@Test
	public void subNegativeTrue() {
		assertEquals(-13, app.sub(0, 13));
	}

	@Test
	public void mulTrue() {
		assertEquals(25, app.mul(5, 5));
	}
	
	@Test
	public void mulZeroTrue() {
		assertEquals(0, app.mul(10000, 0));
	}

	
	@Test
	public void mulFail() {
		assertNotEquals(56, app.mul(5, 6));
	}
	

	@Test
	public void divTrue() {
		assertEquals(1, app.div(12, 12));
	}

	@Test
	public void divFail() {
		assertNotEquals(1, app.div(24, 12));
	}

}
