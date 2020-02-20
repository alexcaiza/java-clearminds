package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeParse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		ldt = LocalDateTime.parse("2019-03-22T00:24:00");
		
		System.out.println(ldt);
		

	}

}
