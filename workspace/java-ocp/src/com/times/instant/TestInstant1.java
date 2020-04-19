package com.times.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TestInstant1 {
	
	public static void main(String[] args) throws Exception {
		Instant loginTime = Instant.now();
		
		Thread.sleep(1000);
		
		Instant logoutTime = Instant.now();
		
		System.out.println("loginTime: " + loginTime);
		System.out.println("logoutTime: " + logoutTime);
		
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		
		System.out.println("loginTime: " + loginTime);
		System.out.println("logoutTime: " + logoutTime);
		
		if (logoutTime.isAfter(loginTime)) {
			System.out.println("Logged out at: " + logoutTime);
		} else {
			System.out.println("Can't loggout");
		}
	}

}
