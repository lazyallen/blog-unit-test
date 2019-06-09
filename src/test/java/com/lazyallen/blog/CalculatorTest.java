package com.lazyallen.blog;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test(timeout = 100)
	public void testAddition() {

		Double additionResult = calculator.addition(1.0,1.0);
		assertThat(additionResult,is(2.0));
	}

	@Test(expected = NullPointerException.class)
	public void testAdditionNPE() {
		calculator.addition(null,null);
	}

}