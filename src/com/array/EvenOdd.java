package com.array;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evencount=0;
		int oddcount=0;
		
		System.out.println("Enter the array size : ");
		int size =sc.nextInt();
		int [] a = new int[size];
		
		System.out.println("Enter array numbers : ");
		
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}

	    
	    for(int i =0;i<size;i++) {
	    if(a[i]%2==0) {
	    	evencount++;
	    }else {
	    	oddcount++;
	    }
	  }
	    System.out.println("Even numbers count :"+evencount);
	    System.out.println("Odd numbers count : "+oddcount);
        sc.close();
	}

}
