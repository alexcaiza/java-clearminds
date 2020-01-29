package com.cert;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_DayOfMonth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        
        System.out.println(date.getYear()+ " " + date.getMonth() + " " +  date.getDayOfMonth());
                
        //Error de ejecucion
        //Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
        
    }

}
