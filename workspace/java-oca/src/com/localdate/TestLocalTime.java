package com.localdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time = LocalTime.now();
		
		LocalTime time1 = time.plusHours(1);
		LocalTime time2 = time.plusMinutes(3);
		LocalTime time3 = time.plusSeconds(30);
		
		System.out.println("time: " + time);
		System.out.println("time1: " + time1);
		System.out.println("time2: " + time2);
		System.out.println("time3: " + time3);
		
		time = LocalTime.parse("11:30:59.000");
		
		System.out.println("getHour: " + time.getHour());
		System.out.println("getMinute: " + time.getMinute());
		System.out.println("getSecond: " + time.getSecond());

	}

}
