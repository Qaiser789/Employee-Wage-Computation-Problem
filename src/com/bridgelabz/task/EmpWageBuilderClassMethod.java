package com.bridgelabz.task;

public class EmpWageBuilderClassMethod {
	
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Of_Working_Days = 2;
	public static final int Max_Hrs_In_Month = 10;

	public static int computeEmpWage() {
		
		// Variables
		
		int empHrs = 0;
		int totalEmpHrs = 0 ;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= Max_Hrs_In_Month &&
				totalWorkingDays < Num_Of_Working_Days ) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()* 10) % 3;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+ totalWorkingDays + "Emp hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[]args) {
		computeEmpWage();
	}

}
