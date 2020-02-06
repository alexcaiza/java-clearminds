package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try {
			LocalDate date2 = LocalDate.parse("2020-01-31"); 
			System.out.println("date2: " + date2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			LocalDate date3 = LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE); 
			System.out.println("date3: " + date3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			LocalDate date4 = LocalDate.parse("2020-01-31T12:30:59"); 
			System.out.println("date4: " + date4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			LocalDate date5 = LocalDate.parse("2020-01-31T12:30:59", DateTimeFormatter.ISO_DATE_TIME); 
			System.out.println("date5: " + date5);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
