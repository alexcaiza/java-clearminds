package com.javaapis;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimePeriodMinus {

    public static void main(String[] args) {

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        
        Period p = Period.of(1, 2, 3);

        System.out.println(d.format(f1));

        d = d.minus(p);
        
        System.out.println(d.format(f1));
    }

}
