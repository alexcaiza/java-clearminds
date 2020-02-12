package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		
		System.out.println("date: " + date);
		System.out.println("DateTimeFormatter.ISO_DATE: " + date.format(DateTimeFormatter.ISO_DATE));
		
		LocalDateTime datetime = LocalDateTime.now();
				
		System.out.println("datetime: " + datetime);
		System.out.println("DateTimeFormatter.ISO_DATE_TIME: " + datetime.format(DateTimeFormatter.ISO_DATE_TIME));
		
		try {
			String strDateTime = date.format(DateTimeFormatter.ISO_DATE_TIME); 
			System.out.println("strDateTime: " + strDateTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			String strDate = datetime.format(DateTimeFormatter.ISO_DATE); 
			System.out.println("strDate: " + strDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			LocalDate date1 = LocalDate.parse("2020-01-31T12:30:59", DateTimeFormatter.ISO_DATE_TIME); 
			System.out.println("strDate: " + date1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
