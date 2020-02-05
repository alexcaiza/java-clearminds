package com.localdate;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimePeriodOfDaysOfYears {

    public static void main(String[] args) {

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f1));
        
        Period p;
        
        //p = Period.ofDays(1);
        //p = Period.ofYears(2);
        p = Period.ofDays(1).ofYears(2);

        d = d.minus(p);
        
        System.out.println(d.format(f1));

        
    }

}
