package com.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDatePlusDaysplusYears {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        LocalDate date2 = LocalDate.of(2018, 4, 30);
        
        System.out.println(date.getYear()+ " " + date.getMonth() + " " +  date.getDayOfMonth());
        
        date.plusDays(2);
        date.plusYears(3);
        
        System.out.println(date.getYear()+ " " + date.getMonth() + " " +  date.getDayOfMonth());
        
        System.out.println(date2.getYear()+ " " + date2.getMonthValue() + " " +  date2.getDayOfMonth());

    }

}
