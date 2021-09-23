package com.inheritance;

public class MainAbsClass {

	public static void main(String ar[]) {

		Salary salary = new Salary("ram", "delhi", "92659856", 5265985.00);

		salary.mailCheck();//salary class method
		
		Employee employee= new Salary("tom", "UP", "858548754", 526.00);
		
		employee.mailCheck();
	}

}
