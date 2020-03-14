package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate2 {
	
	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		LocalDate d2=LocalDate.of(2017,11,30);
		LocalDate d3=LocalDate.parse("2017-11-30",DateTimeFormatter.ISO_DATE);
		System.out.println("Date 1= "+d1);
		System.out.println("Date 2= "+d2);
		System.out.println("Date 3= "+d3);
		
		
		LocalDate ld=LocalDate.of(2017,12, 30);
		LocalDate ld2=ld.plusMonths(2);
		System.out.println(ld); //muestra 2017-12-30
		System.out.println(ld2); //muestra 2018-1-1
		
		LocalDate ld3=ld.plusDays(6);
		System.out.println(ld3); //muestra 2018-1-1
		
		LocalDate lda=LocalDate.of(1984,3, 6);
		LocalDate ld3=ld.plusDays(6);
		System.out.println(ld3); //muestra 2018-1-1
		
	}

}
