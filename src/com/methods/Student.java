package com.methods;
import java.util.Scanner;
public class Student {
	static double calculate(int m1,int m2,int m3,int m4,int m5) {
		int total=m1+m2+m3+m4+m5;
		double percentage=total/5.0;
		return percentage;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mathematics marks : ");
		int m1=sc.nextInt();
		
		System.out.println("Enter Science marks : ");
		int m2=sc.nextInt();
		
		System.out.println("Enter English marks : ");
		int m3=sc.nextInt();
		
		System.out.println("Enter Social marks : ");
		int m4=sc.nextInt();
		
		System.out.println("Enter Telugu marks : ");
		int m5=sc.nextInt();
		
		double percentage = calculate(m1,m2,m3,m4,m5);
		
		System.out.println("Total marks : "+(m1+m2+m3+m4+m5));
		System.out.println("percentage :"+percentage+"%");
	
		
	}

}
