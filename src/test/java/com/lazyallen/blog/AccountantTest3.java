package com.lazyallen.blog;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

/**
 * @author allen
 * @Date 2019-06-09
 */
@RunWith(MockitoJUnitRunner.class)
public class AccountantTest3 {

	@Mock
	Calculator calculator;

	@InjectMocks
	Accountant accountant;

	@Test
	public void testCalculateSalary() {
		when(calculator.addition(anyDouble(),anyDouble())).thenReturn(20.0);
		when(calculator.multiplication(anyDouble(),anyDouble())).thenReturn(16.0);
		Double salary = accountant.calculateSalary(10.0,10.0);
		assertThat(salary,is(16.0));
	}

	@Test(expected = NullPointerException.class)
	public void testCalculateSalary1(){
		when(calculator.addition(anyDouble(),anyDouble())).thenReturn(100.0).thenThrow(new NullPointerException());
		Double mockResult = calculator.addition(10.0,10.0);
		System.out.println("mockResult"+mockResult);
		calculator.addition(10.0,10.0);

	}

	@Test
	public void testMockIterator() {
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("hello","world");
		//when(i.next()).thenReturn("hello").thenReturn("world");
		String result = i.next() + " " + i.next();
		assertThat(result,is("hello world"));
	}

	@Test
	public void testVerify() {
		Calculator mock = mock(Calculator.class);
		when(mock.addition(anyDouble(),anyDouble())).thenReturn(2.0);

		mock.addition(1.0,1.0);
		mock.version();
		mock.version();

		//比如说写Controller的单元测试，验证service方法是否调用
		verify(mock, times(2)).version();
		verify(mock, never()).multiplication(anyDouble(),anyDouble());
		verify(mock, atLeastOnce()).version();
		verify(mock, atLeast(2)).version();
		verify(mock, atMost(3)).version();;
	}

	@Test
	public void testDifferMockSpy() {
		List mock = mock(ArrayList.class);
		mock.add("one");
		verify(mock).add("one");
		System.out.println("mock[0]:"+mock.get(0));

		List spy = spy(new ArrayList());
		spy.add("one");
		verify(spy).add("one");
		System.out.println("spy[0]:"+spy.get(0));
		when(spy.size()).thenReturn(100);
		System.out.println("spy.size:"+spy.size());

	}


}
