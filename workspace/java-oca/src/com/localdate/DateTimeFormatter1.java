<<<<<<< HEAD
package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {

	public static void main(String[] args) {
		
		String date = LocalDate
				.parse("2014-05-04")
				.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(date);
		
		LocalDate d1 = LocalDate.parse("2020-01-01", DateTimeFormatter.ISO_DATE);
		
		String str1 = d1.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(str1);

	}

}
=======
package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {

	public static void main(String[] args) {
		
		String date = LocalDate
				.parse("2014-05-04")
				.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(date);
		
		String date2 = LocalDate
            .parse("2018-04-30")
            .format(DateTimeFormatter.ISO_DATE);
    
    System.out.println(date);

	}

}
>>>>>>> branch 'master' of git@github.com:alexcaiza/java-clearminds.git
