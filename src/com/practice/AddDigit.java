package com.practice;
import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a dight :");
		int digit=sc.nextInt();
		
		int r=0;
	    int sum=0;
	    
	    while(digit>0) {
	    	r=digit%10;
	    	digit=digit/10;
	    	sum=sum+r;
	    }
		System.out.println("Sum of digit :"+sum);

	}

}
