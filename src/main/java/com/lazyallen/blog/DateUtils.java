package com.lazyallen.blog;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author allen
 * @Date 2019-06-09
 */
public class DateUtils {

	public static int getCurrentMonth(){
		LocalDate now = LocalDate.now();
		return now.getMonthValue();
	}
}
