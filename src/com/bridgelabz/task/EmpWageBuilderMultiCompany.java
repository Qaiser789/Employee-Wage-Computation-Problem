package com.bridgelabz.task;

public class EmpWageBuilderMultiCompany {
	
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	
	public static int computeEmpWage(String company, int empRatePerHour,
			int numOfWorkingDays, int maxHoursPerMonth) {
		
		// Variables
		
		int empHrs = 0;
		int totalEmpHrs = 0 ;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth &&
				totalWorkingDays < numOfWorkingDays ) {
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
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for company: " + company+" is: "+ totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[]args) {
		computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
		
	}

}
