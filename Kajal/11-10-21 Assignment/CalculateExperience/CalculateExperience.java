package com.demo3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateExperience {


public static void main(String[] args) 
{ 
	LocalDate joiningdate = LocalDate.of(2020, Month.MAY, 19);
LocalDate today = LocalDate.now();
Period age = Period.between(joiningdate, today);
int years = age.getYears();
int months = age.getMonths(); 
int days =age.getDays();
System.out.println("number of years: " + years);
System.out.println("number of months: " + months);
System.out.println("number of days: " + days);
} }

