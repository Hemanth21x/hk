package com.array;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		
	    System.out.println("Enter the array size : ");
		int size =sc.nextInt();
		int [] a = new int[size];
		
		
		System.out.println("Enter the array Numbers : ");
		
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number to check frequency : ");
		int number =sc.nextInt();
		
		
		for(int i=0;i<size;i++) {
			if(number==a[i]) {
				count++;
			}
		}
		System.out.println("your entered number Frequency is : "+count);
sc.close();
	}

}
