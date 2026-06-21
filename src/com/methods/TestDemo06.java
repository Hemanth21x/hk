package com.methods;

import java.util.Scanner;

public class TestDemo06 {

	public void rev(int n) {
		int sum = 0;
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("rev is : " + rev);
		System.out.println("digit sum is : " + sum);
	}
	
	public boolean  isarm(int n) {
		int sum =0;
		int temp=n;
		int r = 0;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
//		n=temp;
		while(n>0) {
			r=n%10;
			sum=sum+(int)Math.pow(r,count);
			n=n/10;
		}
		
		return temp==sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the digit :");
		int n = sc.nextInt();

		TestDemo06 ref = new TestDemo06();

		ref.rev(n);
		
		boolean result=ref.isarm(n);
		if(result) {
			System.out.println("ArmStrong");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
