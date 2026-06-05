package com.practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		int r=0;
		int sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			int power=1;
			for(int i=1;i<=r;i++) {
				power=i*power;
			}
			sum=sum+power;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("strong number");
		}else {
			System.out.println("not strong number");
		}
		
		

	}

}
