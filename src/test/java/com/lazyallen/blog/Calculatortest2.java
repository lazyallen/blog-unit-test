package com.lazyallen.blog;

import org.junit.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class Calculatortest2 {

	public Calculatortest2() {
		System.out.println("Constructor");
	}

	@BeforeClass
	public static void beforeThis() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void afterThis() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void evaluate() throws Exception {
		Calculator calculator = new Calculator();
		Double sum = calculator.addition(1.0,1.0);
		assertThat(sum, is(2.0));
		System.out.println("Test evaluate");
	}

	@Test
	public void idiot() throws Exception {
		System.out.println("Test idiot");
	}

	@Ignore
	public void ignoreMe() throws Exception {
		System.out.println("Ignore");
	}
}
