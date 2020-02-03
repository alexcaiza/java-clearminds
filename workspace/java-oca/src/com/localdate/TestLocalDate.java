package com.localdate;

import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		
		LocalDate date1 = date.plusDays(10);
		LocalDate date2 = date.plusMonths(3);
		LocalDate date3 = date.plusYears(1);
		
		System.out.println("date: " + date);
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println("date3: " + date3);
		
		date = LocalDate.parse("2020-02-03");
		
		System.out.println("getDayOfWeek: " + date.getDayOfWeek());
		System.out.println("getDayOfMonth: " + date.getDayOfMonth());
		System.out.println("getDayOfYear: " + date.getDayOfYear());

	}

}
