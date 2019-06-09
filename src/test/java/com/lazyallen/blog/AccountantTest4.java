package com.lazyallen.blog;

import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

/**
 * @author allen
 * @Date 2019-06-09
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({DateUtils.class,Accountant.class})
public class AccountantTest4 {

	@Mock
	Calculator calculator;

	@InjectMocks
	Accountant accountant;

	@Before
	public void init(){
		PowerMockito.mockStatic(DateUtils.class);

	}

	@Test
	public void testCalculateOddMonthSalary(){
		PowerMockito.when(DateUtils.getCurrentMonth()).thenReturn(7);
		when(calculator.addition(anyDouble(),anyDouble())).thenReturn(20.0);
		when(calculator.multiplication(anyDouble(),anyDouble())).thenReturn(16.0);
		Double salary = accountant.calculateOddMonthSalary(10.0,10.0);
		assertThat(salary,is(16.0));
	}

	@Test
	public void testPrivate() throws Exception {
		Accountant accountant1 = PowerMockito.spy(new Accountant());
		PowerMockito.when(accountant1, "sayHello").thenReturn("你好");
		accountant1.printSayHello();
	}


}
