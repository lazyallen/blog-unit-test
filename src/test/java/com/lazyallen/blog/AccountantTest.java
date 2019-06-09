package com.lazyallen.blog;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;



/**
 * @author allen
 * @Date 2019-06-09
 */
public class AccountantTest {

	@Mock
	Calculator calculator;

	@InjectMocks
	Accountant accountant;

	@Before
	public void setUp() throws Exception {
		// 初始化测试用例类中由Mockito的注解标注的所有模拟对象
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCalculateSalary() {
		when(calculator.addition(anyDouble(),anyDouble())).thenReturn(20.0);
		when(calculator.multiplication(anyDouble(),anyDouble())).thenReturn(16.0);
		Double salary = accountant.calculateSalary(10.0,10.0);
		assertThat(salary,is(16.0));
	}

}