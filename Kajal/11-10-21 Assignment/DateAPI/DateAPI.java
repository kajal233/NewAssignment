package com.demo2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
//2.	Write a java class to find the date of next month second Sunday by using java time API.  Using java 8 data api.

public class DateAPI {
	public static void main(String args[]) {
	LocalDate current = LocalDate.now(ZoneId.of("Pacific/Easter"));
    LocalDate secondSundayOfNextMonth = current.plusMonths(1)
            .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
    System.out.println("Second sunday of next month" +   secondSundayOfNextMonth);
   
}}
