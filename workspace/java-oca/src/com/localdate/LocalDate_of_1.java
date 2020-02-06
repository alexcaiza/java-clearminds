package com.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDate_of_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
        
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        
        System.out.println(date.format(f1));
        
        System.out.println(date.getYear()+ " " + date.getMonth() + " " +  date.getDayOfMonth());
                
        //Error de ejecucion
        //Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
        
    }

}
