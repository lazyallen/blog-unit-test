package com.lazyallen.blog;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class Accountant {
	private static final Double tax = 0.2;
	Calculator calculator;

	public Double calculateSalary(Double a, Double b){
		Double entireSalary = calculator.addition(a,b);
		Double deservedSalary = calculator.multiplication(entireSalary,(1-tax));
		return deservedSalary;
	}

	public Double calculateOddMonthSalary(Double a, Double b){
		int month = DateUtils.getCurrentMonth();
		if(month%2!=0){
			Double entireSalary = calculator.addition(a,b);
			Double deservedSalary = calculator.multiplication(entireSalary,(1-tax));
			return deservedSalary;
		}
		return 0.0;
	}

	private String sayHello(){
		System.out.println("hello");
		return "hello";
	}

	public void printSayHello(){
		String hello = this.sayHello();
		System.out.println(hello);
	}

	public Accountant(Calculator calculator) {
		this.calculator = calculator;
	}

	public Accountant() {
	}
}
