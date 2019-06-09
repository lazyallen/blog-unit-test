package com.lazyallen.blog;

import java.util.Objects;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class Calculator {


	public Double addition(Double x,Double y){
		if (Objects.isNull(x) || Objects.isNull(y)) {
			throw new NullPointerException("参数不能为空");
		}
		return x+y;
	}

	public Double division(Double x, int y){
		if (0==y){
			throw new IllegalArgumentException("除数y不能为0");
		}
		return x/y;
	}

	public Double multiplication(Double x, Double y){
		if (Objects.isNull(x) || Objects.isNull(y)) {
			throw new NullPointerException("参数不能为空");
		}
		return x*y;
	}

	public void version(){
		System.out.printf("v1.0");
	}
}
