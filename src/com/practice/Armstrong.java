package com.practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a digit :");
		int digit = sc.nextInt();

		int r = 0;
		int count = 0;
		int orginal = digit;
		int temp = digit;
		int arm = 0;
		
		if (temp == 0) {
			count++;
		} else {
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			
			
			temp = digit;
			while (temp > 0) {
				r = temp % 10;
				int power = 1;

				for (int i = 1; i <= count; i++) {
					power = power * r;
				}
				
				arm = arm + power;
				temp = temp / 10;
			}
		}
		
		if (arm == orginal) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not a armstrong");
		}
	}

}
