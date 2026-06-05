package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a digit :");
		int digit=sc.nextInt();
		
		int r=0;
		int orginal= digit;
		int rev=0;
		while(digit>0) {
			r=digit%10;
			digit=digit/10;
			rev=rev*10+r;
		}
		if(rev==orginal) {
			System.out.println("palindrome number!");
		}else {
			System.out.println("not a palindrome number!");
		}
	}

}
