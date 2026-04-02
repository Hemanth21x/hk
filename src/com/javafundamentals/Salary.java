package com.javafundamentals;
  import java.util.Scanner;
public class Salary {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the salary : ");
			double salary =sc.nextDouble();
			System.out.println("your pf: ");
			double pfp =sc.nextDouble();
			System.out.println("your allowance: ");
			double allowanced =sc.nextDouble();
			System.out.println("working days: ");
			double Workingdays =sc.nextDouble();
	
			double pf= (salary/100)*pfp;
			double  allowance = allowanced*Workingdays;
			double netsalary= salary+allowanced-pf;
			
			System.out.println("pf: "+pf);
			System.out.println("allowance: "+allowance);
			System.out.println("net salary :"+netsalary);
			
			
		
			}

}
