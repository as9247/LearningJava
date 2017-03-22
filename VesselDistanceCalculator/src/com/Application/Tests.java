package com.Application;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

public class Tests {

	/*SecaMethods sM;

	@Before
	public void SecaMethods() {
		sM = new SecaMethods();
	}

	@Test
	public double speedCalculatorTest() {
		assertEquals(sM.speedCalculator()14.5, 24 == 348);
	}*/

	@Test
	public void test(){
		MethodsNotInSeca test = new MethodsNotInSeca();
		double output = test.speedCalculator();
		assertEquals(348, output);
	}
	
}
