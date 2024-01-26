package com.bridgelabz.task;

public class EmpWageBuilderObject {
	
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmpWageBuilderObject(String company, int empRatePerHour,
			int numOfWorkingDays, int maxHoursPerMonth) {		
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void computeEmpWage() {
		
		int empHrs =0;
		int totalEmpHrs =0;
		int totalWorkingDays =0;
		
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
	}
	public static void main(String[]args) {
		EmpWageBuilderObject dMart =  new EmpWageBuilderObject("DMart", 20, 2, 10);
		EmpWageBuilderObject reliance =  new EmpWageBuilderObject("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}

}
