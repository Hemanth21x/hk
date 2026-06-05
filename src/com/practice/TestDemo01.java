package com.practice;

import java.util.Scanner;

public class TestDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a digit : ");
		int n = sc.nextInt();

		int count = 0;
		int r = 0;
		if (n == 0) {
			count++;
		} else { 
			while (n != 0) {
				r = n % 10;
				n = n / 10;
				count++;
			}
		}

		System.out.println("count " + count);

		sc.close();
	}

}
