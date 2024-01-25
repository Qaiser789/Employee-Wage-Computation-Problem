package com.bridgelabz.task;

public class EmpWageBuilder {
	
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;

	public static void main(String[] args) {
		
		// Variables
		
		int empHrs = 0;
		int empWage = 0 ;
		
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case Is_Part_Time:
				empHrs = 4;
				break;
			case Is_Full_Time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("Emp Wage: " + empWage);

	}

}
