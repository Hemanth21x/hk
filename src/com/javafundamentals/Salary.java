package com.javafundamentals;
  import java.util.Scanner;
public class Salary {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the salary : ");
			double salary =sc.nextDouble();
	
			double pf= (salary/100)*3;
			double  allowance = 100*30;
			double netsalary= salary+allowance-pf;
			
			System.out.println("Basic salary" +salary);
			System.out.println("your pf: "+pf);
			System.out.println("your allowance: "+allowance);
			System.out.println("net salary: "+netsalary);
		
			}

}
