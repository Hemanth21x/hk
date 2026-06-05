package com.practice;
import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a digit :");
		int digit=sc.nextInt();
		
		int r=0;
		int rev=0;
		
		while(digit>0) {
			r=digit%10;
			digit=digit/10;    //360  r 0  //36  r 6 //3 r 0
			
			rev=r+rev*10;
		}
		System.out.println("reverse digit is :"+rev);

	}

}
