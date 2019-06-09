package com.lazyallen.blog;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class AccountantTest2 {


	Calculator calculator;
	Accountant accountant;

	@Before
	public void setUp() throws Exception {
		calculator = mock(Calculator.class);
		accountant = new Accountant(calculator);

	}

	@Test
	public void testCalculateSalaryUseMockMethod() {
		when(calculator.addition(anyDouble(),anyDouble())).thenReturn(20.0);
		when(calculator.multiplication(anyDouble(),anyDouble())).thenReturn(80.0);
		Double salary = accountant.calculateSalary(10.0,10.0);
		assertThat(salary,is(80.0));
	}
}
