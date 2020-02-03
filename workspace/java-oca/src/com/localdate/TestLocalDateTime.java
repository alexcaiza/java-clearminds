package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime datetime = LocalDateTime.now();
		
		LocalDateTime date1 = datetime.plusDays(10);
		LocalDateTime date2 = datetime.plusMonths(3);
		LocalDateTime date3 = datetime.plusYears(1);
		
		System.out.println("date: " + datetime);
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println("date3: " + date3);
		
		datetime = LocalDateTime.parse("2020-02-03T12:30:59.000");
		
		System.out.println("getDayOfWeek: " + datetime.getDayOfWeek());
		System.out.println("getDayOfMonth: " + datetime.getDayOfMonth());
		System.out.println("getDayOfYear: " + datetime.getDayOfYear());
		System.out.println("getHour: " + datetime.getHour());
		System.out.println("getMinute: " + datetime.getMinute());
		System.out.println("getSecond: " + datetime.getSecond());
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		datetime = date.atTime(time);
		
		System.out.println("datetime: " + datetime);
		
		datetime = date.atTime(10, 5);
		
		System.out.println("datetime: " + datetime);
		

	}

}
