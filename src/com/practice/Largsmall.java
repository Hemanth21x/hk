package com.practice;

import java.util.Scanner;

public class Largsmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		int r=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(n>0) {
			r=n%10;
			if(r<min) {
				min=r;
			}
			if( r> max) {
				max=r;
			}
			n=n/10;
		}
		System.out.println("min value in digit :"+min);
		System.out.println("max value in digit :"+max);

	}

}
